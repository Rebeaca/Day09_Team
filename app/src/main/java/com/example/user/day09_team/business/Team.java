package com.example.user.day09_team.business;

import android.widget.Toast;

//import com.example.user.day09_team.Constant.Constant;
import com.example.user.day09_team.Callback;
import com.example.user.day09_team.MainActivity;
import com.example.user.day09_team.entity.Role;
import com.example.user.day09_team.entity.Weapon;

import java.util.ArrayList;

/**
 * Created by user on 2016/12/1.
 * 业务类
 * 封装队伍信息
 * 多界面操作，保持数据唯一性
 * 使用单例设计模式
 */

public class Team {
    private Callback mCallback;
    public ArrayList<Role> mTeam;
    private Weapon mWeapon;

    public Weapon getmWeapon() {
        return mWeapon;
    }

    public void setmWeapon(Weapon mWeapon) {
        this.mWeapon = mWeapon;
    }

    private Team() {
        mTeam=new ArrayList<Role>();
    }
    private static Team Instance = new Team();
    public static Team getInstance(){
        return Instance;
    }
    public int TeamCount(){
        return mTeam.size();
    }
    //定义添加队伍成员的方法
    public void add(Role role){
        if (mTeam.size()==4){
            //通知主界面
            if (mCallback!=null){
                mCallback.showMessage();
            }
            return;
        }
        mTeam.add(role);

    }

    public Role getRole(int i){

        return mTeam.get(i);
    }
    //定义方法　　队伍总体攻击力
    public int SumAttack(){
        int sum=0;
        for (int i=0;i<mTeam.size();i++){
            sum+=mTeam.get(i).getAttack();
        }
        return sum;
    }


    //错误数据的回掉，利用接口


    public void setmCallback(Callback mCallback) {
        this.mCallback = mCallback;
    }
}
