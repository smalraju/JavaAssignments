package com.company;

public class Creation {

    public static void main(String[] args) {
	// write your code here
        Runnable r1=()->{
            System.out.println("thread is running");
        };

        Thread t = new Thread(r1);
        t.start();
    }
}
