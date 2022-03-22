package com.company.part5;

import com.company.part5.FirstOuter.FirstInner;

public class SecondOuter {
    class SecondInner extends FirstInner{
        SecondInner(FirstOuter f1, String str){
            f1.super(str);
        }
    }
}
