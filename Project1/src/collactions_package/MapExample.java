package collactions_package;

import java.util.HashMap;

public class MapExample {

	public MapExample() {
		// TODO Auto-generated constructor stub
		
		
	}
	public static void main(String[] args) {
		HashMap<Integer, String>  hashmap= new HashMap<Integer, String>() ;
		hashmap.put(101, "Rakesh");
		hashmap.put(102, "Raju");
		hashmap.put(101, "Ramesh");
		
		hashmap.put(101, "Rohan");
		
		System.out.println(hashmap);
		
		
		
		for (Integer key : products.keySet()) {
			System.out.println(key + ' '+ hashmap.get(key).getProductName());
		}
		
	}


}
