package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name, int weight, int age, String address, String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public void initialize(int weight, int age,  String address, String color){
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 1;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public void initialize(String address, String color){
        this.age = 1;
        this.weight = 5;
        this.address = address;
        this.color = color;
    }

    public void initialize(String name){
        this.name = name;
        this.age = 1;
        this.weight = 5;
        this.color = "NoColor";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.address = null;
        this.color = "NoColor";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = null;
        this.color = "NoColor";
    }

    public void initialize(String name, int weight, int age, String address){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = "NoColor";
    }

    public void initialize(int weight, String color){
        this.age = 1;
        this.weight = weight;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
