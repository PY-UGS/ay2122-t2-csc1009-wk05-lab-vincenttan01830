package com.company;

public class TestShape {

    public static void main(String[] args) {
	    ShapeRectangle r = new ShapeRectangle(9, 5);
        ShapeTriangle t = new ShapeTriangle(10, 8);
        ShapeCircle c = new ShapeCircle(5, 5);
        ShapeEllipse e = new ShapeEllipse(7, 7);
        ShapeSquare s = new ShapeSquare(6, 6);

        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());
    }
}
