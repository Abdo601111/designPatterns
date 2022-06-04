package com.patterns.creational.builder;

public class Vehicle {

    private String engine;
    private int wheel;
    private int airbags;

    public String getEngine() {
        return engine;
    }

    public int getWheel() {
        return wheel;
    }

    public int getAirbags() {
        return airbags;
    }

    public Vehicle(VehicleBuilder vehicle){
        this.engine=vehicle.engine;
        this.wheel=vehicle.wheel;
        this.airbags=vehicle.airbags;
    }

    public static class VehicleBuilder{

        private String engine;
        private int wheel;
        private int airbags;



        public VehicleBuilder(String engine, int wheel) {
            this.engine = engine;
            this.wheel = wheel;
        }

        public VehicleBuilder setAirbags(int airbags) {
            this.airbags = airbags;
            return this;

        }
        public Vehicle build(){
            return new Vehicle(this);
        }
    }
}
