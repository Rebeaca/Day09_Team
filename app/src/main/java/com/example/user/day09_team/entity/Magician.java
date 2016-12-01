package com.example.user.day09_team.entity;

import com.example.user.day09_team.R;

/**
 * Created by user on 2016/12/1.
 * 魔法师
 */

public class Magician extends Role{
    public Magician() {

    }

    public Magician(int icon, String name, int attack) {

        super(icon, name, attack);
    }
    @Override
    public int getAttack() {
        int _Attack = super.getAttack();
        //先判断有没有武器
        if (getWeapon() != null){
            //再判断是否装备正确
            if (getWeapon() instanceof  MagicArt){
                _Attack = 2*(_Attack+getWeapon().getAttack());
            }else
            {
                _Attack += getWeapon().getAttack();
            }
            return _Attack;
        }
        return super.getAttack();
    }
    @Override
    public boolean isWeaponRight() {
        if (getWeapon()!=null && getWeapon() instanceof  MagicArt){
            return true;
        }else
        {
            return false;
        }
        //return super.isWeaponRight();
    }

}
