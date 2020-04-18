package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int s1 = Integer.parseInt(bufferedReader.readLine());
        int s2 = Integer.parseInt(bufferedReader.readLine());
        int s3 = Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        if (s1>0){count++;}
        if (s2 > 0) {count++;}
        if (s3>0) {count++;}

        System.out.println(count);

    }
}
