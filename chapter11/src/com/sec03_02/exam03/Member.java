package com.sec03_02.exam03;

public class Member {	//메소드 재정의 추가
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	//id가 동일한 문자열인 경우 같은 해시 코드를 리턴
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
