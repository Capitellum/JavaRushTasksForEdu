package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<String> stringArray = new ArrayList<>();
        stringArray.add("мама");
        stringArray.add("мыла");
        stringArray.add("раму");

        for (int i = 1; i < stringArray.size()+1; i = i+2) {stringArray.add(i,"именно");}
        for (int i = 0; i < stringArray.size(); i++) {
            System.out.println(stringArray.get(i));
        }



    }
}
