package com.sec03_03.exam02;

public class SmartPhoneExample {	//객체의 문자 정보(toString() 메소드)
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		//myPhone.toString()을 자동호출해서 리턴값을 얻은 후 출력
		System.out.println(myPhone);	
	}
}
