package com.company;

public class Exception3 extends Exception implements UserException{
    @Override
    public void printMessage(){
        System.out.println("Throwing Exception 3");
    }
}
