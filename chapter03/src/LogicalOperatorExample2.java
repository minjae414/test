
public class LogicalOperatorExample2 {

	public static void main(String[] args) {
		
		/*int charCode = 'A';
		System.out.println("charCode: " + charCode);	// 유니코드 확인하는 법
		
		if((charCode >= 65) & (charCode <=90)) {	// 양 변이 참이라서 true > if문 실행
			System.out.println("대문자 이군요.");	// 유니코드로 영문 대문자들이 A~Z 65~90의 값을 가짐
												// 영문 소문자 a~z 97~122의 값을 가짐
		}*/
		/*
		 * 논리값1 & 논리값2	=> 거짓 & 참	=> 거짓
		 * 논리값1 && 논리값2	=> 거짓(smart)
		 */
		/*if((charCode >= 97) && (charCode <=122)) {	// 오른쪽 변만 옳은 문장이라서 if문 실행x 다음 함수로 ~ 넘어감
			System.out.println("소문자 이군요.");
		}*/
		
		/*int charCode = 53;
		
		if (!(charCode < 48) && !(charCode > 57)){
			// 코드가 48보다 작지 않다, 그리고 코드가 57보다 크지 않다.
			// 코드가 48 이상이냐, 그리고, 코드가 57 이하냐
			System.out.println("0~9 숫자이군요.");
		}*/
		int value = 4;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수 이군요.");
		}
		/*
		 * 논리값1 | 논리값2	=> 참 | 거짓	=> 참
		 * 논리값1 || 논리값2	=> 참(smart)
		 */
		if((value % 2 == 0) && (value % 3 == 0)) {
			System.out.println("2 와 3의 배수 이군요.");
		}
	}
}
