package Package_2;

import java.util.ArrayList;
import java.util.TreeSet;

public class FruitArray {

	public static void main(String[] args) {
		ArrayList<String> fruitlist = new ArrayList<String>();
		fruitlist.add("Mango");
		fruitlist.add("Apple");
		fruitlist.add("Papaya");
		fruitlist.add("Grape");
		System.out.println("Fruit List : " + fruitlist);
		TreeSet<String> ts = new TreeSet<String>(fruitlist);
		System.out.println("TreeSet from List : " + ts);
	}

}
