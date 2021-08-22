package com.kh.first;

// 주석: 소스코드 내에 해당 소스코드에 대한 설명을 기술하고 싶을 때 사용한다.
/* 
 * 여러줄
 * 주
 * 석
 * */

public class HelloWorld { // HelloWorld 클래스 영역 시작
	
	// 클래스란?
	// 유사한 특징을 지닌 변수나 메소드들을 묶어놓은 집합체
	
	/*
	 * 클래스 생성 시 주의 해야할 점!
	 * 1. 한 패키지 내에 동일한 이름의 클래스들은 생성 불가 (즉, 중복불가)
	 * 		서로 다른 패키지 내에 서로 동일한 클래스 이름이 존재하는 것은 가능
	 * 예)  com.kh.first.HelloWord vs com.kh.second,HelloWorld
	 * 2. 기본패키지에 클래스를 만드는 것은 권장하지 않는다.
	 * 	=> 클래스를 정리하기 힘듦 (패키지를 기준으로 카테고리 별로 분류한다고 생각하자)
	 * 	=> 기본패키지에 만들어진 클래스들은 다른 패키지에서 사용이 불가 (가장 큰 이유)
	 * 
	 */
	public static void main(String[] args) { // main 메소드 영역 시작
		// 실행하고자 하는 내용
		
		test();
		
		System.out.println("Hi Everyone!!");
		/*
		 * 메소드란?
		 * 하나의 동작 기능 단위
		 * 한 클래스 안에 여러개의 메소드를 작성 가능
		 * 일반메소드와 main 메소드로 나뉜다.
		 * 
		 * main 메소드
		 * 프로그램이 실행될 때 가장 먼저 찾아져서 실행되는 메소드
		 * 클래스에 무조건 main 메소드가 존재할 필요는 없지만,프로그램 당 무조건 최소 1개 이상 존재해야 함
		 */

		//test(); // 메소드 호출 : test 메소드 실행
	}
	
	public static void test() {
		
		System.out.println("test 메소드 실행중!!");
		
		
	}
	
}
