package com.sec07_02.exam01;

public class StringCharAtExample {	//�ֹε�Ϲ�ȣ���� ���ڿ� ���ڸ� �����ϴ� ���
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("���� �Դϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("���� �Դϴ�.");
			break;
		}
	}
}
