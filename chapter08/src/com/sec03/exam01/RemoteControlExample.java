package com.sec03.exam01;

public class RemoteControlExample {	//인터페이스에 구현 객체 대입
	public static void main(String[] args) {
		RemoteControl rc;	//1. 인터페이스 변수 선언
		
		rc = new Television();	//2. 구현 객체 대입
		rc = new Audio();	//2. 구현 객체 대입
	}
}
