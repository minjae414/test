package com.sec07_02.exam06;

public class StringReplaceExample {	//���ڿ� ��ġ�ϱ�
	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "Java");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
