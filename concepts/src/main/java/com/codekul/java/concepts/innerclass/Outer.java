package com.codekul.java.concepts.innerclass;

/**
 * Created by aniruddha on 27/1/17.
 */
public class Outer {

    private int outerInt = 10;

    public class PublicInner {
        // private of outer can be accessed in inner vice a versa is not true
    }

    private class PrivateInner {

    }

    public static class Staticinner {

    }

    public void outerMethod() {

        class LocalInner {
            // accessed only in this method
        }
    }
}
