package com.kh.variable;


public class C_Printf {
	public void printfTest() {
		
//		System.out.print(출력하고자 하는 값); // 출력만함 (줄바꿈 발생x)
//		System.out.println(출력하고자 하는 값); // 출력 후 (줄바꿈 발생o)
		
//		System.out.printf("출력하고자 하는 형식(포맷)",출력하고자 하는 값);
//		출력하고자 하는 값들이 제시한 형식(포맷)에 맞춰서 출력만 진행 (줄바꿈 발생 x)
		
		/*
		 * 포맷 안에서 쓰일 수 있는 키워드
		 * %d : 정수
		 * %c : 문자
		 * %s : 문자열 (문자도 가능)
		 * %f : 실수 
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// "10 20"
		System.out.println(iNum1 + " " + iNum2);	// 다른자료형 + 문자열 = 문자열
		System.out.println(iNum1 + iNum2);
		
		System.out.printf("%d%d", iNum1,iNum2);
		System.out.println();	// printf는 줄바꿈 안돼서 이걸 넣어줘야함
//		System.out.printf("%d%d", iNum1);	에java.util.MissingFormatArgumentException
		System.out.printf("%d%d\n", iNum1,iNum2,iNum2);	// 마지막 iNum2는 무시됨
		
		// 10 20% 로 출력하고 싶다.
//		System.out.printf("%d %d%",iNum1, iNum2);	// %뒤에는 원래 포맷키워드 와야됨..
		
		// 근데 진짜로 %를 출력하고 싶다면?
		System.out.printf("%d %d%%",iNum1, iNum2);
		System.out.println();	// printf는 줄바꿈 안돼서 이걸 넣어줘야함
		
		// 정렬하고자 할 때 많이 쓴다.
		System.out.printf("%5d\n",iNum1);	// 양수 5 오른쪽 정렬
		System.out.printf("%-5d\n",iNum2);	// 음수 5 왼쪽 정렬
		
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 16);
		
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f\t%f", dNum1, dNum2);	// 무조건 소수점 아래 6번째 자리까지 보여줌	, \t는 tab
		System.out.println();
		// 소숫점자리 조절
		System.out.printf("%.2f %.1f\n", dNum1,dNum2);
		
		char ch = 'a';
		String str = "hello";
				
		System.out.printf("%c %s %s\n", ch, str, ch);
		System.out.printf("%C %S %S\n", ch, str, ch);	//대문자로 출력된다.
		
		
	}
}
