package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {

    public  int intVar;
    public  double doubleVar ;
    public  Double DoubleVar;
    public   boolean booleanVar;
    public  Object ObjectVar;
    public  Exception ExceptionVar;
    public  String StringVar;

    public static void main(String[] args) {

        Solution e = new Solution();
        System.out.println(e.intVar);
        System.out.println(e.doubleVar);
        System.out.println(e.DoubleVar);
        System.out.println(e.booleanVar);
        System.out.println(e.ObjectVar);
        System.out.println(e.ExceptionVar);
        System.out.println(e.StringVar);
    }
}
