/*
 * ù ��°�� ���ĺ����� �����ϰ� �� ������� ���ڿ� ���ĺ����� ������ 8��~12�� ������ ID
 * ������ �˻��ϰ� �ͽ��ϴ�. ���ĺ��� ��ҹ��ڸ� ��� ����� ��쿡 ���� ǥ������ �̿��ؼ� ����
 * �ϴ� �ڵ带 �ۼ��غ�����.
 */

package ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = /**/"\\w+{8,12}";
		boolean isMatch = Pattern.matches(regExp, id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		} else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
	}
}
