package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {

        int i;
        int j;
        int m = 1;

        for (i = 0; i<10; i++) {

            for (j = 0; j < m; j++) {
                System.out.print("8");
            }
            System.out.println();
            j=0;
            m++;

        }

    }
}
