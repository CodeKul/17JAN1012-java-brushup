package com.codekul.java.concepts.threads;

/**
 * Created by aniruddha on 27/1/17.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();

        for (int i = 0; i < 100 ; i++) {
            System.out.printf("MyThread %d",i);
        }
    }
}
