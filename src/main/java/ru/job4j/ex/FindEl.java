package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element could not be found");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] arr = {"111", "2222"};
            System.out.println(indexOf(arr, "23222"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
