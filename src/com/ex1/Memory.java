package com.ex1;

public class Memory {
	public static void main(String[] args) throws InterruptedException {
		StringBuilder k = new StringBuilder("karthick");
		System.out.println(System.identityHashCode(k));
		Thread.sleep(5000); 
		
		StringBuilder s = new StringBuilder ("bhdgafffw");
		System.out.println(System.identityHashCode(s));
		Thread.sleep(5000);
		
		System.out.println(System.identityHashCode(k.append(s)));
		Thread.sleep(3000);
	}

}
