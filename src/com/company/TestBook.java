package com.company;

public class TestBook {
    public static void main(String args[]){
        Book one = new Book();
        Book two = new Book("Stalin in world", 1998, 1000, "Malevich");
        Book three = new Book("Stalin in youth", 1999);
        one.setAgepublish(1999);
        one.setAuthor("Lalala");
        one.setCountpage(100);
        one.setName("Lololo");
        three.setAuthor("Malevich");
        three.setCountpage(243);
        System.out.println(two);
        one.Randomcount();
        two.Randomcount();
        three.Randomcount();
    }
}
