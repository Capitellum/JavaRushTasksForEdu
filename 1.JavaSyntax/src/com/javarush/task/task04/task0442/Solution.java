package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int num = 0;
       while (num!=-1){
           num = Integer.parseInt(bufferedReader.readLine());
           if (num == -1){
               sum += num;
               System.out.println(sum);
           } else
           sum += num; }




    }
}
