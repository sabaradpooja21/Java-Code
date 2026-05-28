package PracticePrograms;

import java.util.Arrays;

public class AnagramProgram {
public static void main(String[] args) {
	String a= "pooja";
	String b ="japu";
	char[] a1= a.toCharArray();
	char[]b1=b.toCharArray();
	System.out.println("String after converting into array->");
	System.out.println(a1);
	System.out.println(b1);
	
	Arrays.sort(a1);
	Arrays.sort(b1);
	System.out.println("String after sorting->");
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(b1));
	
	if(Arrays.equals(a1, b1))
	{
		System.out.println("Given String is Anagram");	
	}
	else
	{
		System.out.println("Given String is not an Anagram");	
	}
}
}
