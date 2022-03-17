package com.company.part4;

public class Unifactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}