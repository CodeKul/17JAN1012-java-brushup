package com.codekul.java.concepts.threads;

/**
 * Created by aniruddha on 27/1/17.
 */
public class Bmw implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 101 ; i++) {
            System.out.printf("Bmw %d",i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
