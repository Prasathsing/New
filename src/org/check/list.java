package org.check;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class list{
	public static void main(String[] args) {
		List i=new ArrayList();
		Scanner s=new Scanner(System.in);
		System.err.println("enter the id");
		i.add(s.nextInt());
		System.err.println("enter the name");
		i.add(s.next());
System.err.println("enter  the gmail");
s.nextLine();		
i.add(s.nextLine());
		System.out.println("enter the mobile no");
		i.add(s.nextLong());
		System.out.println(i);
		System.out.println(i.size());
for (int j = 0; j < i.size(); j++) {
	System.out.println(i.get(j));
}	
		
		for (Object object : i) {
			System.out.println(object);
		}	
		
	}
	

}
