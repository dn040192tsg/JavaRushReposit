package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Human implements Run, Swim{


    }

    interface Run{
        void run (int a);
    }

    interface Swim{
        void swim (int a);
    }
}
