package com.company.part3;

public class ClassA extends ClassB implements InterfaceD{
    @Override
    public void fun1() {
        System.out.println("this is fun1");
    }

    @Override
    public void fun2() {
        System.out.println("this is fun2");
    }
    @Override
    public void fun3() {
        System.out.println("this is fun3");
    }
    @Override
    public void fun4() {
        System.out.println("this is fun4");
    }
    @Override
    public void fun5() {
        System.out.println("this is fun5");
    }
    @Override
    public void fun6() {
        System.out.println("this is fun6");
    }
    @Override
    public void fun() {
        System.out.println("this is fun");
    }


    public void fun7(InterfaceA ia) {
        System.out.println("this is fun7");
    }
    public void fun8(InterfaceB ib) {
        System.out.println("this is fun8");
    }
    public void fun9(InterfaceC ic) {
        System.out.println("this is fun9");
    }
    public void fun10(InterfaceD id) {
        System.out.println("this is fun10");
    }
}
