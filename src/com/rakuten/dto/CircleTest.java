package com.rakuten.dto;

public class CircleTest {
public static void main(String[] args) {
	
	Circle s = new Circle(10, "red", 11.1);
	System.out.println(s.getBorderWidth());
	System.out.println(s.getColor());
	System.out.println(s.getRadius());
	
}
}
