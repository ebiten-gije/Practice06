package com.javaex.ex03;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	//	생성자 선언하지 않으면 기본 생성자 추가
	//	임의로 생성자를 선언하면 기본 생성자 자동 추가 없ㄱ음;;
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void showInfo() {
		System.out.println("====삼각형====");
		System.out.println("#면색:"+fillColor);
		System.out.println("#선색:"+lineColor);
		System.out.println("#가로:"+width);
		System.out.println("#세로:"+height);
	}
}





