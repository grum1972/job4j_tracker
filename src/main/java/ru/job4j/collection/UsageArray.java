package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("string1");
        list.add("string2");
        list.add("string2");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
