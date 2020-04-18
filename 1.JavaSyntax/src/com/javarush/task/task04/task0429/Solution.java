package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int s1 = Integer.parseInt(bufferedReader.readLine());
        int s2 = Integer.parseInt(bufferedReader.readLine());
        int s3 = Integer.parseInt(bufferedReader.readLine());

        int psum = 0;
        int nsum = 0;

        if (s1>0){psum++;} else if (s1<0) {nsum++;}
        if (s2>0){psum++;} else if (s2<0) {nsum++;}
        if (s3>0){psum++;} else if (s3<0) {nsum++;}

        System.out.println("количество отрицательных чисел: "+nsum);
        System.out.println("количество положительных чисел: "+psum);

    }
}
