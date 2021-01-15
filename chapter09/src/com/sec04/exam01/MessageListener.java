package com.sec04.exam01;

public class MessageListener implements Button.OnClickListener {	//구현 클래스
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}
