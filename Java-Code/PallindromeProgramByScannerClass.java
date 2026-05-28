package PracticePrograms;

import java.util.Scanner;

public class PallindromeProgramByScannerClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your String Value-->");
	String s = sc.nextLine();
	String rev = "";
    int length = s.length();
	for (int i = length-1; i>=0; i--)
	{
		rev = rev+s.charAt(i);
	}
	System.out.println("Reverse of given String is->"+rev );
	if(s.equals(rev))
	{
		System.out.println("Given string is pallindrome");
	}
	else 
	{
		System.out.println("Given string is not a pallindrome");
	}
	sc.close();
	
}

}
