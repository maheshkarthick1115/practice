package com.ex1;

public class Jumping {
	public static void main(String[] args) {
	//	int i = 0;
		String str = "vijay hello";
		String[] split = str.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			System.err.println(c);
			
		}

		System.out.println(System.identityHashCode(str));
		
		
	}
}
