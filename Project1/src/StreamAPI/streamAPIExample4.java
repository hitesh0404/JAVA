package StreamAPI;

import java.util.ArrayList;
import java.util.Optional;

public class streamAPIExample4 {

	public streamAPIExample4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new  ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		Optional<Integer> i =list.parallelStream().findAny();
		System.out.println(i);
	}

}
