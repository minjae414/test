package com.sec04.exam01;

public class ButtonExample {	//��ư �̺�Ʈ ó��
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
