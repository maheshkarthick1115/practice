package ex2;

import com.ex1.A1;

public class B1 extends A1{
	public B1() {
		System.out.println("child classs");
	}
	
	public static void main(String[] args) throws Throwable {
		B1 c=new B1();
		A1 c1=new A1(12);
	
		c.finalize();
	}
	
}
