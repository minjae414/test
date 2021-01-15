package com.sec07.exam01;

public class BalanceInsufficientException extends Exception {	//사용자 정의 예외 클래스
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
