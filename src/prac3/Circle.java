package prac3;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean isFilled){
        super(color, isFilled);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Type shape circle color: "+this.getColor()+" is filled "+this.isFilled()+"radius "+this.getRadius()+" perimeter "+this.getPerimeter()+" area "+this.getArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
