package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {
	public static void main(String[] args) {
		
		Product iPhone = new Product();
		iPhone.setpName("iPhone13");
		iPhone.setPrice(800000);
		iPhone.setBrand("apple");
		
		Product galaxy = new Product();
		galaxy.setpName("note20");
		galaxy.setPrice(500000);
		galaxy.setBrand("samsung");
		
		Product vega = new Product();
		vega.setpName("vegaRacer");
		vega.setPrice(200000);
		vega.setBrand("pantech");
		
		System.out.println("===상품1===");
		System.out.println("상품명 : " + iPhone.getpName());
		System.out.println("가격 : " + iPhone.getPrice() + "원");
		System.out.println("브랜드 : " + iPhone.getBrand());
		
		System.out.println("\n===상품2===");
		System.out.println("상품명 : " + galaxy.getpName());
		System.out.println("가격 : " + galaxy.getPrice() + "원");
		System.out.println("브랜드 : " + galaxy.getBrand());
		
		System.out.println("\n===상품3===");
		System.out.println("상품명 : " + vega.getpName());
		System.out.println("가격 : " + vega.getPrice() + "원");
		System.out.println("브랜드 : " + vega.getBrand());
		
		System.out.println();
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
	}

}
