package com.example.user.day09_team.business;

import com.example.user.day09_team.R;
import com.example.user.day09_team.entity.BigKnife;
import com.example.user.day09_team.entity.MagicArt;
import com.example.user.day09_team.entity.Sword;
import com.example.user.day09_team.entity.Weapon;

import java.util.ArrayList;

/**
 * Created by user on 2016/12/1.
 *武器仓库
 * 封装武器信息
 */

public class Repertory_Weapons {
    private ArrayList<Weapon> mWeapon;
    public Repertory_Weapons() {
        mWeapon = new ArrayList<Weapon>();

        mWeapon.add(new Sword(R.drawable.weapon_01,"aaaaaaaaaaaaaaaaa","刀-1",10));
        mWeapon.add(new Sword(R.drawable.weapon_02,"","刀-2",20));
        mWeapon.add(new Sword(R.drawable.weapon_03,"","刀-3",30));
        mWeapon.add(new Sword(R.drawable.weapon_04,"","刀-4",40));
        mWeapon.add(new Sword(R.drawable.weapon_05,"","刀-5",50));
        mWeapon.add(new MagicArt(R.drawable.weapon_06,"","魔法棒-1",60));
        mWeapon.add(new MagicArt(R.drawable.weapon_07,"","魔法棒-2",70));
        mWeapon.add(new MagicArt(R.drawable.weapon_08,"","魔法棒-3",80));
        mWeapon.add(new MagicArt(R.drawable.weapon_09,"","魔法棒-4",90));
        mWeapon.add(new MagicArt(R.drawable.weapon_10,"","魔法棒-5",100));
        mWeapon.add(new BigKnife(R.drawable.weapon_11,"","剑-11",110));
        mWeapon.add(new BigKnife(R.drawable.weapon_12,"","剑-12",110));
        mWeapon.add(new BigKnife(R.drawable.weapon_13,"","剑-13",110));
        mWeapon.add(new BigKnife(R.drawable.weapon_14,"","剑-14",110));
        mWeapon.add(new BigKnife(R.drawable.weapon_15,"","剑-15",110));


    }

    public ArrayList<Weapon> getmWeapon() {
        return mWeapon;
    }
}
