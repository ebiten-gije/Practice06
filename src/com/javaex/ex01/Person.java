package com.javaex.ex01;

public class Person {
	
	protected String name;
	protected String hp;
	
	public Person() {
		
	}
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public void showInfo() {
		System.out.printf("#이름: %s, #핸드폰: %s%n", name, hp);
	}
	
}
