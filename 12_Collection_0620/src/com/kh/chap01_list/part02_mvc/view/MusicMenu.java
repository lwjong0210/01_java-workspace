package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)

/**
 * @author lwj
 * @since 2023.06.20
 * @version 1.0
 *
 */
public class MusicMenu {

	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		
		
		while(true) {
			
			System.out.println("\n============== Welcome 별밤 ================");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();	// 메뉴선택한 후 buffer에 남아있는 개행 제거
			
			switch(menu) {
			
			case 1 :
				insertMusic();
				break;
			case 2 :
				selectMusic();
				break;
			case 3 :
				deleteMusic();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				updateMusic();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("메뉴 다시선택해");
				break;
			}
			
		}
		
	}
	
	// alt + shift + j 메소드 주석
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n============== 곡 추가 ================");
		System.out.print("추가할 곡 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("추가할 곡 아티스트 입력 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title, artist);
		System.out.println("곡 추가 성공!");

	}
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n============== 곡 조회 ================");
		ArrayList<Music> selectList = mc.selectMusic();
		
		if(selectList.isEmpty()) {
			System.out.println("없어");
		}else {
			for(int i = 0; i < selectList.size(); i++) {
				System.out.println(selectList.get(i));
			}
			
		}
		
	}
	
	/**
	 * 3. 특정 곡 삭제시켜주는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n============== 곡 삭제 ================");
		System.out.print("삭제 할 곡 제목 : ");
		String title = sc.nextLine();
		
		int result =  mc.deleteMusic(title);
		if(result > 0) {
			System.out.println("삭제 성공");
			selectMusic();
		}else {
			System.out.println("실패");
		}
	}
	
	/**
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		System.out.println("\n============== 곡 검색 ================");
		
		System.out.println("1. 제목으로 검색");
		System.out.println("2. 아티스트로 검색");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색어 : ");
		String str = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(menu, str);
		if(searchList.isEmpty()) {
			System.out.println("그런거 없어");
		}else {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	
	/**
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		System.out.println("\n============== 곡 수정 ================");
		
		System.out.print("곡 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("제목을 어떤걸로? : ");
		String upTitle = sc.nextLine();
		
		System.out.print("아티스트를 어떤걸로? : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result > 0) {
			System.out.println("성공 !");
			selectMusic();
		}else {
			System.out.println("실패 !");
			
		}
	}
	
}
