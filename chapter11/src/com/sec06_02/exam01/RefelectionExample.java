package com.sec06_02.exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefelectionExample {	//�������� Ŭ���� ��� ���� ���
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.sec06_02.exam01.Car");
		
		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("[������ ����]");
		//������ �̸��� �Ű� ���� ������ ���
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[�ʵ� ����]");
		//�ʵ� Ÿ�԰� �ʵ� �̸��� ���
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("[�޼ҵ� ����]");
		//�޼ҵ� �̸��� �Ű� ������ ���
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if(i < parameters.length - 1) {
				System.out.print(",");
			}
		}
	}

}
