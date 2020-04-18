package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(bufferedReader.readLine());

        if (s==0){
            System.out.println("ноль");
        } else if (s<0 && s%2==0){
            System.out.println("отрицательное четное число");
        } else if (s<0 && s%2!=0){
            System.out.println("отрицательное нечетное число");}
        else if (s>0 && s%2==0){
            System.out.println("положительное четное число");} else {
            System.out.println("положительное нечетное число");}


    }
}
