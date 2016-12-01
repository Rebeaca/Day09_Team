package com.example.user.day09_team.entity;

/**
 * Created by user on 2016/12/1.
 * 医生
 *
 */

public class Doctor extends Role{


      public Doctor() {}

    public Doctor(int icon, String name, int attack) {
        super(icon, name, attack);
    }

    @Override
    public int getAttack() {
        int _Attack = super.getAttack();
        //先判断有没有武器
        if (getWeapon() != null){
            //再判断是否装备正确
            if (getWeapon() instanceof  BigKnife){
                _Attack = (_Attack+getWeapon().getAttack())*2;
            }else
            {
                _Attack += getWeapon().getAttack();
            }
            return _Attack;
        }
        return _Attack;
    }

    @Override
    public boolean isWeaponRight() {
        if (getWeapon()!=null && getWeapon() instanceof  BigKnife){
            return true;
        }else
        {
            return false;
        }
        //return super.isWeaponRight();
    }
}
