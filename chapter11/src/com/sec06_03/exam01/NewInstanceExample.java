package com.sec06_03.exam01;

public class NewInstanceExample {	//동적 객체 생성 및 실행
	public static void main(String[] args) {
		try {
			//7번과 8번 라인 번갈아가며 주석 > 실행
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
