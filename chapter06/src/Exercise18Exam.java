
public class Exercise18Exam {

	public static void main(String[] args) {
		Exercise18 obj1 = Exercise18.getInstance();
		Exercise18 obj2 = Exercise18.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Exercise18 ��ü �Դϴ�.");
		} else {
			System.out.println("�ٸ� Exercise18 ��ü �Դϴ�.");
		}
	}
}
