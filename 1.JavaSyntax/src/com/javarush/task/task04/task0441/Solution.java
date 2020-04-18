package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if (a>=b && a<=c || a<=b && a>=c) {
            System.out.println(a);
        } else if (b>=a && b<=c || b<=a && b>=c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
