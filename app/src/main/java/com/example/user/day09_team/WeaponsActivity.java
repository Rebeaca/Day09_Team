package com.example.user.day09_team;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.user.day09_team.business.Repertory_Weapons;
import com.example.user.day09_team.business.Team;
import com.example.user.day09_team.entity.Role;
import com.example.user.day09_team.entity.Weapon;

import java.util.ArrayList;

public class WeaponsActivity extends AppCompatActivity {
    private ListView weapons_list;
    private Adapter_Weapon mWeaponApapter;
    private ArrayList<Weapon> mData;
    private Weapon mWeapon;
   private Role _Role;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weapons);

        //获取控件
        intent=getIntent();
        weapons_list= (ListView) findViewById(R.id.listView2);
        //添加适配器
        Repertory_Weapons mR=new Repertory_Weapons();
        mData =mR.getmWeapon();
        mWeaponApapter =new Adapter_Weapon(this,R.layout.item_list,mData);
        weapons_list.setAdapter(mWeaponApapter);
        //添加监听事件
        //选择武器
        weapons_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //获取主界面人物的位置信息
                int i=intent.getIntExtra("role",-1);
                //获取角色
                _Role = Team.getInstance().getRole(i);
                //获取武器
                mWeapon=mData.get(position);
                //给人物添加武器
                _Role.setWeapon(mWeapon);
                //返回主界面
                finish();
            }
        });
    }
}
