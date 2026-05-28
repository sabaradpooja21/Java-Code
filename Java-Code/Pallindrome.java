package PracticePrograms;

public class Pallindrome {
public static void main(String[] args) {
	String s = "121";
	String rev = "";
	int length = s.length();
	for(int i=length-1; i>=0; i--)
	{
		rev = rev+s.charAt(i);
	}
	System.out.println("Reverse of given String is-> "+ rev);
	if(s.equals(rev))
	{
		System.out.println("Given string is Pallindrome");
	}
	else
	{
		System.out.println("Given string is not a  Pallindrome");
	}
}
}
