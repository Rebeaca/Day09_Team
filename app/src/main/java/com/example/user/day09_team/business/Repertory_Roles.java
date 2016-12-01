package com.example.user.day09_team.business;

import com.example.user.day09_team.R;
import com.example.user.day09_team.entity.Doctor;
import com.example.user.day09_team.entity.Magician;
import com.example.user.day09_team.entity.Role;
import com.example.user.day09_team.entity.Soldier;

import java.util.ArrayList;

/**
 * Created by user on 2016/12/1.
 * 角色仓库
 * 封装角色信息
 */

public class Repertory_Roles {

    private ArrayList<Role> mRole;
    public Repertory_Roles() {
        mRole = new ArrayList<Role>();
        mRole.add(new Doctor(R.drawable.doctor,"医生-华佗01",100));
        mRole.add(new Doctor(R.drawable.doctor,"医生-华佗02",120));
        mRole.add(new Doctor(R.drawable.doctor,"医生-华佗03",140));
        mRole.add(new Doctor(R.drawable.doctor,"医生-华佗04",160));
        mRole.add(new Doctor(R.drawable.doctor,"医生-华佗05",180));
        mRole.add(new Doctor(R.drawable.doctor,"医生-华佗06",190));

        mRole.add(new Magician(R.drawable.master,"法师-哈利波特01",250));
        mRole.add(new Magician(R.drawable.master,"法师-哈利波特02",260));
        mRole.add(new Magician(R.drawable.master,"法师-哈利波特03",270));
        mRole.add(new Magician(R.drawable.master,"法师-哈利波特04",280));
        mRole.add(new Magician(R.drawable.master,"法师-哈利波特05",290));

        mRole.add(new Soldier(R.drawable.soldier,"士兵-瑞恩01",200));
        mRole.add(new Soldier(R.drawable.soldier,"士兵-瑞恩02",210));
        mRole.add(new Soldier(R.drawable.soldier,"士兵-瑞恩03",220));
        mRole.add(new Soldier(R.drawable.soldier,"士兵-瑞恩04",230));
        mRole.add(new Soldier(R.drawable.soldier,"士兵-瑞恩05",240));
    }

    public ArrayList<Role> getmRole() {
        return mRole;
    }
   public int getSize(){
       return mRole.size();
   }
}
