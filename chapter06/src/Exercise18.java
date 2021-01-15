/*18. Exercise18 객체를 싱글톤으로 만들고 싶습니다. 
 * Exercise18 클래스에서 Exercise18Exam의 getInstance() 메소드로 싱글톤을 얻을 수 있도록 Exercise18 클래스를 작성해보세요.*/

public class Exercise18{
	private static Exercise18 singleton = new Exercise18();
	
	private Exercise18() {}
	
	static Exercise18 getInstance() {
		return singleton; 
	}
}