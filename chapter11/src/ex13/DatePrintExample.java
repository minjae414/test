/*
 * SimpleDateFormat 클래스를 이용해서 오늘의 날짜를 다음과 같이 출력하는 코드를 작성해
 * 보세요.
 * 2024년 05월 08일 화요일 10시 30분
 */

package ex13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		//여기서 코드를 작성하세요.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		System.out.println(sdf.format(now));
	}
}
