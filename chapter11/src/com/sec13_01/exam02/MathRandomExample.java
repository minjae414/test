package com.sec13_01.exam02;

public class MathRandomExample {	//임의의 주사위의 눈 얻기
	public static void main(String[] args) {
		int num = (int)(Math.random() * 6) + 1;
		System.out.println("주사위 눈: " + num);

	}
}
