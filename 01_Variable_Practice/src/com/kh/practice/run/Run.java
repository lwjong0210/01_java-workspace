package com.kh.practice1.run;

import com.kh.practice1.func.VariablePractice1;
import com.kh.practice1.func.VariablePractice2;
import com.kh.practice1.func.VariablePractice3;
import com.kh.practice1.func.VariablePractice4;


public class Run {
	public static void main(String[] args) {
		
		VariablePractice1 vp1 = new VariablePractice1();
		vp1.userInfo();
		
		VariablePractice2 vp2 = new VariablePractice2();
		vp2.calc();
		
		VariablePractice3 vp3 = new VariablePractice3();
		vp3.squre();
		
		VariablePractice4 vp4 = new VariablePractice4();
		vp4.engKey();
	}

}
