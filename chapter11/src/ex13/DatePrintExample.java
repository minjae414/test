/*
 * SimpleDateFormat Ŭ������ �̿��ؼ� ������ ��¥�� ������ ���� ����ϴ� �ڵ带 �ۼ���
 * ������.
 * 2024�� 05�� 08�� ȭ���� 10�� 30��
 */

package ex13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		//���⼭ �ڵ带 �ۼ��ϼ���.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		System.out.println(sdf.format(now));
	}
}
