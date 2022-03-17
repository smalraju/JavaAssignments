package com.company.part1;


public class Main {
    public static void main(String[] args){
        Rodent rodentList[]=new Rodent[4];
        rodentList[0] = new Mouse();
        rodentList[0].favFood();
        rodentList[0].favTask();

        rodentList[1] = new Gerbil();
        rodentList[1].favFood();
        rodentList[1].favTask();

        rodentList[2] = new Hamster();
        rodentList[2].favFood();
        rodentList[2].favTask();

        rodentList[3] = new Rodent() {
            @Override
            void favFood() {

            }

            @Override
            void favTask(){

            }
        };
        rodentList[3].favFood();
        rodentList[3].favTask();



    }
}
