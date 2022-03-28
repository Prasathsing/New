package org.check;

import java.util.Scanner;

public class Two extends one  {
private void name(String name) {
System.out.println("Prasathsing"+name);
}
private void name(short nam) {
System.out.println("261"+nam);
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Two t=new Two();

	t.name(s.nextLine());
	t.name(s.nextShort());
	t.name(s.nextInt());
	
}
}
