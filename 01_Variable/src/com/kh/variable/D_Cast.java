package com.kh.variable;

public class D_Cast {
	/*
	 * 형변환 : 값의 자료형을 바꾸는 것
	 * 
	 * 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황)
	 * 1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다!!
	 * => 즉, 같은 자료형에 해당하는 값만 대입 가능!!
	 * => 즉, 다른 자료형의 값을 대입하고자 한다면 형 변환이 필수이다!!
	 * 
	 * [표현법] 변수명 = (자료형)값;
	 * ex) int a = (int)8.0
	 * 
	 * 2. 같은 자료형 끼리만 연산이 가능
	 * 
	 * 값 + 값 => 계산 결과도 같은 자료형으로 나옴!!
	 * 
	 * 형변환 종류
	 * 1. 자동 형변환 => 자동으로 형변환이 이뤄져서 우리가 형변환을 시킬 필요가 없음!
	 * 2. 강제(명시적) 형변환 => 자동형변환이 안돼서 우리가 직접 형변환을 해줘야함
	 * 
	 * [표현법] (바꿀자료형)값
	 * 
	 * * 주의사항
	 * boolean은 형변환 불가
	 * 
	 * 
	 */
	public void autoCasting() {
		
		/*
		 * 자동형변환
		 * 값의 범위가 작은 자료형과 큰 자료형간의 연산 시
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해줌
		 */
		
		// 1.int(4byte) => double(8byte) 반대는 불가능( 강제 형 변환 사용)
		int i1 = 12;
		double d1 = /*(double)*/i1;
		
		// 엄청 큰 박스에는  작은 박스 담을 수 있음! 자동형변환 가능!
		
		System.out.println(d1); //출력 결과 12.0
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2;
		System.out.println(result);	//출력 결과 15.3
		
		// 2. int(4byte) -> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		System.out.println(l3);	//출력 결과 1000
		
		// 3. float(4byte) => double(8byte)
		float f4 = 1.0f;	//f를 붙이는 이유 : 1.0은 double 인데 8byte 이기 때문에 4byte인 float에 들어갈 수 없음.
		double d4 = f4;
		System.out.println(d4);	//출력 결과 1.0
		
		// === 특이 케이스 ===
		// 4. long(8byte) => float(4byte)
		//	  float이 실수형이기 때문에 long형보다 표현 가능한 수의 범위가 더 커서 자동변환됨
		
		long l5 = 10000000L;
		float f5 = /*(float)*/l5;
		System.out.println(f5);	//출력 결과 1.0E7
		
		
		// 5. char(2byte) <=> int(4byte)
		int num = 'A';
		System.out.println(num);	//출력 결과 65
		
		char ch = 71;
		System.out.println(ch);	//출력 결과 G
		
		// 아스키 코드표
		
		// 각 문자들마다 고유한 숫자가 지정돼 있기 때문에 쌍방향으로 형변환 가능
		// char는 음수값 저장 불가 => 값의 범위가 0~65535
		
		// 6. byte 또는 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
//		byte b3 = b1 + b2;	//byte나 short는 연산시 무조건 int형으로 처리함.
							// 연산 결과가 범위가 더 큰 int 형임. => byte형에 대입 불가.
		byte b3 = (byte)(b1 + b2);	//강제 형 변환
		System.out.println(b3);	//출력 결과 11
		
	
	}
	
	public void forceCasting() {
		// 강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		
		
		// double(8byte) => float(4byte)
		double d1 = 4.0;
//		float f1 = d1;	//오류
		float f1 = (float)d1;
		// 강제형변환 안해주면 오류남 ! 명시적으로 형변환 해줘야함
		
//		double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		// int iSum = (double)iNum + dNum;	// 10.0 + 5.89 => 15.89
					// 연산결과인 double형이 int형에 대입 불가 => 에러 발생
		
		// 에러 해결 방법
		// 방법1. 연산결과 int형으로 강제형변환
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : " + iSum1);	// 형변환 통해서 정수값만 출력된다. 데이터 손실 발생
		// 출력값 : iSum1 : 15
		
		// 방법2. double형 값 만을 int형으로 강제형변환
		int iSum2 = iNum + (int)dNum;	// 10 + 5 = 15
		System.out.println("iSum2 : " + iSum2);	// 형변환 통해서 정수값만 출력된다. 데이터 손실 발생
		// 출력값 : iSum2 : 15
		// 실수 값을 정수형으로 강제형변환시 소수점 아래 부분은 버려짐.(* 데이터 손실이 발생할 수 있다.)
		
		// 방법3. 연산결과를 아싸리 double 변수에 대입
		double iSum3 = iNum + dNum;
		System.out.println("iSum3 : " + iSum3);	// 출력값 : iSum3 : 15.89
		
		// ** 데이터 손실 테스트
		int iNum2 = 290;	
		byte bNum2 = (byte)iNum2;	// byte(-128 ~ 127)
		System.out.println("bNum2 : " + bNum2);	// 출력값 : bNum2 : 34
		
		
	}

}
