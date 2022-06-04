package com.patterns.creational.factory;

import java.util.Scanner;

public class TestFactory {

    public static void main(String[] args) {

        String numberCard,bankCode;

        Scanner s= new Scanner(System.in);
        numberCard= s.next();
        BankFactory bankFactory= new BankFactory();

        System.out.println("Inter Your Bank Code");
        bankCode=numberCard.substring(0,6);
        IBank bank= bankFactory.getBank(bankCode);
        System.out.println(bank.willDraw());


    }
}
