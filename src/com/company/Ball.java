package com.company;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Ball(){
        this.x = 1;
        this.y = 1;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double xDisp, double yDisp){
        this.x += xDisp;
        this.y += yDisp;
    }

    public void setXY(double x, double y){
        this.setX(x);
        this.setY(y);
    }
    @Override
    public String toString() {
        return "Ball coordinates x = "+this.x+" y = "+this.y;
    }
}
