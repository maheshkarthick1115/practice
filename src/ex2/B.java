package ex2;

import com.ex1.Code;

public class B extends Code {
	public B() {
		System.out.println("greenstech");
	}

	public B(int i) {
		System.out.println(i);

	}

	public static void main(String[] args) {
		B e = new B();
		B e1 = new B(344);

	}

}
