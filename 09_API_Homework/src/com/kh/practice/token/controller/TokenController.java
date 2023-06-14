package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		String string = "";
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		StringTokenizer stn = new StringTokenizer(str, " ");
		while(stn.hasMoreTokens()) {
			string += stn.nextToken();
		}
		
		return string;
	}
	
	public String firstCap(String input){
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		// input = application
		/*
		char ch = input.toUpperCase().charAt(0);
		char[] arr = input.toCharArray();
		arr[0] = ch;
		return String.valueOf(arr);
		*/
		
		String a = input.substring(0,1).toUpperCase(); //A
		String b = input.substring(1); // pplication
		input =  a.concat(b);
		return input;
		
	}
	
	public int findChar(String input, char one){
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
		char[] arr = input.toCharArray();
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		return count;
	}
	

}
