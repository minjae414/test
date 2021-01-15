package com.sec07.exam01;

public interface MyInterface {	//기존 인터페이스
	public void method1();
	
	//기존 인터페이스에 새로운 디폴트 메소드 추가
	public default void method2() {
		System.out.println("MyInterface-method2() 실행");
	}
}
