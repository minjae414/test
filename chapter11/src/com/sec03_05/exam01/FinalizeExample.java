package com.sec03_05.exam01;

public class FinalizeExample {	//finalize() 메소드 실행 확인
	public static void main(String[] args) {
		Counter counter = null;
		for(int i = 1; i <= 50; i++) {
			counter = new Counter(i);
			
			//Counter 객체를 쓰레기로 만듦
			counter = null;
			
			//쓰레기 수집기 실행 요청
			System.gc();
		}
	}
}
