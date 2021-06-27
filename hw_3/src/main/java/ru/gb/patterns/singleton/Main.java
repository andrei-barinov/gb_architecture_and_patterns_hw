package ru.gb.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = Circle.getInstance(5.0, 3.0, 2.0);
        circle1.print();
        Circle circle2 = Circle.getInstance(4.0, 2.0, 56.0);
        circle2.print();
    }
}
