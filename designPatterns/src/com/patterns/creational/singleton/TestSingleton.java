package com.patterns.creational.singleton;

public class TestSingleton {


    public static void main(String[] args) {

     Counter counter1 =  Counter.getInstance();
     counter1.addOne();
     Counter counter2= Counter.getInstance();
     counter2.addOne();
     System.out.println("Counter 1 :" +counter1);
     System.out.println("Counter 2 :" +counter2);
     counter1.addOne();

     System.out.println("Counter 1 :" +counter1);
     System.out.println("Counter 2 :" +counter2);


    }
}
