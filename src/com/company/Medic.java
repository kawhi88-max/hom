package com.company;

public  class Medic extends Hero {

    public Medic(int health, int damage, String superPowers) {
        super(health, damage, superPowers);
    }

    @Override
    public String appylSuperAbility(String superAbilityType) {
        return (" Medic применил суперспособность" + getSuperPowers());
    }
}
