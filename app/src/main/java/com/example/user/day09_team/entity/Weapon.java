package com.example.user.day09_team.entity;

/**
 * Created by user on 2016/12/1.
 * 父类
 * 武器
 */

public class Weapon {
    private int icon;
    private String dec;
    private String name;
    private int attack;

    public Weapon(int icon, String dec, String name, int tack) {
        this.icon = icon;
        this.dec = dec;
        this.name = name;
        this.attack = tack;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
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
}
