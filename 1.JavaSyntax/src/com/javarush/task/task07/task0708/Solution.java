package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {strings.add(bufferedReader.readLine());}
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > maxLength) {maxLength = strings.get(i).length();}
        }

        for (int i = 0; i < strings.size(); i++)
            {if (strings.get(i).length() == maxLength) {
                System.out.println(strings.get(i));}
        }
    }
}