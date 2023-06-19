package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Employee;

public class ArrayListRun {

	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee());
		emp.add(new Employee(1, "홍길동", 19, 'M', "01022223333", "서울잠실"));
		emp.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "마곡"));
		
		// for
		for(int i = 0; i < emp.size(); i++) {
			System.out.println("emp[" + i + "] : " + emp.get(i).information());
		}
		
		System.out.println("======================================================================");
		
		/*
		// 향상된 for 문 
		int count = 0;
		for(Employee e : emp) {
			System.out.println("emp[" + count++ + "] : " + e.information());
		}
		System.out.println("======================================================================");
		*/
		
		emp.set(0, new Employee(0, "이원종", "영업부", "회장", 25, 'M', 100000000, 0.5, "01012345678", "경기도 광명"));
		emp.get(1).setDept("영업부");
		emp.get(1).setJob("사장");
		emp.get(1).setSalary(4000000);
		emp.get(1).setBonusPoint(0.3);
		
		for(int i = 0; i < emp.size()-1; i++) {
			System.out.println("emp[" + i + "] : " + emp.get(i).information());
		}
		System.out.println("======================================================================");
		/*
		int total = 0;
		for(int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i).getEmpName() + "의 연봉 : " + (int)(emp.get(i).getSalary() + emp.get(i).getSalary()* emp.get(i).getBonusPoint())*12 + "원");
			total += (int)(emp.get(i).getSalary() + emp.get(i).getSalary()* emp.get(i).getBonusPoint())*12;
		}
		*/
		int total1 = 0;
		for(Employee e : emp) {
			System.out.println(e.getEmpName() + "의 연봉 : " + (int)(e.getSalary() + (e.getSalary() * e.getBonusPoint()))*12 + "원");
			total1 += (int)(e.getSalary() + (e.getSalary() * e.getBonusPoint()))*12;
		}
		System.out.println("======================================================================");
		
//		System.out.println("직원들의 연봉의 평균 : " + total / emp.size() + "원");
		System.out.println("직원들의 연봉의 평균 : " + total1 / emp.size() + "원");
	}

}
