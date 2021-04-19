package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Magic magic = new Magic(100, 113," Stun ");


        Medic medic = new Medic(150,120," Heal ");


        Warrior warrior = new Warrior(200,140," Destroy ");

        Hero[] heroes = {magic, medic, warrior};
        for (Hero i: heroes ) {
            System.out.println(i.appylSuperAbility(""));

        }

    }
}
