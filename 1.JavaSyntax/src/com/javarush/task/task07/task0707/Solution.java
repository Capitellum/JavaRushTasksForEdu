package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("Test");
        stringArray.add("Test two");
        stringArray.add("Test three");
        stringArray.add("Test four");
        stringArray.add("Test five");

        System.out.println(stringArray.size());

        for (int i = 0; i < stringArray.size(); i++) {
            System.out.println(stringArray.get(i));
        }
    }
}
