package lesson10binarysearchtree;

import java.util.HashSet;
import java.util.TreeSet;

// Pre defined Tree set methods

public class TreeSetDemo {

	public static void main(String[] args) {
		 TreeSet<String> ts = new TreeSet<String>();
		 TreeSet<Integer> set = new TreeSet<Integer>();
		 
		 set.add(20);
		 set.add(10);
		 set.add(30);
		 set.add(25);
		 set.add(20);
		 
		 System.out.println(set);
	        ts.add("Java");
	        ts.add("Software Engineering");
	        ts.add("Visual Basic");
	        ts.add("Computer Graphics");
	        ts.remove("Java");
	        System.out.println("Elements: "+ts);
	        //check is set empty?
	        System.out.println("Is set empty: "+ts.isEmpty());
	        //delete all elements from set
	        ts.clear();
	        System.out.println("Is set empty: "+ts.isEmpty());
	        ts.add("Multimedia");
	        ts.add("Multimedia");
	        ts.add("Coral Draw");
	        ts.add("Adobe Photoshop");
	        System.out.println("Elements: "+ts);
	        System.out.println("Size of the set: "+ts.size());
	        ts.remove("Multimedia");
	        System.out.println("Elements: "+ts);
	}

}
