package g.a.How_HashSet_works_in_java_one;

import java.util.HashSet;

public class HashSetMain {

	 public static void main(String[] args) {
	  HashSet nameSet=new HashSet();
	  nameSet.add("Arpit");
	  nameSet.add("Arpit");
	  nameSet.add("john");
	  System.out.println("size of nameSet="+nameSet.size());
	  System.out.println(nameSet);
	 }
}
