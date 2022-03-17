package com.company.part1;

public class Mouse extends Rodent{
    Mouse(){
        System.out.println("Hii..I am a mouse");
    }
    @Override
    void favFood(){
        System.out.println("My fav food is ice cream");
    }

    @Override
    void favTask(){
        System.out.println("I like to dance");
    }
}
