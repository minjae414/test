package com.sec05.exam02;

public class HankookTire implements Tire {	//구현 클래스
	@Override
	public void roll() {	//Tire 인터페이스 구현
		System.out.println("한국 타이어가 굴러갑니다.");
	}

}
