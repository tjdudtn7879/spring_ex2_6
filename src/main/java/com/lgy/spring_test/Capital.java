package com.lgy.spring_test;

public class Capital {
	String str;
	
	public void process() {
		StringBuffer strBuf=new StringBuffer();
		char c2=str.charAt(0);
		
		for (char i = c2; i >= 'A'; i--) {
			for (char j = 'A'; j <= i; j++) {
				strBuf.append(j);
			}
			strBuf.append("\n");
		}
		System.out.println(strBuf);
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
}
