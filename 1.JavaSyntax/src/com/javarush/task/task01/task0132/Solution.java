package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.StringReader;


public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = 0;

        for (int i =0; i<3; i++){
            int s = number%10;
           number = number/10;
            sum = sum+s;

        }
               return sum;
        }

    }
