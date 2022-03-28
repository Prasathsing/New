package org.check;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setting {

	public static void main(String[] args) {
Set s=new TreeSet<>();
s.add(109);
s.add(14);
s.add(13);
s.add(14);
s.add(24);
s.add(33);
s.add(13);
System.out.println(s);
System.out.println(s.size());
System.out.println(s.contains(13));
System.out.println(s.remove(24));
System.out.println(s);
Set<Integer> s1=new HashSet<>();
s1.add(13);
s1.add(23);
s1.add(26);
s1.add(14);
System.out.println(s.addAll(s1));
System.out.println(s);
System.out.println(s.retainAll(s1));
System.out.println(s);
System.out.println(s.removeAll(s1));
System.out.println(s);
for (Integer integer : s1) {
	System.out.println(integer);
}





	}

}
