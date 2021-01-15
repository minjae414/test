/*15. 클래스에 login() 메소드와 logout() 메소드를 선언하려고 합니다. login() 메소드를 호출할 때에는 매개값으로 id와 password를 제공하고,
logout() 메소드는 id만 매개값으로 제공합니다. 클래스와 login(), logout() 메소드를 선언해보세요.
1. login() 메소드는 매개값 id와 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴하고 그 이외의 값일 경우에는 flase를 리턴하도록 하세요.
2. longout() 메소드의 내용은 "로그아웃 되었습니다."가 출력되도록 하세요.
*/

public class Exercise15 {
	String id;
	String password;
	
	public boolean login(String id, String password) {
		this.id = id;
		this.password = password;
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void logout(String id) {
		this.id = id;
		System.out.println("로그아웃 되었습니다.");
	}
}
