package com.hw2.model.vo;

public class Circle extends Point {

	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.print(", 면적 : " + Math.PI * getRadius() * getRadius() + ", 둘레 : " + Math.PI * getRadius() * 2);
	}
}
