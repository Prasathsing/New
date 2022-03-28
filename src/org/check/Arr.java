package org.check;


import java.util.ArrayList;
import java.util.List;

public class Arr {

	public static void main(String[] args) {
     List l=  new ArrayList();
     l.add(10);
     l.add("Ramesh");
     l.add(25842);
     l.add("prakash");
     l.add(24.49);
     l.add("Prasathsing");
     l.add("Prasath");
     System.out.println(l);
     System.out.println(l.size());
     System.out.println(l.get(3));
     for (int i = 0; i < l.size(); i++) {
		
    	 System.out.println(l.get(i));
	}
     for (Object object : l) {
		
	System.out.println(object);
     }
	}
}
