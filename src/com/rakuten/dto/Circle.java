package com.rakuten.dto;

public class Circle extends Shape{
private double radius;
public Circle(int borderWidth, String color, double radius){
super(borderWidth, color);
this.radius = radius;
}

public void setRadius(double radius){
this.radius = radius;
}

public double getRadius(){
return radius;
}
}
