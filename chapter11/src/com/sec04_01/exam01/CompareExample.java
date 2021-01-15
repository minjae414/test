package com.sec04_01.exam01;

import java.util.Objects;
import java.util.Comparator;

public class CompareExample {	//���� ���
	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result	= Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result);
		result = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result);
	}
	
	static class Student {
		int sno;
		Student(int sno){
			this.sno = sno;
		}
	}
	
	//StudentComparator
	static class StudentComparator implements Comparator<Student>{	//�л� ��ȣ ����
		@Override
		public int compare(Student o1, Student o2) {
			/*if(o1.sno < o2.sno) return -1;
			else if(o1.sno == o2.sno) return 0;
			else return 1;*/
			return Integer.compare(o1.sno, o2.sno);
		}
	}
}
