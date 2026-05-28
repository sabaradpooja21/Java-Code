package module.CollectionPrograms;

import java.util.ArrayList;

public class ArrayListMethodsProgram6 {
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
	
	a2.remove(2);
	System.out.println(a2);
	boolean b2 = a2.remove(a3);
	System.out.println(b2);
	boolean b3 = a3.removeAll(a2);
	System.out.println(b3);
	
	int a = a3.size();
	System.out.println(a);
	
    boolean b4 =  a2.contains(a3);
     System.out.println(b4);
     
     boolean b5 = a2.containsAll(a3);
     System.out.println(b5); 
     
    String s1 =  a1.get(2);
     System.out.println(s1);
	
}
}
