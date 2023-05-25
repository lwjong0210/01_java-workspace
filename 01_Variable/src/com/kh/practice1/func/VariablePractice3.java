package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void squre() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double squreWidth = sc.nextDouble();
		
		System.out.print("세로 : ");
		double squreLength = sc.nextDouble();
		
		System.out.println("면적 : " + (squreWidth * squreLength));
		System.out.println("둘레 : " + ((squreWidth + squreLength) * 2));
		
		sc.close();
	}
	
	

}
