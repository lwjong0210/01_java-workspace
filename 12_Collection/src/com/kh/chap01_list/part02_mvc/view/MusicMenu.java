package com.kh.chap01_list.part02_mvc.view;

import java.util.Scanner;

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
				System.out.println("프로그램을 종료합니다. 이용해줘서 감사합니다.");
				return;
			default :
				System.out.println("메뉴를 잘못 선택했습니다. 다시 선택해주세요.");
				break;
			}
			
		}
		
	}
	
	// alt + shift + j 메소드 주석
	/**
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		
		System.out.println("\n============== 새로운 곡 추가 ================");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.println("가수 입력 : ");
		String artist = sc.nextLine();
		
		// 곡 추가 요청 보내기! (사용자의 요청 처리해주는 컨트롤러단에!)
		// 사용자가 입력한 곡명, 가수명 같이 넘기면서!!
		// 즉, Controller 메소드 호출
		
		
	
		
		
	}
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		
	}
	
	/**
	 * 3. 특정 곡 삭제시켜주는 서브화면
	 */
	public void deleteMusic() {
		
	}
	
	/**
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		
	}
	
	/**
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		
	}
	
	
	
	
}
