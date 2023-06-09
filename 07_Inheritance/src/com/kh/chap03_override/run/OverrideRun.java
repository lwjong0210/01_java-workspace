package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {
	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "나수학", 100);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 300);
		
		System.out.println(bk1);
		System.out.println(bk2);
		
	}

}
