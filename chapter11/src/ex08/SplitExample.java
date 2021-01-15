/*
 * ���� ���ڿ����� ��ǥ(,)�� ���еǾ� �ִ� ���ڿ��� String�� split() �޼ҵ� �Ǵ� StringTokenizer
 * �� �̿��ؼ� �и��غ�����.
 * ���̵�, �̸�, �н�����
 */

package ex08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		String str = "���̵�, �̸�, �н�����";
		
		//���1 (split() �޼ҵ� �̿�)
		String[] split = str.split(", ");
		for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println();
		
		//���2 (StringTokenizer �̿�)
		StringTokenizer st = new StringTokenizer(str, ", ");
		int countTokens = st.countTokens();
		for(int i = 0; i < countTokens; i++) {
			System.out.println(st.nextToken());
		}
	}
}
