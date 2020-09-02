package com.company;

public class TestAuthor {
    public static void main(String args[]) {
        Author one = new Author("Ivan Malevich", "lalal@mail.ru", 'M');
        Author two = new Author("Lala Lola", "lalolo@mail.ru", 'F');
        Author three = new Author("Lolo Author", "asdfg@mail.ru", 'M');
        System.out.println(one.getEmail());
        System.out.println(two.getName());
        three.setEmail("lolololo@gmail.com");
        System.out.println(three.getGender());
        System.out.println(one);
        System.out.println(two);
        System.out.println(three.getEmail());

    }
}
