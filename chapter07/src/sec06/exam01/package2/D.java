package sec06.exam01.package2;	// ��Ű���� �ٸ�

import sec06.exam01.package1.A;

public class D extends A {	//���
	public D() {
		super();	// �ٸ� Ŭ�����̱� ������ new �����ڷδ� ������ ���� ȣ�� �Ұ� > super()�� A ������ ȣ��
		this.field = "value";
		this.method();
	}
}
