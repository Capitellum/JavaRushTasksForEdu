package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {

        Man firstMan = new Man("Andrew", 28, "Cork");
        Man secondMan = new Man("Jack", 17, "Dublin");
        Woman firstWoman = new Woman("Sara", 22, "Galway");
        Woman secondWoman = new Woman("Jane", 34, "Athleague");

        System.out.println(firstMan);
        System.out.println(secondMan);
        System.out.println(firstWoman);
        System.out.println(secondWoman);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name+" "+age+" "+address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name+" "+age+" "+address;
        }
    }
}
