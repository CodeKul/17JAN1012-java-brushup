package com.codekul.java.concepts;

import com.codekul.java.concepts.abstractclasses.Anima;
import com.codekul.java.concepts.abstractclasses.Elephant;
import com.codekul.java.concepts.exceptionhandling.Situation;
import com.codekul.java.concepts.innerclass.MyRunnable;
import com.codekul.java.concepts.innerclass.Outer;
import com.codekul.java.concepts.oops.Bmw;
import com.codekul.java.concepts.oops.Car;
import com.codekul.java.concepts.threads.MyThread;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by aniruddha on 25/1/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Yes, Concepts are good");

      threading();
    }

    public static void classesAndObjects() {
        Car car = new Car(); // obj creation
        car.speedUp();
    }

    public static void inheritance() {

        Bmw bmw = new Bmw();
        bmw.speedUp();
        bmw.enableAirCoolers();

         Car car = new Bmw();
//           car.enableAirCoolers();
    }

    public void abstractClasses() {

        //Anima ani = new Anima();

        Anima am = new Elephant();
        am.age();
        am.walking();
    }

    public void inerfaces() {

    }

    public static void exceptionHandling() {
        Situation situation = new Situation();
        situation.good(45,89);
        situation.good(75,12);
        situation.good(89,-56);
        situation.good(45,0);
        situation.good(89,-56);

        try {
            situation.good(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        situation.good(42,85,0);
    }

    public static void threading() {

        MyThread th = new MyThread();
        th.start();

        Thread thSimple = new Thread(new com.codekul.java.concepts.threads.Bmw());
        thSimple.start();

    }

    public static void innerClasses() {

        Outer outer = new Outer();

        Outer.PublicInner publicInner =
                outer.new PublicInner();

        Outer.Staticinner staticinner =
                new Outer.Staticinner();

        outer.outerMethod();

        Runnable run = new MyRunnable();
        //obj of that class which is
        // implementing runnable

        // this is not object of interface
        Runnable run1 = new Runnable() { //anonymous inner
            @Override
            public void run() {

            }
        };

        JButton btn = new JButton();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //java 8 - functional programming
        btn.addActionListener( ev -> {}); // lambda
        btn.addActionListener(Main::action); //method reference

        Runnable lambdaRun = () -> { };
    }

    public static void action(ActionEvent e) {

    }
}
