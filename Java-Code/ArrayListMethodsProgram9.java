package module.CollectionPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListMethodsProgram9 {
public static void main(String[] args) {
	ArrayList<Character> a1 = new ArrayList<Character>();
	a1.add('A');
	a1.add('B');
	a1.add('C');
	a1.add('D');
	a1.add('E');
	a1.add('F');
	System.out.println(a1);
	ListIterator <Character> itr = a1.listIterator();
	while (itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("**************************");
	while (itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
}
}