package de.bht;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //testarray
        int[] input = {1, 2, 3, 4, 5};
        List<String> list = convertToLinkedList(input);
        System.out.println(list);
        
    }


static public List<String> convertToLinkedList(int[] input) {
    LinkedList<String> list = new LinkedList<>();

    if (input != null) {
        for (int number : input) {
            list.add(String.valueOf(number));
        }
    }

    return list;
}
}