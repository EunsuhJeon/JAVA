package com.kh.first.run;

import com.kh.first.MethodTest; // 해당 패키지에 있는 클래스를 가져다 쓰겠다고 선언한 부분

public class Run {

	public static void main(String[] args) {
		
		
		/*
		 * 같은 클래스의 메소드를 호출할 때는 단순히 호출만 하면 되었다! ex(메소드명();)
		 * 호출할 메소드 이름();
		 * 그런데, 다른 클래스의 메소드를 호출할 경우는?
		 * 
		 */
		
		System.out.println("메인메소드 실행 시작!!");
		
		//1. 호출할 메소드가 있는 클래스(틀)을 가진 객체를 생성(복사라고 생각하면 쉬움)해준다.
		// [표현법]
		// 클래스명 객체의이름 = new 클래스이름();
		MethodTest mt = new MethodTest(); //new 라는 단어를 사용
		
		// => 기본적으로 현재 com.kh.first.run 패키지 안에 MethodTest 라는 클래스가 존재하지 않아서
		//	  찾을 수가 없기 때문에 import 문으로 MethodTest 클래스의 위치를 찾아준 것.
		
		// com.kh.first.MethodTest mt = new com.kh.first.MethodTest(); 
		// ↑ 이렇게 작성할 경우 import 문을 작성하지 않아도 됨 (하지만 복잡하기 때문에 이 방식은 잘 사용하지 않음.)
		
		//2. 생성 후 이제 해당 클래스에 있는  메소드를 호출해주면 된다.
		//[표현법]
		// 생성한녀석의이름.호출할메소드이름();
		mt.testPrint();
		
	}
}
