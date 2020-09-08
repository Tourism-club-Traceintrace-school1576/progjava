package com.company;

public class Bed extends Furniture {

    private int persons;
    public Bed(String color, String size, String material, int persons, int price) {
        super(color, size, material, price);
        this.persons = persons;
    }

    @Override
    public String makenoise() {
        return "Lalalalala";
    }

    @Override
    public String toString() {
        return "Hello, I`m a Bed. I scream"+this.makenoise()+" I`m for "+this.getPersons()+" persons. I am made from "+this.getMaterial()+"  I cost "+this.getPrice();

    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }
}
