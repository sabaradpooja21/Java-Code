package PracticePrograms;

import java.util.Arrays;

public class CheckHowManyNumbersarePresentinGivenString {
	static int countOfNumeric;
public static void main(String[] args) {
	
	String s = "spsabarad21@hmail.com";
	char [] a = s.toCharArray();
	System.out.println(a);
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	for(int i=0; i<s.length(); i++)
	{
		if(Character.isDigit(a[i]))
		{

			countOfNumeric++;
		}
	}
	
	System.out.println("Count of numeric"+countOfNumeric);
}
}
