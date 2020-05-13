package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {

        Human one = new Human("Вася", true, 22);
        Human two = new Human("Петя", true, 74);
        Human three = new Human ("Лена", false, 63);
        Human four = new Human("Игорь", true, 17);
        Human five = new Human ("Валера", true, 23, two, three);
        Human six = new Human ("Ольга", false, 28, one, three);
        Human seven = new Human ("Маша", false, 5, four, six);
        Human eight = new Human ("Даша", false, 8 , four, six);
        Human nine = new Human ("Миша", true, 12, four, six);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}