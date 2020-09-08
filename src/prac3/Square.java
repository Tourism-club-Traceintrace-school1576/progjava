package prac3;

public class Square extends Rectangle {
    protected double side;

    public Square(){
        this.side=1.0;
    }
    public Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        this.side  =side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side*this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side*4;
    }

    @Override
    public String toString() {
        return "Type shape square color: "+this.getColor()+" is filled "+this.isFilled()+"side "+this.getSide()+" perimeter "+this.getPerimeter()+" area "+this.getArea();

    }
}
