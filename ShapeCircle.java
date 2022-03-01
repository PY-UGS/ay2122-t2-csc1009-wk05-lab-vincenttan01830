package com.company;

public class ShapeCircle extends Shape{
    public ShapeCircle(double dim1, double dim2){
        super(dim1, dim2);
    }


    public double area(){
        System.out.println("Inside Area for Circle.");
        return Math.pow(this.getDim1(), 2) * this.getPI();
    }
}
