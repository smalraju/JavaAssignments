package com.company;

import java.io.*;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args) throws Exception
    {

        File file = new File("/home/shreM/JavaAssignments/JavaAssignment11/src/com/company/" + args[0]);

      //File file = new File(args[0]);
      System.out.println(file.getAbsolutePath());
        BufferedReader br = new BufferedReader(new FileReader(file));
        FileWriter writer = new FileWriter("output.txt");
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        String st;
        while ((st = br.readLine()) != null) {
            char[] s=st.toCharArray();
            for (char i:s) {

                if (map.containsKey(i)) {
                    map.replace(i, map.get(i), map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }

            }
        }
        map.remove(' ');

        for (char i : map.keySet()) {
            writer.write("key: " + i + " value: " + map.get(i));
            System.out.println("key: " + i + " value: " + map.get(i));
        }
        writer.close();
    }
}