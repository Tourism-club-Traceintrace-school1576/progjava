package com.company;

public class Bed extends Furniture {

    private int persons;
    public Bed(String color, String size, String material, int persons) {
        super(color, size, material);
        this.persons = persons;
    }

    @Override
    public String makenoise() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }
}
