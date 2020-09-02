package com.company;

public class TestBall {
    public static void main(String[] args) {
        Ball one = new Ball();
        Ball two = new Ball(1.2, 3.4);
        System.out.println(one);
        System.out.println(two);
        one.setX(2.3);
        one.setY(3.4);
        System.out.println(one.getX()+" "+one.getY());
        two.move(2.3, 5.6);
        System.out.println(two);
        one.setXY(3.5, 7.8);

    }
}
