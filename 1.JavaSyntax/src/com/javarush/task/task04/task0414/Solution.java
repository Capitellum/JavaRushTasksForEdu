package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number%400==0 || number%4==0 && number%100 !=0) {
            System.out.println("количество дней в году: 366");
        }
        else  System.out.println("количество дней в году: 365");

    }
}