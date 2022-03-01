package com.company;

public class ShapeRectangle extends Shape {
    public ShapeRectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        System.out.println("Inside Area for Rectangle.");
        return this.getDim1() * this.getDim2();
    }
}
