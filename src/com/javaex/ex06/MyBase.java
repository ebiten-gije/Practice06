package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
	@Override
    public void service(String state) {
    	if ("오후".equals(state)) {
    		afternoon();
    	} else if  (state.equals("낮")) {
    		day();
    	} else {
    		super.night();
    	}
    		
    }
	
	@Override
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다..^^");
	}
}
