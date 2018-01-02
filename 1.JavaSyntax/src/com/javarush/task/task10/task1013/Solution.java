package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String fname;
        private int age;
        private  boolean sex;
        private String father;
        private String mather;


        public Human(String name, String fname, boolean sex, String mather) {
            this.name = name;
            this.fname = fname;
            this.sex = sex;
            this.mather = mather;
        }

        public Human(String name, String father, String mather) {
            this.name = name;
            this.father = father;
            this.mather = mather;
        }

        public Human(String name, String fname, int age, String mather) {
            this.name = name;
            this.fname = fname;
            this.age = age;
            this.mather = mather;
        }

        public Human(int age, boolean sex) {

            this.age = age;
            this.sex = sex;
        }

        public Human(String name) {

            this.name = name;
        }

        public Human(String name, String fname) {

            this.name = name;
            this.fname = fname;
        }

        public Human(String name, String fname, int age) {

            this.name = name;
            this.fname = fname;
            this.age = age;
        }

        public Human(String name, String fname, int age, boolean sex) {

            this.name = name;
            this.fname = fname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String fname, int age, boolean sex, String father) {

            this.name = name;
            this.fname = fname;
            this.age = age;
            this.sex = sex;
            this.father = father;
        }

        public Human(String name, String fname, int age, boolean sex, String father, String mather) {

            this.name = name;
            this.fname = fname;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mather = mather;
        }


    }
}
