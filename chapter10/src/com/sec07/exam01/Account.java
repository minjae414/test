package com.sec07.exam01;

public class Account {	//사용자 정의 예외 발생시키기
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException {	//사용자 정의 예외 떠넘기기
		if(balance < money) {
			//사용자 정의 예외 발생
			throw new BalanceInsufficientException("잔고부족: " + (money - balance) + " 모자람");
		}
		balance -= money;
	}
}
