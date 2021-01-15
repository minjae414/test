

public class CheckOverflowExample {

	public static void main(String[] args) {
		
		try {	//try : 시도 > catch : 에러 발생시 코드
			
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {	//ArithmeticException : 산술적  예외
			
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	
	public static int safeAdd(int left, int right) {
		
		if((right>0)) {
			
			if(left>(Integer.MAX_VALUE - right)) {
				
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return left + right;
	}
}
