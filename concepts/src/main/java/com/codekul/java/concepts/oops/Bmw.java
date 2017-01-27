package com.codekul.java.concepts.oops;

/**
 * Created by aniruddha on 25/1/17.
 */
public class Bmw /*is a car*/ extends Car {

    @Override // annotation
    public void speedUp() {
        super.speedUp();

        System.out.println("Bmw is speeding up");
    }

    public void enableAirCoolers() {

    }
}
