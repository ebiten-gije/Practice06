package com.javaex.ex04;

public class Employee extends User {

	private int salary;
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalry(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("#아이디: %s, #패스워드: %s, #이름: %s, #월급: %d%n", super.getId(), super.getPassword(), super.getName(), salary);
	}
	
	public void showSalary() {
		System.out.println(super.getName() + "의 월급은 " + (salary*10000) + "원입니다.");
		System.out.printf("%s의 월급은 %d0000원입니다.", super.getName(), salary);
	}

	
}
