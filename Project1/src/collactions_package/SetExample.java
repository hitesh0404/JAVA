package collactions_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class SetExample {

	public SetExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numbers = new HashSet<Integer>();

		numbers.add(1);
		numbers.add(2);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		
		
		HashSet<String> color = new HashSet<String>();
		color.add("green");
		color.add("Red");
		color.add("Blue");
		
		System.out.println(color);
		List<Integer> asList = Arrays.asList(12,13,14,15,16,17);
		HashSet<Integer> hashSet = new HashSet<Integer>(asList
				);
		System.out.println(hashSet);
		
		LinkedHashSet<String> days = new LinkedHashSet<String>();
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 7; i++) {
			days.add(scanner.next());
			
		}
		System.out.println(days);
		System.out.println(days.contains("mon"));
	}

}
