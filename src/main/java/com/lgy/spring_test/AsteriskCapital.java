package com.lgy.spring_test;

public class AsteriskCapital {
	public static void main(String[] args) {
		Asterisk ast=new Asterisk();
		Capital cap=new Capital();
		
		ast.setX(5);
		cap.setStr("F");
		
		ast.process();
		cap.process();
	}
}
