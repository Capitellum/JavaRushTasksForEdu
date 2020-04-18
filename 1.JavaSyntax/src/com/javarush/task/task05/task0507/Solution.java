package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        float sum = 0;
        int counter = 0;
        int nextNum;

        while (num != -1) {
            sum += num;
            counter++;
            nextNum = Integer.parseInt(bufferedReader.readLine());
            num = nextNum;
        } if (num == -1) {
            System.out.println(sum/counter);
        }


    }
}

