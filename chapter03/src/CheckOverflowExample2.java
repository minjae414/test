

public class CheckOverflowExample2 {

	public static void main(String[] args) {
		
		try {	//try : �õ� > catch : ���� �߻��� �ڵ�
			int result = safeAdd(2_100_000_000, 100_000_000);
			System.out.println("�հ� ���: " + result);
		} catch(ArithmeticException e) {	//ArithmeticException : �����  ����
			
			//System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
			System.out.println(e.getMessage());
		}
	}
	
	public static int safeAdd(int left, int right) {	//left:20��, right:20��
		if((right>0)) {	//right > 0 => true
			if(left > (Integer.MAX_VALUE - right)) {	//20�� > 147483647 => true
				//System.out.println(Integer.MAX_VALUE - right);	//2147483647 - 20�� => 147483647
				throw new ArithmeticException("1. �����÷ο� �߻�");
			} 
		} else {	//right < 0 => else���� ����
			if(left < (Integer.MIN_VALUE - right)) {
				//System.out.println(Integer.MIN_VALUE - right);
				throw new ArithmeticException("2. ����÷ο� �߻�");
			}
		}
		return left + right;
	}
}
