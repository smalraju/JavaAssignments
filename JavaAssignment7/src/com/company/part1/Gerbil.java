package com.company.part1;

public class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Hii..i am a gerbil");
    }
    @Override
    void favFood(){
        System.out.println("My fav food is banana");
    }

    @Override
    void favTask(){
        System.out.println("I like to play");
    }
}
