package com.sec04.exam02;

public class RemoteControlExample {	//디폴트 메소드 사용
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
	}
}
