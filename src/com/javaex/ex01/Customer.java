package com.javaex.ex01;

public class Customer extends Person{
	
	private int cNo;
	private int point;

	public Customer() {
		System.out.println("생성자 Customer(0) 호출");
	}
	
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
		System.out.println("생성자 Customer(4) 호출");
	}
	
	public int getCNo() {
		return cNo;
	}
	public int getPoint() {
		return point;
	}
	
	public void setCNo(int cNo) {
		this.cNo = cNo;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("#이름: %s, #핸드폰: %s, #고객번호: %d, #포인트 점수: %d%n", super.getName(), super.getHp(), cNo, point);
	}
	
}
