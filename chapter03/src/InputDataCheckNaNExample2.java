
public class InputDataCheckNaNExample2 {

		public static void main(String[] args) {
			
			/*
			String userInput = "NaNa";	//문자열은 숫자가 아님
			 
			double val = Double.valueOf(userInput);	//Double.valueOf(a) : a를 double형으로 바꿔는 메소드
			
			double currentBalance = 10000.0;
			currentBalance += val;	//currentBalance = currentBalance + val;
			//10000.0 + NaN => NaN
			System.out.println(currentBalance);	//NaN
			*/
			
			/*
			String userInput = "       1234  ";	//숫자 사이 공백은 불가
			double val = Double.valueOf(userInput);
			System.out.println(val);
			*/
			
			String userInput = "NaN";
			double currentBalance = 10000.0;
			double val = Double.valueOf(userInput);
			
			if(Double.isNaN(val)) {
				System.out.println("val 변수에 NaN이 입력되어 처리할 수 없음");
				System.out.println("연산이 가능하도록 val값을 0.0으로 저장합니다");
				val = 0.0;
			}
			
			currentBalance += val;
			
			System.out.println(currentBalance);
		}
}
