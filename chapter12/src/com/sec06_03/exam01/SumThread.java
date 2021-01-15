package com.sec06_03.exam01;

public class SumThread extends Thread {	//1부터 100까지 합을 계산하는 스레드
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}
	
	public void run() {
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}
