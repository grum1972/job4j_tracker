package ru.job4j.collection;

import java.util.HashSet;
import java.util.Set;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        Set<String> check = new HashSet<>();
        for (String s : origin) {
            check.add(s);
        }
        for (String s : text) {
            if (!check.contains(s)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
