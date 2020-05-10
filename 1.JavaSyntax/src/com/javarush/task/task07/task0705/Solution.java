package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] intArrayTwenty = new int[20];
        int[] intArrayTenOne = new int[10];
        int[] intArrayTenTwo = new int[10];

        for (int i  = 0; i < 20; i++){intArrayTwenty[i] = Integer.parseInt(bufferedReader.readLine());}

        for (int i = 0; i<10; i++) {intArrayTenOne[i] = intArrayTwenty[i];}
        for (int i = 0; i<10; i++) {intArrayTenTwo[i] = intArrayTwenty[i+10];}
        for (int i = 0; i<intArrayTenTwo.length; i++){
            System.out.println(intArrayTenTwo[i]);
        }

    }
}
