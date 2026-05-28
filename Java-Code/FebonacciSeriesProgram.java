package PracticePrograms;

public class FebonacciSeriesProgram {
public static void main(String[] args) {
	int a = 1;
	int b = 4;
	int c = a+b;
	for (int i=0; i<=c; i++)
	{
		System.out.println(a+"");
		int c1 = a+b;
		a=b;
		b= c1;
	}
	
}
}
