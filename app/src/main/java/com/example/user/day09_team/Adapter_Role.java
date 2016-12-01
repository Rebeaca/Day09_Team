package com.example.user.day09_team;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.day09_team.business.Repertory_Roles;
import com.example.user.day09_team.business.Repertory_Weapons;
import com.example.user.day09_team.entity.Role;

import java.util.ArrayList;

/**
 * Created by user on 2016/12/1.
 * 适配器
 */

public class Adapter_Role extends BaseAdapter{
    private Context mContext;//程序上下文对象
    private int mItemLayout;//条目布局
   // private Repertory_Roles mRole;//数据源
    private ArrayList<Role> mRols;
  //  private Repertory_Weapons mWeapon;

    public Adapter_Role(Context mContext, int mItemLayout, ArrayList<Role> mRols) {
        this.mContext = mContext;
        this.mItemLayout = mItemLayout;
        this.mRols = mRols;
    }

    @Override
    public int getCount() {
        return mRols.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       View _View = LayoutInflater.from(mContext).inflate(mItemLayout,parent,false);

        ImageView _imageView = (ImageView) _View.findViewById(R.id.imageView_item);
        TextView _name = (TextView) _View.findViewById(R.id.tv_nme);
        TextView _attack = (TextView) _View.findViewById(R.id.tv_des);

        Role _role = mRols.get(position);

        _imageView.setImageResource(_role.getIcon());
        _name.setText(_role.getName());
        _attack.setText(_role.getAttack()+"");

        return _View;
    }
}
