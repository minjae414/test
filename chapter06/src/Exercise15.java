/*15. Ŭ������ login() �޼ҵ�� logout() �޼ҵ带 �����Ϸ��� �մϴ�. login() �޼ҵ带 ȣ���� ������ �Ű������� id�� password�� �����ϰ�,
logout() �޼ҵ�� id�� �Ű������� �����մϴ�. Ŭ������ login(), logout() �޼ҵ带 �����غ�����.
1. login() �޼ҵ�� �Ű��� id�� "hong", �Ű��� password�� "12345"�� ��쿡�� true�� �����ϰ� �� �̿��� ���� ��쿡�� flase�� �����ϵ��� �ϼ���.
2. longout() �޼ҵ��� ������ "�α׾ƿ� �Ǿ����ϴ�."�� ��µǵ��� �ϼ���.
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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
