package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {

        int x = 1;
        int y = 1;

        while (x <= 10 && y <= 10) {
            while (x <= 10 && y <= 10) {
                System.out.print(x * y + " ");
                y++;
            }
            System.out.println();
            x++;
            y=1;
        }
    }
}
