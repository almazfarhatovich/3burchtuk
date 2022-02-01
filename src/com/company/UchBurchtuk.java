package com.company;

public class UchBurchtuk {
    int a;
    int b;
    int c;
    void area(){
        float p=(a+b+c)/2f;
        System.out.println("Уч бурчтуктун P:"+p);
        System.out.println("Уч бурчтуктун S:"+Math.round(Math.sqrt((p*(p-a)*(p-b)*(p-c)))));
    }
}

