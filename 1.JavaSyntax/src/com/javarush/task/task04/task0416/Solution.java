package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        float time = scanner.nextFloat();

        time = time%5.0f;

        if (time < 3.0f){
            System.out.println("зеленый");}
        else if (time>=3.0f && time<4.0f){
            System.out.println("желтый");} else System.out.println("красный");
    }
}