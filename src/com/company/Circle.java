package com.company;
//laba2
public class Circle {
    private double r;
    private String color;

    public Circle(double r) {
        this.r = r;
        this.color = "Red";
    }
    public Circle(){
        this.r = 1;
        this.color = "Red";
    }

    public Circle(double r, String color){
        this.r = r;
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.r;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.r, 2);
    }

    public String toString(){
        return "Circle radius = "+this.r+" Perimeter = "+this.getPerimeter()+" Area = "+this.getArea()+" Color "+this.getColor();
    }
}
