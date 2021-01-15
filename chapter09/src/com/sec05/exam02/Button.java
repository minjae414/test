package com.sec05.exam02;

public class Button {	//UI Ŭ����
	OnClickListener listener;	//�������̽� Ÿ�� �ʵ�
	
	void setOnClickListener(OnClickListener listener) {	//�Ű� ������ ������, Setter
		this.listener = listener;
	}
	
	void touch() {	//���� ��ü�� onClick() �޼ҵ� ȣ��
		listener.onClick();
	}
	
	interface OnClickListener {	//��ø �������̽�
		void onClick();
	}
}
