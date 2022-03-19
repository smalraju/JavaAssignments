package com.company;

public class Exception1 extends Exception implements UserException{
    @Override
    public void printMessage(){
        System.out.println("Throwing Exception 1");
    }
}
