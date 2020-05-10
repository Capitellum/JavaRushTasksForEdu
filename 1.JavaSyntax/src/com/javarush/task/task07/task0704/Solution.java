package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] taskArray = new int[10];

        for (int i = 0; i<10; i++){
            int a = Integer.parseInt(bufferedReader.readLine());
            taskArray[i] = a;
        }

        for (int i = 9; i>=0; i--) {
            System.out.println(taskArray[i]);
        }



    }
}

