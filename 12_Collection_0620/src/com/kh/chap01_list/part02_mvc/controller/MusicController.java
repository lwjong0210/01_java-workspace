package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청 처리해주는 클래스!! 출력문 쓰지 않기!

public class MusicController {
	
	private ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("새삥", "지코"));
		list.add(new Music("헌삥", "지아코"));
		list.add(new Music("몰루", "이원종"));
	}
	
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	public ArrayList<Music> selectMusic() {
		return list; 
	}
	
	public int deleteMusic(String title) {
		
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		return result;
		
	}
	
	public ArrayList<Music> searchMusic(int menu, String str) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) {	// 제목 검색
			
			for(int i = 0 ; i < list.size(); i++) {
				if(list.get(i).getTitle().contains(str)) {
					searchList.add(list.get(i));
				}
			}
			
			
		}else {	// 아티스트 검색
			for(int i = 0 ; i < list.size(); i++) {
				if(list.get(i).getArtist().contains(str)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList;
	}
	
	public int updateMusic(String title, String upTitle, String upArtist) {
		int result = 0;
		for(int i = 0; i < list.size(); i++) {
			
			Music ms = list.get(i);
			
			if(ms.getTitle().equals(title)) {
				ms.setTitle(upTitle);
				ms.setArtist(upArtist);
				result = 1;
				break;
			}
			
		}
		return result;
	}


}
