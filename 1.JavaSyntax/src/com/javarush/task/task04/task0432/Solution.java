package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String message = bufferedReader.readLine();
        int count = Integer.parseInt(bufferedReader.readLine());
        int x = 0;

        while (x<count){
            System.out.println(message);
            x++;
        }

    }
}
