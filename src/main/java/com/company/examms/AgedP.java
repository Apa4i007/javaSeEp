package com.company.examms;

import java.util.Collection;

public class AgedP {
        <T> void addAll(T[] a, Collection<T> c) {
            for (int i = 0; i < a.length; i++) {
                c.add(a[i]);
            }
         }
}

class TestClass {
    public static final int a = 100;

    public static int field4 = 10;   //1

    TestClass() {
        System.out.println("Constructor");
    }

    TestClass(String i) {
        this();
    }

    TestClass(String name, int i){
        this(name);
    }
    private int my = 5;  //5

    {
        System.out.println("non static block");    //6
    }

    static{
        System.out.println("static block"); //2
    }
    int field2 = 10;

    public static void myMethod() {
        new TestClass(new String(), a);   //4
    }

    public static void main(String[] args) {
        TestClass.myMethod();  //3
    }
}

