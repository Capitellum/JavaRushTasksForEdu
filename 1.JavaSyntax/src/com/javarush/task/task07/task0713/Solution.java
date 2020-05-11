package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listThree = new ArrayList<>();
        ArrayList<Integer> listFour = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listOne.add(Integer.parseInt(bufferedReader.readLine()));
        }

        for (int i = 0; i < listOne.size(); i++) {
            if (listOne.get(i) % 3 == 0 && listOne.get(i) % 2 == 0) {
                listTwo.add(listOne.get(i));
                listThree.add(listOne.get(i));
            } else if (listOne.get(i) % 3 == 0) {listTwo.add(listOne.get(i));} else
                if (listOne.get(i) % 2 == 0) {listThree.add(listOne.get(i));} else
                {listFour.add(listOne.get(i));}
        }

        printList(listTwo);
        printList(listThree);
        printList(listFour);
    }

    public static void printList(ArrayList<Integer> list) {
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }
    }
}
