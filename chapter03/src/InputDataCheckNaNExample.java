
public class InputDataCheckNaNExample {

		public static void main(String[] args) {
			
			String userInput = "NaN";	//사용자로부터 입력받은 값
			double val = Double.valueOf(userInput);	//입력값을 double 타입으로 변환
			
			double currentBalance = 10000.0;
			
			if(Double.isNaN(val)) {	//NaN을 검사함
				System.out.println("Nan이 입력되어 처리할 수 없음");
				val = 0.0;	//NaN일 경우 실행되는 코드
			}
			
			currentBalance += val;	//currentBalance에 NaN이 저장됨; > isNaN에 의해 currentBalance의 원래 값이 유지 됨
			System.out.println(currentBalance);
			
		}
}
