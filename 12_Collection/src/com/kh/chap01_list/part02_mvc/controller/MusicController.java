package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청 처리해주는 클래스!! 출력문 쓰지 않기!

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();	// []
	
	{
		// 초기화 블럭
		list.add(new Music("Attention", "뉴진스"));	// [Music [Attention, 뉴진스]]
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "이원종"));
	}
	
	public void insertMusic(String title, String artist) {
		
		list.add(new Music(title, artist));
		
	}
	
	public ArrayList<Music> selectMusic() {
		// 돌려준다 => return
		return list;
	}
	
	// 1. 간단버전
	public int deleteMusic(String title) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}else {
				result = 0;
			}
		}
		return result;
	}
	
	// 2. 심화버전
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<Music>();	// 변수가 아닌 arrayList를 생성한 이유 : 검색결과가 여러개 있을 수도 있기 때문에
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		// searchList => 텅비어있을 수도 있음 | 검색된 Music 객체들이 담겨있을수도 있음
		return searchList;
	}
	
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) {	// 1. 제목으로 검색
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
					
		}else {	// 2. 가수명으로 검색
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		
		return searchList;
				
		/*	// 메뉴가 2개일때 switch문은 별로다.
		switch(menu) {
		
		case 1 :	// 1. 제목으로 검색
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			break;
		case 2 :	// 2. 가수명으로 검색
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
			break;
		}
		return searchList;
		*/
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		/*
		boolean flag = false;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setArtist(upArtist);
				list.get(i).setTitle(upTitle);
				flag = true;
			}
		}
		return flag;
		*/
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			Music m = list.get(i);
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);
				result = 1;
				break;
			}
		}
		return result;
	}

}
