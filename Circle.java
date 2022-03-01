package com.company.Q1;

public class Circle extends GeometricObject{
    private double radius;
    private static double PI = 3.14159265;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public  Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*Math.pow(this.getRadius(), 2);
    }

    public double getPerimeter(){
        return 2*PI*this.getRadius();
    }

    public double getDiameter(){
        return 2*this.getRadius();
    }

    public void printCircle(){
        //System.out.print();
    }
}
