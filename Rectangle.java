package com.company.Q1;

public class Rectangle extends GeometricObject{
    public double width;
    public double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.getHeight()*this.getWidth();
    }

    public double getPerimeter(){
        return (2*this.getWidth()) + (2*this.getHeight());
    }
}
