package org.check;

import java.util.*;
import java.util.Map.Entry;

public class Mapping {

	public static void main(String[] args) {
Map<String, Integer> m=new Hashtable<>();
m.put("Ramesh", 73);
m.put("Prakash", 36);
m.put("Rajesh", 56);
m.put("Udhaya", 36);
System.out.println(m);
System.out.println(m.size());
System.out.println(m.containsValue(56));
System.out.println(m.containsKey("Ravi"));
System.out.println(m.get("Ramesh"));
System.out.println(m.values());
Set<Entry<String, Integer>> entrySet = m.entrySet();
for (Entry<String, Integer> entry : entrySet) {
	System.out.println(entry);
	System.out.println(entry.getKey());
	System.out.println(entry.getValue());
}

	}

}
