package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("11111");
            case 2 -> System.out.println("222222");
            case 3 -> System.out.println("333333");
            default -> System.out.println("Song not found");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
        jukebox.music(4);
    }
}
