package com.woupyie.javapractice;

public class Car {
    public  String colour = "Black";
    private int mNumberOfSeats = 5;
    protected String mInterior;

    public Car() {

    }

    public  Car (String chosenColour, String chosenInterior){
        colour = chosenColour;
        mInterior = chosenInterior;
    }

    public int getNumberOfSeats() {
        return mNumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        mNumberOfSeats = numberOfSeats;
    }

    public String getInterior() {
        return mInterior;
    }

    public void setInterior(String interior) {
        mInterior = interior;
    }

    public  void drive(){
        System.out.println("driving");
    }
}
