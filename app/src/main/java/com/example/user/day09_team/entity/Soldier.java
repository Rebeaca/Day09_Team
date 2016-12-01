package com.example.user.day09_team.entity;

/**
 * Created by user on 2016/12/1.
 * 士兵
 */

public class Soldier extends Role{
    public Soldier() {
    }

    public Soldier(int icon, String name, int attack) {
        super(icon, name, attack);
    }
    @Override
    public int getAttack() {
        int _Attack = super.getAttack();
        //先判断有没有武器
        if (getWeapon() != null){
            //再判断是否装备正确
            if (getWeapon() instanceof  Sword){
                _Attack =2*( _Attack+getWeapon().getAttack());
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
        if (getWeapon()!=null && getWeapon() instanceof  Sword){
            return true;
        }else
        {
            return false;
        }
        //return super.isWeaponRight();
    }
}
