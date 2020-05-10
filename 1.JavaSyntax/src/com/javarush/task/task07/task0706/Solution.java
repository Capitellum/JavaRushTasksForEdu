package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];
        int odd = 0;
        int even = 0;

        for (int i = 0; i < houses.length; i++) {houses[i] = Integer.parseInt(bufferedReader.readLine());}
        for (int i = 0; i < houses.length; i++) {
            if (i == 0) {even += houses[i];} else
                if (i % 2 == 0) {even += houses[i];} else {odd += houses[i];}
        }

        if (odd > even) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}
