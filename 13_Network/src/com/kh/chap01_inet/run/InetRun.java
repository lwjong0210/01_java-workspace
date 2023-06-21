package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		/*
		 * * 네트워크(Network) : 여러대 컴퓨터들이 연결되어 있는 통신망 같은거
		 * 						=> 이런 네트워크를 통해 서로간의 데이터 교환 가능!!
		 * 
		 * * IP 주소 : 네트워크 상에 각 컴퓨터들을 식별해줄 수 있는 번호(컴퓨터 주민번호)
		 * 
		 * * 서버와 클라이언트
		 * > 서버			: 클라이언트(고객)에게 서비스를 제공해주는 프로그램 ( 클라이언트의 요청을 처리해서 응답해주는) : 서빙하는 역할함..
		 * > 클라이언트		: 서버에 요청하는 컴퓨터 (서비스를 제공 받는 고객)
		 * 
		 * - 서버에 요청하기 위해서는 그 요청하고자 하는 서버의 IP주소(또는 도메인명), 포트번호 알아야 됨!
		 */

		// InetAddress : 네트워크 정보(ip주소 관련)를 확인 할 수 있는 클래스
		
		try {
			InetAddress localHost = InetAddress.getLocalHost();	// getLocalHost는 static이라 new 안해도 됨 
			System.out.println(localHost);	// 내 pc명 / 내 ip 주소
			
			System.out.println("내 PC명 : " + localHost.getHostName());
			System.out.println("내 IP주소 : " + localHost.getHostAddress());
			
			System.out.println("================================================");
			
			// 내가 알고있는 도메인을 통해서 그 서버 관련된 정보 얻기
			InetAddress googleHost = InetAddress.getByName("www.google.com");	// 도메인명을 통해서 해당 호스트에 대한 정보 반환
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 IP주소 : " + googleHost.getHostAddress());
			
			System.out.println("================================================");
			
			// 도메인을 통해서 서버관련한것들을 배열로 받을 수 있음
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");	// 객체 크기 getAllByName 크기만큼 자동 생성
			System.out.println("네이버 호스트 개수 : " + naverHost.length);
			
			for(InetAddress n : naverHost) {
				System.out.println("네이버 서버명 : " + n.getHostName());
				System.out.println("네이버 IP주소 : " + n.getHostAddress());
			}
			/*
			 * * 현재 구동중인 서버가 있으면
			 * 	 클라이언트 그 서버로 요청 보낼 수 있음! => 응답결과 돌려줌
			 * 
			 * 	 - 요청과 응답에 의해서 프로그램은 돌아감! ("통신"한다 표현)
			 * 	 - 웹에서의 통신방식 : HTTP 프로토콜 통신
			 * 	 
			 * * 자바만을 가지고 서버와 클라이언트 간의 간단한 통신 해보기!!
			 * 	 이때 데이터를 입출력하고자 한다면 서버와 클라이언트 간의 스트림(연결통로)이 필요함!
			 * 	 
			 * 	 * 소켓 : 프로세스간의 통신을 담당하는 것! (스트림을 연결하기 위한 문)
			 * 	 
			 * 	 * 소켓 프로그래밍 (TCP 방식 / UDP 방식)
			 *   - TCP 방식 : 데이터 전송속도가 느림! 데이터가 정확하고 안정적으로 전달 가능함! (신뢰성이 요구되는 프로그램 : http, 이메일) (클라이언트가 요청하고 서버가 응답하는 느낌)
			 *   - UDP 방식 : 데이터 전송속도가 빠름! 신뢰성 없는 데이터 전달 될 수 있음! (데이터를 빠른 속도로 전송하고자 하는 프로그램 : 실시간 동영상 서비스) (클라이언트가 일방적으로 요청하는 느낌)
			 *   
			 *   
			 *   
			 */
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
