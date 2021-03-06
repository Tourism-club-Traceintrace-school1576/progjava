package com.company;
//laba3
public abstract class Furniture {
    private String color;
    private String size;
    private String material;
    private int price;

    public Furniture(String color, String size, String material, int price){
        this.color = color;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    public abstract String makenoise();

    public abstract String toString();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
