/*
 * Student Ŭ������ �ۼ��ϵ�, Object�� equals()�� hashCode()�� �������̵��ؼ�
 * Student�� �й�(studentNum)�� ������ ���� ��ü�� �� �� �ֵ��� �غ�����. Student Ŭ��
 * ���� �ʵ�� ������ �����ϴ�. hashCode()�� ���ϰ��� studentNum �ʵ尪�� �ؽ��ڵ带 ��
 * ���ϵ��� �ϼ���
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
	
	//���⼭ �ڵ带 �ۼ��ϼ���
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
