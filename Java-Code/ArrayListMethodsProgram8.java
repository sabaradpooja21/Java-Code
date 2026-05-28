package module.CollectionPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethodsProgram8 {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("Pooja");
	a1.add("Anokhi");
	a1.add("Gadavi");
	a1.add(3, "Avni");
	 
	System.out.println(a1);
	
	for(int i =0; i<a1.size(); i++)
	{
		String s = a1.get(i);
		System.out.println(s);
	}
	
	Iterator <String >itr =a1.iterator();
	boolean b1 = itr.hasNext();
	System.out.println(b1);
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}