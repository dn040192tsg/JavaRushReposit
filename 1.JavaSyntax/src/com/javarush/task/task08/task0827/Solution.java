package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JAN 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        String [] array = date.split(" ");

        Date date1 = new Date(date);
        Date date2 = new Date("JAN 1 "+array[2]);

        int res = (int) ((date1.getTime() - date2.getTime() - 86400000)/86400000);
        if (res % 2 == 0) {
            return false;
        }
        return true;
    }
}
