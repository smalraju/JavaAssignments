package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter n");
        int n= in.nextInt();
        while(n!=0){
            perform();
            n=n-1;
        }
    }
    public static void perform(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter signup date:");
        String[] signup=sc.nextLine().split("-");
        System.out.println("Enter current date");
        String[] current=sc.nextLine().split("-");
        ArrayList<Integer> signupDate=new ArrayList<Integer>();
        ArrayList<Integer> currentDate=new ArrayList<Integer>();
        for(String x:signup){
            signupDate.add(Integer.parseInt(x));
        }
        for(String x:current){
            currentDate.add(Integer.parseInt(x));
        }
        LocalDate d=LocalDate.of(currentDate.get(2), signupDate.get(1),signupDate.get(0));
        LocalDate start=d.minusDays(30);
        LocalDate end=d.plusDays(30);
        LocalDate curr=LocalDate.of(currentDate.get(2),currentDate.get(1),currentDate.get(0));
        findRange(start,end,curr);
    }

    private static void findRange(LocalDate start,LocalDate end,LocalDate curr) {
        int s,t;
        s= start.compareTo(curr);
        t=end.compareTo(curr);
        if(s<0 && t>0){
            System.out.println(start+" "+curr);
        }

        else if(s<0 && t<0){
            System.out.println(start+" "+end);
        }
        else{
            System.out.println("NO RANGE");

        }

    }

}