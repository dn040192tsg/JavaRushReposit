package com.javarush.task.task08.task0818;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> mp = new HashMap<>();
        mp.put("Тупов",100);
        mp.put("Тупов2",200);
        mp.put("Тупов3",300);
        mp.put("Ющенко",400);
        mp.put("Ющенко2",500);
        mp.put("Ющенко3",600);
        mp.put("Смежный",700);
        mp.put("Смежный2",800);
        mp.put("Смежный3",900);
        mp.put("Эдуард1",1000);

        return mp;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        HashMap<String, Integer> list = new HashMap <String, Integer> (map);

        for (Map.Entry<String, Integer> x : list.entrySet()) {
            if(x.getValue() < 500)
            {
                map.remove(x.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}