package com.sec09_01.exam01;

public class StringBuilderExample {	//StringBuilder에서 문자열 조작
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();	//StringBuilder 객체 생성
		
		//문자열을 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//index4 위치 뒤에 2를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//index4 위치의 문자를 6으로 변경
		System.out.println(sb.toString());
		
		//index6부터 index13 '전'까지를 "Book" 문자열로 대치
		sb.replace(6,  13, "Book");
		System.out.println(sb.toString());
		
		//index4부터 index5'전'까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		//총 문자 수 얻기
		int length = sb.length();
		System.out.println("총문자수: " + length);
		
		//버퍼에 있는 것을 String 타입으로 리턴
		String result = sb.toString();
		System.out.println(result);
	}
}
