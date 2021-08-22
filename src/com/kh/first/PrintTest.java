package com.kh.first;

public class PrintTest {

	// 출력문 실습
	public static void main(String[] args) {
		
		System.out.println("println은 줄바꿈");
		
		System.out.print("print는 줄바꿈 x"); // 문자열(문장)의 경우는 쌍따옴표로 묶는다
		
		System.out.print(12345); // 숫자의 경우는 그냥 적어준다
		
		System.out.print('A'); // 문자(한 글자)의 경우는 홑따옴표로 묶는다
		
		// 줄바꿈을 하고싶지만 print 문을 써야하는 경우에는?
		System.out.print("줄바꿈이 하고싶어!\n");
		System.out.print("줄바꿈 시켜줘!\n");
		System.out.print(12345+"\n");
		System.out.print('A'+"\n");
		
		
		// \n : 개행문자, 줄바꿈 시켜주는 역할, 즉 엔터 키를 누르는 것과 같다.
		// 문자+숫자, 문자+문자열, 숫자+문자열과 같이 서로 다른 형태를 붙여서 나타내주는 기호는 '+'
		// 숫자(따옴표 없음),문자(작은따옴표)같은 경우는 +"\n" 과 같은 형태로 작성해준다.
		
		
		System.out.print("Hi\n");
		System.out.print("everyone!!\n");
		System.out.print("Hi\neveryone!!\n");
		
		System.out.print("\\n");
		// '\n'이라는 텍스트 자체를 출력하고 싶은 경우 위와 같이 작성한다.
		
		System.out.print(123+"\n"+456+"\n");
		
		System.out.println("\\"); // 역슬래시는 그 자체만으로는 문자로 인식이 되지 않기 때문에 문자로 인식하고 싶을 때는 역슬래시를 한 번 더 써준다.
		
	}
}
