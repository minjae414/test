package com.sec02_01.exam01;

import java.awt.*;

public class BeepPrintExample {	//���� �����常 �̿��� ���
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	//Toolkit ��ü ���
		for(int i = 0; i < 5; i++) {
			toolkit.beep();	//������ �߻�
			try {Thread.sleep(500);/*0.5�ʰ� �Ͻ�����*/} catch(Exception e) {}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);/*0.5�ʰ� �Ͻ�����*/} catch(Exception e) {}
		}
	}
}
