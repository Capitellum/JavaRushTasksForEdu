package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int year = Integer.parseInt(bufferedReader.readLine());
        int month = Integer.parseInt(bufferedReader.readLine());
        int date = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Меня зовут "+name+".");
        System.out.println("Я родился "+date+"."+month+"."+year);

    }
}
