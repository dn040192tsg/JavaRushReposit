package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = reader.readLine();
        ArrayList <String> list = new ArrayList<>();

        while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger")){
            list.add(key);
            key = reader.readLine();
        }
        for (String x : list) {
            x = x.substring(0, 1).toUpperCase() + x.substring(1);
            person = (Person)Class.forName("com.javarush.task.task14.task1411.Person$" + x).newInstance();
            doWork (person);
        }

    }

    public static void doWork(Person person) {

        if (person instanceof Person.User){
            ((Person.User) person).live();
        }
        if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
        if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        }

}
