package ex2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
		s.add("kaaaa");
		s.add("chennai");
		s.add("rajapalayam");
		s.add("karthick");
		System.out.println(s);
		
		int si = s.size();
		System.out.println(si);
		
		boolean k = s.contains("kaaaa");
		System.out.println(k);
		System.out.println(System.identityHashCode(k));
		
//		s.clear();
//		System.out.println(s);
		Set<String> ss=new TreeSet<>();
		ss.add("ka");
		ss.add("srivi");
		ss.add("ooty");
		ss.add("karthick");
		System.out.println(ss);
		
//		ss.addAll(s);
//		System.out.println(ss);
		
//		ss.retainAll(s);
//		System.out.println(ss);
		 
		ss.removeAll(s);
		System.out.println(ss);
		
	}

}
