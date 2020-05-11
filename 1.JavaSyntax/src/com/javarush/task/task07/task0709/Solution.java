package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

       public static void main(String[] args) throws Exception {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> strings = new ArrayList<>();
            int minLength;

            for (int i = 0; i < 5; i++) {strings.add(bufferedReader.readLine());}
            minLength = strings.get(0).length();
            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).length() < minLength) {minLength = strings.get(i).length();}
            }

            for (int i = 0; i < strings.size(); i++)
            {if (strings.get(i).length() == minLength) {
                System.out.println(strings.get(i));}
            }
        }
    }

