
public class LogicalOperatorExample2 {

	public static void main(String[] args) {
		
		/*int charCode = 'A';
		System.out.println("charCode: " + charCode);	// �����ڵ� Ȯ���ϴ� ��
		
		if((charCode >= 65) & (charCode <=90)) {	// �� ���� ���̶� true > if�� ����
			System.out.println("�빮�� �̱���.");	// �����ڵ�� ���� �빮�ڵ��� A~Z 65~90�� ���� ����
												// ���� �ҹ��� a~z 97~122�� ���� ����
		}*/
		/*
		 * ����1 & ����2	=> ���� & ��	=> ����
		 * ����1 && ����2	=> ����(smart)
		 */
		/*if((charCode >= 97) && (charCode <=122)) {	// ������ ���� ���� �����̶� if�� ����x ���� �Լ��� ~ �Ѿ
			System.out.println("�ҹ��� �̱���.");
		}*/
		
		/*int charCode = 53;
		
		if (!(charCode < 48) && !(charCode > 57)){
			// �ڵ尡 48���� ���� �ʴ�, �׸��� �ڵ尡 57���� ũ�� �ʴ�.
			// �ڵ尡 48 �̻��̳�, �׸���, �ڵ尡 57 ���ϳ�
			System.out.println("0~9 �����̱���.");
		}*/
		int value = 4;
		
		if((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 �Ǵ� 3�� ��� �̱���.");
		}
		/*
		 * ����1 | ����2	=> �� | ����	=> ��
		 * ����1 || ����2	=> ��(smart)
		 */
		if((value % 2 == 0) && (value % 3 == 0)) {
			System.out.println("2 �� 3�� ��� �̱���.");
		}
	}
}
