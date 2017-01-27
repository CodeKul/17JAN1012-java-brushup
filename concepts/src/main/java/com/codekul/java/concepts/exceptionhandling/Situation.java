package com.codekul.java.concepts.exceptionhandling;

/**
 * Created by aniruddha on 25/1/17.
 */
public class Situation {

    public void good(int up, int down) {
        try {
            int res = up / down; // throw new ArithmeticException();
            System.out.printf("result is %d", res);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.printf("I will invoke in all cases");
        }
    }

    public void good(int down) throws Exception {
        int res = 10 / down;
        System.out.println("Result is "+res);
    }

    public void good(int up, int down, int fac) {

        if(down == 0) throw new MyException();
        int res = (up  /down) * fac;
    }
}
