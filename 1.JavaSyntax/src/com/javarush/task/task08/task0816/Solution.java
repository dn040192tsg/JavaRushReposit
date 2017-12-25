package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", new Date("MAY 1 1980"));
        map.put("Stallone2", new Date("January 1 1980"));
        map.put("Stallone3", new Date("APRIL 1 1980"));
        map.put("Stallone4", new Date("APRIL 1 1980"));
        map.put("Stallone5", new Date("APRIL 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("APRIL 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));
        map.put("Stallone0", new Date("JUNE 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Date> rr = iterator.next();


            if (rr.getValue().getMonth() >= 5 && rr.getValue().getMonth() <= 7) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
