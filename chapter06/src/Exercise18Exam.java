
public class Exercise18Exam {

	public static void main(String[] args) {
		Exercise18 obj1 = Exercise18.getInstance();
		Exercise18 obj2 = Exercise18.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Exercise18 객체 입니다.");
		} else {
			System.out.println("다른 Exercise18 객체 입니다.");
		}
	}
}
