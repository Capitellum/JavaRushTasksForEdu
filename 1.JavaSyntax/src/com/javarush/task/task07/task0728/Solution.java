package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        ArrayList<Integer> sortedArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {sortedArray.add(array[i]);}
        sortedArray.sort(Comparator.reverseOrder());
        for (int i = 0; i < sortedArray.size(); i++) {array[i] = sortedArray.get(i);}

    }
}
