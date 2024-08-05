package org.example;

public enum Weapon {
    SWORD(50, 1),
    HAMMER(60, 2);

    int damage;
    double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

}
