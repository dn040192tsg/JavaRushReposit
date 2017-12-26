package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 9; i++) {
            map.put("lastname"+i,"firstname");
        }
        map.put("lastname","firs");


        return map;
    }

    public static void  removeTheFirstNameDuplicates(HashMap<String, String> map) {

        LinkedList<String> list = new LinkedList<>(map.values());

        for (String x : list) {
            if (Collections.frequency(map.values(), x) > 1) {
                removeItemFromMapByValue(map, x);
            }
        }
        }




    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
////        for (Map.Entry<String, String> x : map.entrySet()) {
////            System.out.println(x);
////        }
//
//         removeTheFirstNameDuplicates(map);
//
//        for (Map.Entry<String, String> x : map.entrySet()) {
//            System.out.println(x);
//        }
    }
}
