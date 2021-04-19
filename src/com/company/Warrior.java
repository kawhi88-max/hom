package com.company;

public  class Warrior extends Hero {

    public Warrior(int health, int damage, String superPowers) {
        super(health, damage, superPowers);
    }

    @Override
    public String appylSuperAbility(String superAbilityType) {
        return ( " Warrior применил суперспособность " + getSuperPowers());
    }
}
