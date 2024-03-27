package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] user = new User[3];
		
		user[0] = new Customer("jws", "j1234", "정우성", 1000);
		
		user[1] = new Customer("yjs", "y2345", "이효리", 2000);
		
		user[2] = new Employee("master", "m7788", "운영자", 500);
		
		for(int i = 0; i < user.length; i++) {
			user[i].showInfo();
		}
		
		System.out.println("운영자의 월급은 5_000_000입니다.");

	}

}
