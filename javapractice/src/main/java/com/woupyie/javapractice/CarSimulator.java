package com.woupyie.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launching car simulator.");

        Car myToyota = new Car("Blue","Earthen");
        Car myHonda = new Car ("Pink","Scandinavian");
        myHonda.drive();

        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        autoBot.drive();

        System.out.println("Autobot color is: " + autoBot.colour);
        System.out.println("autoBot interior is: " + autoBot.mInterior);

    }

}