package com.company;

public class CircleTest {
    public static void main(String[] args) {
        Circle one = new Circle(1.2);
        Circle two = new Circle();
        System.out.println(one);
        System.out.println(two);
        one.setColor("Yellow");
        one.setR(3.4);
        System.out.println(one);

    }
}
