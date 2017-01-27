package com.codekul.java.concepts.oops;

/**
 * Created by aniruddha on 25/1/17.
 */
public class Car {
    // state and behaviour
    private int speed; // state or field or property

    public void speedUp() { //operation on state => behaviour
      speed = speed + 1;
    }

    public void speedUp(int speed) { //operation on state => behaviour
        this.speed = this.speed + speed;
    }
}
