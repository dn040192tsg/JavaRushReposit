package com.javarush.task.task14.task1419;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (ArithmeticException  e) {
            exceptions.add(e);
        }

        try {
            int[] m = {-1,0,1};
            m[3] = 4/3;

        } catch (ArrayIndexOutOfBoundsException   e) {
            exceptions.add(e);
        }

        try {
            Object[] x = new String[3];
            x[0] = new Integer(0);

        } catch (ArrayStoreException  e) {
            exceptions.add(e);
        }

        try {
            String s = "FOOBAR";
            int i = Integer.parseInt(s);

        } catch (NumberFormatException  e) {
            exceptions.add(e);
        }

        try {
            Object[] x = new String[-3];

        } catch (NegativeArraySizeException    e) {
            exceptions.add(e);
        }
        try {
             ArrayList<Object> allUsers = new ArrayList<Object>();
            allUsers.get(18);

        } catch (IndexOutOfBoundsException     e) {
            exceptions.add(e);
        }


        try {
            throw new UnsupportedOperationException();

        } catch (UnsupportedOperationException e) {
            exceptions.add(e);
        }

        try {
            throw new ConcurrentModificationException();

        } catch (ConcurrentModificationException   e) {
            exceptions.add(e);
        }

        try {
            throw new EmptyStackException();

        } catch (EmptyStackException    e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException ();

        } catch (IllegalArgumentException     e) {
            exceptions.add(e);
        }


    }
}
