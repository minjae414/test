package sec06.exam01.package2;	// 패키지가 다름

import sec06.exam01.package1.A;

public class D extends A {	//상속
	public D() {
		super();	// 다른 클래스이기 떄문에 new 연산자로는 생성자 직접 호출 불가 > super()로 A 생성자 호출
		this.field = "value";
		this.method();
	}
}
