package prac3;

public class Rectangle extends Shape{

    protected double width;
    protected double length;

    public Rectangle(){
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean isFilled){
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width*this.length;
    }

    @Override
    public double getPerimeter() {
        return 2*(this.width+this.length);
    }

    @Override
    public String toString() {
        return "Type shape rectangle color: "+this.getColor()+" is filled "+this.isFilled()+"length "+this.getLength()+" width "+this.getWidth()+" perimeter "+this.getPerimeter()+" area "+this.getArea();
    }
}
