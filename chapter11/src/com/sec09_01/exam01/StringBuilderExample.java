package com.sec09_01.exam01;

public class StringBuilderExample {	//StringBuilder���� ���ڿ� ����
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();	//StringBuilder ��ü ����
		
		//���ڿ��� ���� �߰�
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//index4 ��ġ �ڿ� 2�� ����
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		//index4 ��ġ�� ���ڸ� 6���� ����
		System.out.println(sb.toString());
		
		//index6���� index13 '��'������ "Book" ���ڿ��� ��ġ
		sb.replace(6,  13, "Book");
		System.out.println(sb.toString());
		
		//index4���� index5'��'���� ����
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		//�� ���� �� ���
		int length = sb.length();
		System.out.println("�ѹ��ڼ�: " + length);
		
		//���ۿ� �ִ� ���� String Ÿ������ ����
		String result = sb.toString();
		System.out.println(result);
	}
}
