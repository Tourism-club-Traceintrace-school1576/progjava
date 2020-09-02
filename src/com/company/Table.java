package com.company;
//laba3
public class Table extends Furniture {

    private int persons;

    public Table(String color, String size, String material, int persons) {
        super(color, size, material);
        this.persons = persons;
    }

    public void fly(){
        System.out.println("I belive i can fly!");
    }

    @Override
    public String makenoise() {
        return "Foooooooooooooooooooooooooood!!!!!!!!!!!!";
    }

    @Override
    public String toString() {
        return "Hello, I`m a Table. I scream"+this.makenoise()+"I`m for "+this.getPersons()+" persons. My color is "+this.getColor();
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

}
