/*
 * Student 클래스를 작성하되, Object의 equals()와 hashCode()를 오버라이딩해서
 * Student의 학번(studentNum)이 같으면 동등 객체가 될 수 있도록 해보세요. Student 클래
 * 스의 필드는 다음과 같습니다. hashCode()의 리턴값은 studentNum 필드값의 해시코드를 리
 * 턴하도록 하세요
 */
package ex03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	//여기서 코드를 작성하세요
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
