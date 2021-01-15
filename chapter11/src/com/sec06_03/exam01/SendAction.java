package com.sec06_03.exam01;

public class SendAction implements Action {	//발신 클래스
	@Override
	public void execute() {
		System.out.println("데이터를 보냅니다.");
	}
}
