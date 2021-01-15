package com.sec05.exam02;

public class Window {	//UI Ŭ����
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {	//�ʵ� ����� �ʱⰪ ����
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	Window(){
		button1.setOnClickListener(listener);	//�Ű������� �ʵ� ����
		button2.setOnClickListener(new Button.OnClickListener() {	//�Ű������� �͸� ���� ��ü ����
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		});
	}
}
