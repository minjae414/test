/*18. Exercise18 ��ü�� �̱������� ����� �ͽ��ϴ�. 
 * Exercise18 Ŭ�������� Exercise18Exam�� getInstance() �޼ҵ�� �̱����� ���� �� �ֵ��� Exercise18 Ŭ������ �ۼ��غ�����.*/

public class Exercise18{
	private static Exercise18 singleton = new Exercise18();
	
	private Exercise18() {}
	
	static Exercise18 getInstance() {
		return singleton; 
	}
}