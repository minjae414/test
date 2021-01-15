/*
 * 다음 문자열에서 쉼표(,)로 구분되어 있는 문자열을 String의 split() 메소드 또는 StringTokenizer
 * 를 이용해서 분리해보세요.
 * 아이디, 이름, 패스워드
 */

package ex08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "아이디, 이름, 패스워드";
		
		//방법1 (split() 메소드 이용)
		String[] split = str.split(", ");
		for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println();
		
		//방법2 (StringTokenizer 이용)
		StringTokenizer st = new StringTokenizer(str, ", ");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			System.out.println(st.nextToken());
		}
	}
}
