
public class SingletonExample {

	public static void main(String[] args) {
		
		//244p
		/*
		 * Singleton obj1 = new Singleton();	//������ ����
		 * Singleton obj2 = new Singleton();	//������ ����
		 */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
	}
}
