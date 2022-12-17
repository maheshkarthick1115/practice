package com.ex1;

public class A {
	public A() {
		System.out.println("karthick");
	}

	public A(int id) {
		System.out.println(id);
	}

	public A(long num) {
		System.out.println(num);
	}

	public static void main(String[] args) throws Throwable {
	    A b = new A();
		A c = new A(221);
		A d = new A(87347761634714l);
		b.finalize();
		c.finalize();
		d.finalize();
	}
}
