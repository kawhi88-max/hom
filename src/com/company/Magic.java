package com.company;

public  class Magic extends Hero {

    public Magic(int health, int damage, String superPowers) {
        super(health, damage, superPowers);
    }

    @Override
    public String appylSuperAbility(String superAbilityType) {
        return (" Magic применил суперспособность" + getSuperPowers());
    }
}
