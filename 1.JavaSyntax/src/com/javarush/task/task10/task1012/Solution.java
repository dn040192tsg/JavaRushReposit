package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        ArrayList <String> map = new ArrayList<>();

        for (char x : alphabet) {
            int num = 0;
            for (String j : list) {
                char[] word = j.toCharArray();
                for (int i = 0; i < word.length; i++) {
                    if (word[i] == x)
                    {
                        num++;
                    }
                }
            }
            map.add("" + x + " " + num);
        }
        for (String q : map) {
            System.out.println(q);
        }
    }

}
