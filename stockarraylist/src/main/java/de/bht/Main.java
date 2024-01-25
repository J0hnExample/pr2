package de.bht;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Testarray
        int[] input = {1, 2, 3, 4, 5};
        List<String> list = convertToArrayList(input);
        System.out.println(list);
    }

    static public List<String> convertToArrayList(int[] input) {
        ArrayList<String> list = new ArrayList<>();

        if (input != null) {
            for (int number : input) {
                list.add(String.valueOf(number));
            }
        }

        return list;
    }
}
