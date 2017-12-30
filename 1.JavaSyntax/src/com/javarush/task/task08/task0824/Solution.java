package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("grandFatherF", true, 65 );
        Human child2= new Human("grandFatherF", true, 65 );
        Human child3 = new Human("grandFatherF", true, 65 );



        Human Father = new Human("grandFatherF", true, 65 );
        Human Mather= new Human("grandFatherF", true, 65);


        Father.children.add(child1);
        Father.children.add(child2);
        Father.children.add(child3);

        Mather.children.add(child1);
        Mather.children.add(child2);
        Mather.children.add(child3);


        Human grandFatherF = new Human("grandFatherF", true, 65 );
        Human grandMatherF = new Human("grandFatherF", true, 65);

        grandFatherF.children.add(Father);
        grandMatherF.children.add(Father);


        Human grandFatherM = new Human("grandFatherF", true, 65 );
        Human grandMatherM = new Human("grandFatherF", true, 65);

        grandFatherM.children.add(Mather);
        grandMatherM.children.add(Mather);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

        System.out.println(Father);
        System.out.println(Mather);

        System.out.println(grandFatherF);
        System.out.println(grandMatherF);
        System.out.println(grandFatherM);
        System.out.println(grandMatherM);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
