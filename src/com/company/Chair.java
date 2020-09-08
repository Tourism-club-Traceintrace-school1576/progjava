package com.company;
//lab3
public class Chair extends  Furniture {

    private String type;
    private int persons;
    public Chair(String color, String size, String material, String type, int persons, int price) {
        super(color, size, material, price);
        this.type = type;
        this.persons = persons;
    }

    @Override
    public String makenoise() {
        return "Bugaga";
    }

    @Override
    public String toString() {
        return "Hello, I`m a Chair. I scream "+this.makenoise()+" I`m for "+this.getPersons()+" persons. My type is "+this.getType()+" I am made from "+this.getMaterial()+" I cost "+this.getPrice();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }
}
