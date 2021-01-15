

public class InfinityAndNaNCheckExample2 {

	public static void main(String[] args) {
		
		/*
		 * 5 / 0, 5 % 0 => 컴파일O, 실행시 예외 발생(ArithmeticException)
		 * 
		 * 5 / 0.0, 5 / 0.0f => Infinity(무한대), 예외 발생X
		 * 5 % 0.0, 5 % 0.0f => NaN(Not a Number), 예외 발생X 
		 * 
		 * Infinity 확인 메소드 : Double.isInfinite()
		 * NaN 확인 메소드 : Double.isNaN() 
		 */
		
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;	//Infinite
		double z2 = x % y;	//NaN
		
		System.out.println(Double.isInfinite(z1));
		System.out.println(Double.isNaN(z2));
		
		System.out.println(z1 + 2);	//문제가 되는 코드
		System.out.println(z2 + 2);	//문제가 되는 코드
		
	}
}
