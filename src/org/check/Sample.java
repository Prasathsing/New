package org.check;
public class Sample{
	public int a;
	private void add(int b) {
		a=10;
int c=a+b;
System.out.println(c);
	}
public static void main(String[] args) {
	int a=25;
	
	System.out.println(a);
	Sample s=new Sample();
	s.add(20);
	
}
}




