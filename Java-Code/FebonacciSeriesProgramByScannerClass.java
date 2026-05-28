package PracticePrograms;

import java.util.Scanner;

public class FebonacciSeriesProgramByScannerClass {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter length");
int n = sc.nextInt();
int a= 2;
int b = 3;
for (int i =0; i<=n; i++)
{
	System.out.println(a+" ");
	int next = a+b;
	 a=b;
	b = next;
	
}
	sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
