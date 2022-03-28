package org.check;

public class Ramesh {

	public static void main(String[] args) {

		String s=new String("welcome");
		System.out.println(System.identityHashCode(s));
		String s1=new String("welcome");
		System.out.println(System.identityHashCode(s1));
		s=s.concat(s1);
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		
		
		
		
		
		
		
		
		
		
		
	}

}
