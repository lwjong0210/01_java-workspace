package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {
	public static void main(String[] args) {
		
		
		
		Person p = new Person();
		
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴값을 곧바로 알아보면
		// JVM이 초기화(값 세팅)까지 진행해줬음!!
		
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("이원종");
		p.setAge(25);
		p.setGender('M');
		p.setPhone("010-1234-5678");
		p.setEmail("wonjong@gmail.com");
		
		System.out.println("=== 값 대입후 ===");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		// 위의 코드는 너무 귀찮다. 그래서 information 메소드를 생성하고 간단하게 출력해보자.
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p.information());
		
		System.out.println();
		System.out.println("=================");
		System.out.println();
		
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
		System.out.println("=================");
		System.out.println();
		
		// pName : xxx, price : xxx, brand : xxx로 출력하고싶다
		System.out.println("pName : " + iPhone.getpName() + ", price : " + iPhone.getPrice() + ", brand : " + iPhone.getBrand());
		System.out.println("pName : " + galaxy.getpName() + ", price : " + galaxy.getPrice() + ", brand : " + galaxy.getBrand());
		System.out.println("pName : " + vega.getpName() + ", price : " + vega.getPrice() + ", brand : " + vega.getBrand());
	
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(iPhone.information());
		System.out.println(galaxy.information());
		System.out.println(vega.information());
	}

}
