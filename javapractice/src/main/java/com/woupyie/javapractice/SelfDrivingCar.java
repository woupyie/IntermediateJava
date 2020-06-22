package com.woupyie.javapractice;

public class SelfDrivingCar extends  Car {
    public SelfDrivingCar(String chosenColour, String chosenInterior) {
        super(chosenColour, chosenInterior);
        System.out.println("Constructing self-driving car. Installing skynet version...");
    }

    @Override
    public void drive(){
        System.out.println("Driving to Googleplex, Mountain View");
    }
}
