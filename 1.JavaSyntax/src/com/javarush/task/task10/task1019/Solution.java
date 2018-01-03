package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true)
        {
            int id = 0;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                break;
            } catch (IOException e) {
                break;
            }
            String name = reader.readLine();
            if (name.isEmpty()) {

            }

            map.put(name, id);
        }

        for (Map.Entry x : map.entrySet()) {
            System.out.println(x.getValue() + " " + x.getKey());
        }

        //System.out.println("Id=" + id + " Name=" + name);
    }
}
