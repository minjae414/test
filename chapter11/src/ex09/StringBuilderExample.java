/*
 * ���� �ڵ�� 1���� 100������ ���ڸ� �� ���ڿ��� ����� ���ؼ� += �����ڸ� �̿��ؼ� 100��
 * �ݺ��ϰ� �ֽ��ϴ�. �̰��� �� 100�� �̻��� String ��ü�� �����ϴ� ����� ����� ������ ���� ��
 * ���� �� �� �����ϴ�. StringBuilder�� ����ؼ� �� �� ȿ������ �ڵ�� �������Ѻ�����.
 */

package ex09;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str = "";
		for(int i = 1; i <= 100; i++) {
			str += i;
		}
		System.out.println(str);
	
		//���� �ڵ� �ۼ� ��ġ
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			sb.append(i);
		}
		System.out.println(str);
	}
}
