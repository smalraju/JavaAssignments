package com.company;

public class Overload {
    Overload(int a, int b){
        System.out.println(a+b);
        new Overload("hello","world");
    }
    Overload(String a , String b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
        Overload o = new Overload(2,5);
    }

}