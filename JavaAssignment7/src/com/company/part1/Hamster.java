package com.company.part1;

public class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hii..i am a hamster");
    }
    @Override
    void favFood(){
        System.out.println("My fav food is cake");
    }

    @Override
    void favTask(){
        System.out.println("I like to sing");
    }
}
