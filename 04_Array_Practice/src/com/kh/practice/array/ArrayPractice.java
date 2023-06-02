package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		int num = arr.length;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num;
			num --;
			}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ") ;
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
	
	public void practice4() {
		String[] arr = {"사과","귤","포도","복숭아","참외"};
		System.out.print(arr[1]);
		
	}
	
	public void practice5() {	//	*********
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		int count = 0;
		System.out.print("application에 i가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i +" ");	
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);

	}
	
	public void practice6() {
		char[] week = {'월','화','수','목','금','토','일'};	// char형 배열은 ""가 아닌 '' 써야된다. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num < 7) {
			System.out.print(week[num]);
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
		}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
		
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("정수 : ");
			
			int num = sc.nextInt();
			int count = 0;
			
			if ((num >= 3) && (num % 2 == 1)) {
				int[] arr = new int[num];
				
				for(int i = 0; i < arr.length; i++) {
					if(i <= arr.length/2) {
						arr[i] = ++count;						
					}else {
						arr[i]= --count;
					}
				}
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		String[] arr = {"양념", "후라이드", "순살"};
		
		System.out.print("치킨 이름을 입력하세요. : ");
		String food = sc.nextLine();
		int yesNo = 0;
		
		for(int i = 0; i < arr.length; i++) {
	
			if(arr[i].equals(food)) {
				yesNo += 1;
				break;
			}
		}
		if(yesNo == 0) {
			System.out.println(food + "은(는) 없는 메뉴입니다.");
		}else {
			System.out.println(food + "치킨 배달 가능");
		}
		
	}	// return; 사용해보기.
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		
		char[] arr = new char[14];
		
		for(int i = 0; i < num.length(); i++) {
			arr[i] = num.charAt(i);
		}
		char[] copy = arr.clone();
		
		for(int i = 7; i < copy.length; i++) {
			copy[i] = '*';
		}
		System.out.println(copy);
		
	}
	
	public void practice11() {
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()* 10 +1);
			arr[i] = random;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] >= max) {
				max = arr[i]; 
			}
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("최대 값 : " + max);
		System.out.println("최소 값 : " + min);
	}
	
	public void practice13() {	// ******참고했음
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice14() {
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i] = random;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		int temp = 0;	// 임시저장소 .. 근데 이렇게 해도 되나...
		for(int i = 0; i < lotto.length; i++) {
			
			for(int j = i; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {	// 만약 45 > 10 이면
					temp = lotto[i];	// 45는 임시저장소
				
					lotto[i] = lotto[j];	// 앞에 자리에 10 이들어가고

					lotto[j] = temp;	// 뒤에 45가 들어간다.
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	
		
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];	// 문자가 전부 들어간 상태
		// 여기서 중복 값이 없게 뽑아줘야하는데...
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			
		}
		
		
		
		for(int i = 0; i < arr.length; i++) {

			for(int j = 0; j <= i; j++) {
				if(arr[i]==arr[j]) {
					
				}else {
					System.out.print(arr[i] + " ");
					break;
				
				}
			}

		}
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < num; i++) {
			String[] arr = new String[num];

			System.out.print(i + "번째 문자열 : ");
			String str = sc.nextLine();
			arr[i] = str;
		}

			while (true) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char yesNo = sc.nextLine().charAt(0);

				if (yesNo == 'y' || yesNo == 'Y') {
					System.out.print("더 입력하고 싶은 개수 : ");
					int add = sc.nextInt();
					String[] arr = new String[num += add];
					for (int j = i; j < num; j++) {
						arr[j] = arr[i];
					}
					for (int k = num; k < num + add; k++) {
						System.out.println(k + "번째 문자열 : ");
						String strAdd = sc.nextLine();
						arr[k] = strAdd;
					}

				} else {
					break;
				}
				for (int m = 0; m < arr.length; m++) {
					System.out.print(arr[m]);
				}
			}

		

	}

}
