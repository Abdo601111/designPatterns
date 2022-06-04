package com.patterns.creational.singleton;

public class Counter {



    private static Counter instance= null;
    private Counter(){

    }

    public static Counter getInstance(){

        if(instance==null){instance= new Counter();}
        return  instance;
    }
    public int count=0;

    public void addOne(){
        count++;
    }

}
