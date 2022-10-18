package com.rakuten.dto;

public class Shape {
private int borderWidth;
private String color;
public Shape(int borderWidth, String color){
this.borderWidth = borderWidth;
this.color = color;
}
public int getBorderWidth() {
	return borderWidth;
}
public void setBorderWidth(int borderWidth) {
	this.borderWidth = borderWidth;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

}
