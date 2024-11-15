package boxing;

import java.util.function.Predicate;

public class Box1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<Integer> isEven = new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i%2==0;
			}
		};
		boolean ans = isEven.test(12);
		System.out.println(ans);
		
		Predicate<Integer> isOdd =(i)->i%2!=0;
		ans = isOdd.test(12);
		System.out.println(ans);
		
	}

}
