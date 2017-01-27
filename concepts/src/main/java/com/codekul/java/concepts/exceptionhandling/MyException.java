package com.codekul.java.concepts.exceptionhandling;

/**
 * Created by aniruddha on 27/1/17.
 */
public class MyException extends RuntimeException {


    @Override
    public String getMessage() {
        return "This is occurred because bad down value";
    }

    @Override
    public String toString() {
        return "";
    }
}
