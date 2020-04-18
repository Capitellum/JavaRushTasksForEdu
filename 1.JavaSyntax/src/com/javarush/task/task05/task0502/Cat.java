package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int powerOne = 0;
        int powerTwo = 0;

        if (this.weight > anotherCat.weight) {powerOne++;} else if (this.weight < anotherCat.weight) {powerTwo++;}
        if (this.age > anotherCat.age) {powerOne++;} else if (this.age < anotherCat.age) {powerTwo++;}
        if (this.strength > anotherCat.strength) {powerOne++;} else if (this.strength < anotherCat.strength) {powerTwo++;}

        return powerOne > powerTwo;
    }

    public static void main(String[] args) {

    }
}
