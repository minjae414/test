package com.sec05.exam02;

public class Button {	//UI 클래스
	OnClickListener listener;	//인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {	//매개 변수의 다형성, Setter
		this.listener = listener;
	}
	
	void touch() {	//구현 객체의 onClick() 메소드 호출
		listener.onClick();
	}
	
	interface OnClickListener {	//중첩 인터페이스
		void onClick();
	}
}
