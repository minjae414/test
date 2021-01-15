

public class CheckOverflowExample2 {

	public static void main(String[] args) {
		
		try {	//try : 시도 > catch : 에러 발생시 코드
			int result = safeAdd(2_100_000_000, 100_000_000);
			System.out.println("합계 결과: " + result);
		} catch(ArithmeticException e) {	//ArithmeticException : 산술적  예외
			
			//System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
			System.out.println(e.getMessage());
		}
	}
	
	public static int safeAdd(int left, int right) {	//left:20억, right:20억
		if((right>0)) {	//right > 0 => true
			if(left > (Integer.MAX_VALUE - right)) {	//20억 > 147483647 => true
				//System.out.println(Integer.MAX_VALUE - right);	//2147483647 - 20억 => 147483647
				throw new ArithmeticException("1. 오버플로우 발생");
			} 
		} else {	//right < 0 => else문이 실행
			if(left < (Integer.MIN_VALUE - right)) {
				//System.out.println(Integer.MIN_VALUE - right);
				throw new ArithmeticException("2. 언더플로우 발생");
			}
		}
		return left + right;
	}
}
