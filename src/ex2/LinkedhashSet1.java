package ex2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashSet1 {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<>();
		s.add(null);
		s.add(1509);
		s.add(1108);
		s.add(1511);
		System.out.println(s);
		
		
		int i = s.size();
		System.out.println(i);
		
		boolean bb = s.contains(1511);
		System.out.println(bb);
		
//		s.clear();
//		System.out.println(s);
	
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(null);
		s1.add(15);
		s1.add(11);
		s1.add(1511);
		System.out.println(s1);
		
//		s1.addAll(s);
//		System.out.println(s1);
		
//		s1.retainAll(s);
//		System.out.println(s1);
		
		s1.removeAll(s);
		System.out.println(s1);
		
		
	}

}
