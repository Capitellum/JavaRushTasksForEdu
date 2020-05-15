package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int start = 1;
        int end = 1;
        for (int i = 0; i < 10; i++) {list.add(Integer.parseInt(bufferedReader.readLine()));}

        for (int i = 0; i < list.size() - 1; i++) {

            if (list.get(i).equals(list.get(i+1)))
                start += 1;
             else
                start = 1;

            if (start > end)
                end = start;

        }

        System.out.println(end);
        }
    }
