package com.sec06_03.exam01;

public class NewInstanceExample {	//���� ��ü ���� �� ����
	public static void main(String[] args) {
		try {
			//7���� 8�� ���� �����ư��� �ּ� > ����
			Class clazz = Class.forName("com.sec06_03.exam01.SendAction");
			//Class clazz = Class.forName("com.sec06_03.exam01.SendAction");
			Action action = (Action)clazz.newInstance();
			action.execute();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(InstantiationException e) {
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
