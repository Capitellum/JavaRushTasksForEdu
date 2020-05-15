package com.javarush.task.task08.task0807;

/* 
LinkedList и ArrayList
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static Object createArrayList() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        return stringArrayList;

    }

    public static Object createLinkedList() {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        return stringLinkedList;

    }

    public static void main(String[] args) {

        createArrayList();
        createLinkedList();


    }
}
