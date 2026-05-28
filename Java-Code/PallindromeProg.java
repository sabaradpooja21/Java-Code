package PracticePrograms;

public class PallindromeProg {
public static void main(String[] args) {
	String s = "madam";
	String rev = "";
	int len = s.length();
	for(int i =len-1; i>=0; i --)
	{
		rev = rev+s.charAt(i);
	}
	System.out.println("Reverse of string is ->"+rev );
	if(s.equals(rev))
	{
		System.out.println("Given string is a pallindrome ");
	}
	else
	{
		System.out.println("Given string is not a pallindrome ");
	}
}
}
