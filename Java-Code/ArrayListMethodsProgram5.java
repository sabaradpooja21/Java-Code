package module.CollectionPrograms;

import java.util.ArrayList;

public class ArrayListMethodsProgram5 {
public static void main(String[] args) {
	ArrayList<String> a1 = new ArrayList<String>();
	a1.add("Pooja");
	a1.add("Anokhi");
	a1.add("Gadavi");
	
	ArrayList <Character> a2 = new ArrayList <Character> ();
	a2.add('A');
	a2.add('B');
	a2.add('C');
	a2.add('D');
	
	ArrayList <Character> a3 = new ArrayList <Character> ();
	a3.add('E');
	a3.add('F');
	a3.add('G');
	a3.add('H');
	System.out.println(a3);
	a3.addAll(3, a2);
	System.out.println(a3);
	boolean b1 = a1.equals(a3);
	System.out.println(b1);
	
}
}
