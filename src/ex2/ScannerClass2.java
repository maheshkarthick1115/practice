package ex2;

import java.util.Scanner;

public class ScannerClass2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  
		System.out.println("studentId");
		int i = s.nextInt();
		System.out.println(i);
		
		System.out.println("student name");
		String s1 = s.next().toString();
		System.out.println(s1);
		 
		System.out.println("tamil");
		int i1 = s.nextInt();
		System.out.println(i1);
		 
		System.out.println("english");
		int i2 = s.nextInt();
		System.out.println(i2);
		 
		System.out.println("maths");
		int i3 = s.nextInt();
		System.out.println(i3);
		 
		System.out.println("science");
		int i4 = s.nextInt();
		System.out.println(i4);
		 
		System.out.println("social science");
		int i5 = s.nextInt();
		System.out.println(i5);
		
		System.out.println("total mark");
		System.out.println(i1+i2+i3+i4+i5);
		
		 System.out.println("average mark");
		 System.out.println(408 /5);
		
	}

}
