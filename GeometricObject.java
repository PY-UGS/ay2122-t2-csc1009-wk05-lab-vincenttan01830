package com.company.Q1;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        this.color = "white";
        this.filled = false;
        Date now = new Date();
        this.dateCreated = now;
    }

    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
        Date now = new Date();
        this.dateCreated = now;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public String toString(){
         return("created on " + this.getDateCreated() + "\n" + "color: " + this.getColor() + " and filled: " + this.isFilled());
    }
}
