package com.patterns.creational.builder;

public class TestBuilderPattern {

    public static void main(String[] args) {


        Vehicle car= new Vehicle.VehicleBuilder("abdo",12).setAirbags(4).build();
        Vehicle bike= new Vehicle.VehicleBuilder("mohamed",55).build();

        System.out.println(car.getEngine());
        System.out.println(car.getWheel());
        System.out.println(car.getAirbags());

        System.out.println(bike.getEngine());
        System.out.println(bike.getWheel());
        System.out.println(bike.getAirbags());

    }
}
