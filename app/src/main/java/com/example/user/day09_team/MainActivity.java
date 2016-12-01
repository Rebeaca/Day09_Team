package com.example.user.day09_team;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//import com.example.user.day09_team.Constant.Constant;
import com.example.user.day09_team.business.Repertory_Roles;
import com.example.user.day09_team.business.Team;
import com.example.user.day09_team.entity.Role;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Callback{
    private ImageView iv1,iv2,iv3,iv4,fire1,fire2,fire3,fire4;
    private TextView show;
    private ListView roles_list;
    private Adapter_Role mRoleApapter;
    private ArrayList<Role> mData;
    private Repertory_Roles mR;
    private Team team= Team.getInstance();//
  //  private Layout mLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        init();
        mR=new Repertory_Roles();
        mData =mR.getmRole();
        mRoleApapter =new Adapter_Role(this,R.layout.item_list,mData);
        roles_list.setAdapter(mRoleApapter);
        //给列表添加监听事件
        roles_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //向队伍中添加点选的角色
                Role _Role = mR.getmRole().get(position);
                //添加角色
                team.add(_Role);
                changeUI();
                if (Team.getInstance().TeamCount()==4){
                    return;
                }
                //更改图片显示
              //  roles_list.removeViewAt(position);
                mData.remove(position);
                mRoleApapter.notifyDataSetChanged();


            }
        });


    }
    //更新界面实现全部更新
    @Override
    protected void onResume() {
        super.onResume();
        changeUI();
        //更改文本显示
        show.setText("现有攻击力为： "+team.SumAttack());
    }

    private void changeUI() {
        //for循环便利队伍中的角色
        for (int i=0;i<team.TeamCount();i++){
            Role _Role =team.getRole(i);
            if (_Role != null){
                //根据队伍中的角色的信息更新UI
                switch (i){
                    case 0:
                        //给图片添加监听事件
                        iv1.setOnClickListener(new ImgageListener());
                        updateTeam(_Role,iv1,fire1);
                         iv1.setClickable(true);
                        break;
                    case 1:
                        iv2.setOnClickListener(new ImgageListener());
                        updateTeam(_Role,iv2,fire2);
                        iv2.setClickable(true);
                        break;
                    case 2:
                        iv3.setOnClickListener(new ImgageListener());
                        updateTeam(_Role,iv3,fire3);
                        iv3.setClickable(true);
                        break;
                    case 3:
                        iv4.setOnClickListener(new ImgageListener());
                        updateTeam(_Role,iv4,fire4);
                        iv4.setClickable(true);
                        break;
                }
            }
        }
    }

    private void updateTeam(Role role, ImageView iv1, ImageView fire1) {
        iv1.setBackgroundResource(role.getIcon());
        //双判定
        //判断是否拿了武器
        //判断是否拿的正确
        if (role.isWeaponRight()){
            fire1.setVisibility(View.VISIBLE);
        }else
            fire1.setVisibility(View.INVISIBLE);

    }

    private void init() {
        iv1= (ImageView) findViewById(R.id.imageView1);
        iv2= (ImageView) findViewById(R.id.imageView2);
        iv3= (ImageView) findViewById(R.id.imageView3);
        iv4= (ImageView) findViewById(R.id.imageView4);
        fire1= (ImageView) findViewById(R.id.imageView11);
        fire2= (ImageView) findViewById(R.id.imageView22);
        fire3= (ImageView) findViewById(R.id.imageView33);
        fire4= (ImageView) findViewById(R.id.imageView44);
        show= (TextView) findViewById(R.id.textView);
        roles_list= (ListView) findViewById(R.id.listView1);
        Team.getInstance().setmCallback(this);
    }

    private class ImgageListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //判断是否有角色在该位置====flag
            //界面跳转
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,WeaponsActivity.class);
            switch (v.getId()){
                case R.id.imageView1:
                    intent.putExtra("role",0);
                    break;
                case R.id.imageView2:
                    intent.putExtra("role",1);
                    break;
                case R.id.imageView3:
                    intent.putExtra("role",2);
                    break;
                case R.id.imageView4:
                    intent.putExtra("role",3);
                    break;
            }
                startActivity(intent);
        }
    }
    @Override
    public void showMessage(){
        Toast.makeText(this,"队伍已经满了",Toast.LENGTH_LONG).show();
    }
}
