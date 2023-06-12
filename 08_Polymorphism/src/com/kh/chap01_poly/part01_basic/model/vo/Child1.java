package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {
	
	private int z;
	
	public Child1() {
		super();	// 생략돼있음. 부모 기본 생성자가 없어지면 오류남
	}
	
	public Child1(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}

	public void printChild1() {
		System.out.println("나 첫번째 자식이야");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫번째 자식이야");
	}

}
