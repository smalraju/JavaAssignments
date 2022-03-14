package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string");
        str=in.nextLine();
        str=str.toLowerCase();
        boolean[] alphabets = new boolean[26];
        int index=0;
        int flag=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>='a'&& str.charAt(i)<='z')
            {
                index=str.charAt(i)-'a';
            }
            alphabets[index]=true;

        }
        for(int i=0;i<26;i++)
        {
            if(alphabets[i]==false)
            {
                flag=0;
                break;
            }
        }
        if(flag==0)
            System.out.println("Not all covered");
        else
            System.out.println("All covered");
    }
}
//Time complexity : O(n)
//Space Complexity: O(n) where n is length of string