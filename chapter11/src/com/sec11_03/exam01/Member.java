package com.sec11_03.exam01;

public class Member implements Comparable<Member> {	//Comparable ���� Ŭ����
	String name;
	Member(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.name);
	}
}
