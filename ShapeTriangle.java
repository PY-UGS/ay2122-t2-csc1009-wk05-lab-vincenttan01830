package com.company;

public class ShapeTriangle extends Shape{
    public ShapeTriangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    public double area(){
        System.out.println("Inside Area for Triangle.");
        return (this.getDim1() * this.getDim2())/2;
    }
}
