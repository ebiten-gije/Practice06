package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] user = new User[3];
		//	 User 클래스와 하위 클래스를 모두 담을 수 있는 배열;;
		user[0] = new Customer("jws", "j1234", "정우성", 1000);
		
		user[1] = new Customer("yjs", "y2345", "이효리", 2000);
		
		user[2] = new Employee("maste r", "m7788", "운영자", 500);
		
		for(int i = 0; i < user.length; i++) {
			user[i].showInfo();
		}
		
		int salary = ((Employee)user[2]).getSalary();
		System.out.println("운영자의 월급은 " + (salary*10000) + "원입니다.");
		
		if (user[2] instanceof Employee) {
			((Employee)user[2]).showSalary();
		}

	}

}
