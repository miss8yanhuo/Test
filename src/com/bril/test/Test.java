package com.bril.test;

public class Test {
	
	public static void main(String[] args) {
		String str = "File:///aaaaa";
		String[] strs = str.split("///");
		System.out.println(strs[1]);
		
		String strs1 = str.substring(str.lastIndexOf("/")+1);
		System.out.println(strs1);
		System.out.println(2333);
		
	}

}
