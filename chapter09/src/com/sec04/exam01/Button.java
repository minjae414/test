package com.sec04.exam01;

public class Button {	//��ø �������̽�
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;	//�Ű� ������ ������
	}
	
	void touch() {
		listener.onClick();	//���� ��ü�� onClick() �޼ҵ� ȣ��
	}
	
	interface OnClickListener{
		void onClick();	//��ø �������̽�
	}
}
