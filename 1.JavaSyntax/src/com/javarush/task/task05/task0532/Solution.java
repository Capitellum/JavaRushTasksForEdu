package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int num;
        int counter = Integer.parseInt(reader.readLine());
        if (counter>0) {

            num = Integer.parseInt(reader.readLine());
            maximum = num;

            for (int i=1;i<counter; i++){

                num = Integer.parseInt(reader.readLine());
                if (num>maximum){maximum = num;}


            }
            System.out.println(maximum);



        }
    }
}
