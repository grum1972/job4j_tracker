package ru.job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("String1");
        autos.add("String2");
        autos.add("String3");
        for (String auto : autos) {
            System.out.println(auto);
        }

    }
}
