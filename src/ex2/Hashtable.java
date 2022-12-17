package ex2;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashtable {
	public static void main(String[] args) {
		Map<Integer,String> s= new java.util.Hashtable<>();
		s.put(15,"karthick");
		s.put(11,"mahesh");
		System.out.println(s);
		
		int i = s.size();
		System.out.println(i);
		
		String ss = s.get(15);
		System.out.println(ss);
		
	    Set<Integer> kk = s.keySet();
		System.out.println(kk);
		
		Collection<String> v = s.values();
		System.out.println(v);
		
		boolean vv = s.containsKey(15);
		System.out.println(vv);
		
		boolean vvv = s.containsValue("hdkhfg");
		System.out.println(vvv);
		
		Set<Entry<Integer, String>> ee = s.entrySet();
	    System.out.println(ee);
	}

}
