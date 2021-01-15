/*
 * Member 클래스를 작성하되, Object의 toString() 메소드를 오버라이딩해서 MemberExample
 * 클래스의 실행 결과처럼 나오도록 작성해보세요.
 */

package ex04;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//여기서 코드를 작성하세요.
	@Override
	public String toString() {
		return id.toString() + ": " + name.toString();
	}
}
