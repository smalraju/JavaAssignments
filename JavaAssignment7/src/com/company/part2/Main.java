package com.company.part2;

public class Main {
    public static void main(String[] args){
        Cycle cycles[]=new Cycle[3];

        Unicycle u =new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        cycles[0]=u;
        cycles[1]=b;
        cycles[2]=t;

        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();

        Unicycle u1 = (Unicycle) cycles[0];
        Bicycle b1 = (Bicycle) cycles[1];
        Tricycle t1 = (Tricycle) cycles[2];

       // Unicycle u2 = (Unicycle) new Cycle();
        //u2.balance; --- error for downcasting
        u1.balance();
        b1.balance();
        t1.balance();
    }
}
