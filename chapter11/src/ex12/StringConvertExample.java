/*
 * 문자열 "200"을 정수로 변환하는 코드와 숫자 150을 문자열로 변환하는 코드를 작성해보세요.
 */

package ex12;

public class StringConvertExample {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.valueOf(strData1);
		
		int intData2 = 150;
		String strData2 = Integer.toString(intData2);
	}
}
