package com.company.part5;

public class Main {
    public static void main(String args[]){

        FirstOuter outer1 = new FirstOuter();
        SecondOuter outer2 = new SecondOuter();

        outer2.new SecondInner(outer1, "hi!");
    }

}
