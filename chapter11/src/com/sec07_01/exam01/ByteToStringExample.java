package com.sec07_01.exam01;

public class ByteToStringExample {	//바이트 배열을 문자열로 변환
	public static void main(String[] args) {
		//{H, e, l, l, o, , J, a, v, a}
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);	//74가 있는 위치, 4개
		System.out.println(str2);
	}
}
