package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) throws Exception1,Exception2,Exception3{
        Random i=new Random();
        try{
            int k= i.nextInt();
            System.out.println("k value is " + k);
            if(k==1)
                throw new Exception1();
            else if(k==2)
                throw new Exception2();
            else
                throw new Exception3();
        }
        catch(Exception3|Exception2|Exception1 e){
            e.printMessage();
            e.printStackTrace();
        }
        finally {
            System.out.println("Printing finally");
        }


            }
}
