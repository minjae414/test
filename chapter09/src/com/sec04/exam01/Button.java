package com.sec04.exam01;

public class Button {	//중첩 인터페이스
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	//매개 변수의 다형성
	}
	
	void touch() {
		listener.onClick();	//구현 객체의 onClick() 메소드 호출
	}
	
	interface OnClickListener{
		void onClick();	//중첩 인터페이스
	}
}
