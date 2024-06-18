package com.lgy.spring_test;

public class Asterisk {
	int x;
	
	public void process() {
		for (int i = x; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
}
