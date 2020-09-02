package com.company;

public class Book {
    private String name;
    private int agepublish;
    private int countpage;
    private String author;
    public Book(){
        this.name = "Trololo";
        this.agepublish = 1900;
        this.author = "Adam Savage";
        this.countpage = 0;
    }
    public Book(String name, int agepublish, int countpage, String author){
        this.name = name;
        this.agepublish = agepublish;
        this.countpage = countpage;
        this.author = author;
    }

    public Book(String name, int agepublish){
        this.name = name;
        this.agepublish = agepublish;
        this.countpage = 0;
        this.author = "";
    }

    public int getAgepublish() {
        return agepublish;
    }

    public void setAgepublish(int agepublish) {
        this.agepublish = agepublish;
    }

    public int getCountpage() {
        return countpage;
    }

    public void setCountpage(int countpage) {
        this.countpage = countpage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book "+this.name+" "+this.author+" "+this.agepublish+" "+this.countpage;
    }

    public void Randomcount(){
        System.out.println(this.agepublish*1000+this.countpage);
    }
}
