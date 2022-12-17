package ex2;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		Map<String, Integer> t = new TreeMap<>();
		t.put("karthick", null);
		t.put("hjd", 44);
		t.put("indra", null);
		t.put("aa", null);
		t.put("zz", 26);
		System.out.println(t);
		
//		int s = t.size();
//		System.out.println(s);
//		
//		Integer i = t.get("aa");
//		System.out.println(i);
//		
//		Set<String> k = t.keySet();
//		System.out.println(k);
//		
//		Collection<Integer> v = t.values();
//		System.out.println(v);
//		
//		boolean f = t.containsKey("zz");
//		System.out.println(f);
//		
//		boolean r = t.containsValue(26);
//		System.out.println(r);
//		
//		Set<Entry<String, Integer>> ee = t.entrySet();
//		System.out.println(ee);
	}

}
