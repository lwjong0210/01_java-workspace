package com.k.array;

public class B_ArrayCopy {
	// 배열 복사
	public void method1() {
		int[] origin = {1,2,3,4,5};
		
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		
		System.out.println();
		// 단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		int[] copy = origin;
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[2] = 99;
		System.out.println("----- 복사본 배열 값 변경 후 -----");
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		
		System.out.println();
		// 단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// copy[2]를 가지고 수정해도 원본까지 변경되어 있음
		// 왜 ? origin 과 copy가 같은 곳을 참조하고 있기 때문 (즉, 같은 주소값)
		System.out.println("origin주소값 : " + origin.hashCode());
		System.out.println("copy주소값 : " + copy.hashCode());
		
		// 얕은 복사 : 주소값을 복사
		
	}
	// 얕은 복사의 문제를 해결하기 위해서 깊은 복사
	public void method2() {
		// 1. for문을 활용한 방법
		//	새로운 배열을 아싸리 생성한 후 반복문을 활용해서
		//	원본배열의 값들을 새로이 만든 배열에 대입하는 방법
		int[] origin = {1,2,3,4,5};
		
//		int[] copy = origin; //얕은복사 : 주소값 대입
		int[] copy = new int[5];
		
//		copy[0] = origin[0];
//		copy[1] = origin[1];
//		copy[2] = origin[2];
//		copy[3] = origin[3];
//		copy[4] = origin[4];
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
		}
		
		copy[2] = 99;
		
		System.out.println("----- 복사본 배열 값 변경 후 -----");
		System.out.println("== 원본 배열 출력 ==");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]+ " ");
		}
		
		System.out.println();
		// 단순하게 origin을 다시 대입시킨 copy 배열 셋팅
		System.out.println("== 복사본 배열 출력 ==");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		System.out.println("origin주소값 : " + origin.hashCode());
		System.out.println("copy주소값 : " + copy.hashCode());
	}
	public void method3() {
		// 2. 아싸리 새로운 배열 생성 후 System 이라는 클래스에서의 arraycopy() 메소드를 이용한 복사
		int[] origin = {1,2,3,4,5};
		int[] copy = new int[10];	// 넉넉하게 크게 생성 / 0~9 인덱스까지 0이 다 담겨있을것!
		
		// System.arraycopy(원본배열명, 복사시작할인덱스, 본사본배열명, 복사본배열의 복사될 시작 인덱스,복사할 개수);
//		System.arraycopy(origin, 0, copy, 0, 5);
//		System.arraycopy(origin, 0, copy, 2, 5);
		System.arraycopy(origin, 1, copy, 3, 3);
		
		for(int i = 0; i < copy.length; i ++) {
			System.out.print(copy[i] + " ");
		}
	}
}
