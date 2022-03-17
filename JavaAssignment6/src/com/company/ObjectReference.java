package com.company;

public class ObjectReference {
    ObjectReference(String temp){
        System.out.println(temp);
    }

    public static void main(String[] args) {
        ObjectReference[] o = new ObjectReference[3];
        for(int i=0;i<3;i++){
            o[i]= new ObjectReference(Integer.toString(i+1));
        }
    }
}