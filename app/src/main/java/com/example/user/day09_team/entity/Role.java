package com.example.user.day09_team.entity;

/**
 * Created by user on 2016/12/1.
 * 父类
 * 角色
 */

public class Role {
    private int icon;
    private String name;
    private int attack;
    private Weapon weapon;

    public Role() {
    }

    public Role(int icon, String name, int attack) {
        this.icon = icon;
        this.name = name;
        this.attack = attack;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Weapon getWeapon() {
        return weapon;
    }
public boolean isWeaponRight(){
    return false;
}
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
