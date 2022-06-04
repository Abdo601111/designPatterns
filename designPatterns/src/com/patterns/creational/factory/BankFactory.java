package com.patterns.creational.factory;

public class BankFactory implements IBankFactory{
    @Override
    public  IBank getBank(String bankCode) {
        switch (bankCode){
            case "123456": return new BankA();
            case "112233":return new BankB();
        }
        return null;
    }
}
