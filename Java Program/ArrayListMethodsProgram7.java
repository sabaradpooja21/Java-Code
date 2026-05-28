package module.CollectionPrograms;

import java.util.ArrayList;

public class ArrayListMethodsProgram7 {
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
}
}