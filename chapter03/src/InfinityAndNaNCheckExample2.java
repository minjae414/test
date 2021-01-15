

public class InfinityAndNaNCheckExample2 {

	public static void main(String[] args) {
		
		/*
		 * 5 / 0, 5 % 0 => ������O, ����� ���� �߻�(ArithmeticException)
		 * 
		 * 5 / 0.0, 5 / 0.0f => Infinity(���Ѵ�), ���� �߻�X
		 * 5 % 0.0, 5 % 0.0f => NaN(Not a Number), ���� �߻�X 
		 * 
		 * Infinity Ȯ�� �޼ҵ� : Double.isInfinite()
		 * NaN Ȯ�� �޼ҵ� : Double.isNaN() 
		 */
		
		int x = 5;
		double y = 0.0;
		
		double z1 = x / y;	//Infinite
		double z2 = x % y;	//NaN
		
		System.out.println(Double.isInfinite(z1));
		System.out.println(Double.isNaN(z2));
		
		System.out.println(z1 + 2);	//������ �Ǵ� �ڵ�
		System.out.println(z2 + 2);	//������ �Ǵ� �ڵ�
		
	}
}
