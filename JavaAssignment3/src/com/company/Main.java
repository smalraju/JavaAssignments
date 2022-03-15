package com.company;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException , UnknownHostException{
	// write your code here
        Scanner sc=new Scanner(System.in);
        ArrayList<Long> array = new ArrayList<Long>();
        String IPAddress;
        System.out.println("Enter IP Address to continue or 0 to exit");
        IPAddress=sc.nextLine();
        while(!IPAddress.equals("0")) {
            Inet4Address inet = (Inet4Address) Inet4Address.getByName(IPAddress);
            if (inet.isReachable(5000)) {
                System.out.println("IPAddress" + IPAddress + "  is Reachable");
                long start = System.nanoTime();
                long end = System.nanoTime();
                long gap = end - start;
                array.add(gap);
            }
            else {
                System.out.println("IPAddress not reachable");
            }
            System.out.println("Enter IP Address to continue or 0 to exit");
            IPAddress=sc.nextLine();
        }
        if(!array.isEmpty()) {
            long time = 0;
            for (long i : array) {
                time = time + i;
            }
            System.out.println("Median time is "+ time/ array.size() + "  1nano seconds");
        }

    }
}
