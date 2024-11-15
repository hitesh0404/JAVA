package StreamAPI;

import java.util.ArrayList;
import java.util.Optional;

public class streamAPIExample3 {

	public streamAPIExample3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list =new  ArrayList<Integer>();
		for (int i = 1; i <= 20; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		Optional<Integer> i =list.stream().findFirst();
		
		Integer j = i.orElseThrow(()->new RuntimeException("Empty"));
		
		System.out.println(j);

		Integer k = i.orElseGet(()->100);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		

		
	}

}
