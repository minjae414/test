/*
 * ActionExample 클래스의 main() 메소드에서 Action의 익명 구현 객체를 만들어 다음과 같은 실행 결과가 나올 수 있도록 박스 안에 들아갈 코드를 작성해보세요.
 */

package com.exer05;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		
		action.work();
	}
}
