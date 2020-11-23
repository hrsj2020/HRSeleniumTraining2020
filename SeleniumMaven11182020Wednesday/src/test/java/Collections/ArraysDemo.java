package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ArraysDemo {
public static void main (String[]args) {
	int[]studentID = new int[5];
	studentID[0] = 11;
	studentID[1] = 12;
	studentID[2] = 13;
	studentID[3] = 14;
	studentID[4] = 15;
	System.out.println(studentID[4]);
	System.out.println(studentID.length);
	for (int i = 0; i <studentID.length; i++) {
		System.out.println(studentID[i]);
		
		String[] fruits = {"Apple", "Banana","Guava"};
		int[][]ids = new int[2][3];
		ArrayList<Integer> List = new ArrayList<Integer>();
		List.add(10);
		List.add(20);
		List.add(30);
		List.add(40);
		System.out.println(List);
		
		ArrayList<String> fruitsnew = new ArrayList<String>();
		fruitsnew.add("Apple");
		fruitsnew.add("Banana");
		System.out.println(fruitsnew);
		
		System.out.println(List.get(2));
		//List.remove(2);
		System.out.println(List);
		Collections.sort(List);
		System.out.println(List);
		
		HashSet<Integer> set = new HashSet<Integer>();
		//set.add(arg0)
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		System.out.println(set);
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		System.out.println(set1);
		
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		map.put(1, "Apple");
		map.put(1, "Banana");
		System.out.println("Map");
	}
	
}
}
