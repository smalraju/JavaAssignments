package com.company.part4;

public class Main {
    public static void main(String args[]){
        Unifactory f1=new Unifactory();
        Cycle c1= f1.getCycle();
        Cycle c2=new Bifactory().getCycle();
        Cycle c3=new Trifactory().getCycle();
        c1.NumberOfWheels();
        c2.NumberOfWheels();
        c3.NumberOfWheels();
    }
}