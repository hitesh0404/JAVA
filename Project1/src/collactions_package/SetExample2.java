package collactions_package;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;import LearnString.StringPrograms;

class LastDigitComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return (o1%100)-(o2%100);
	}
}
class PriceComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}


}

public class SetExample2 {

	public SetExample2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>(new LastDigitComparator());
		numbers.add(110);
		numbers.add(210);
		numbers.add(350);
		System.out.println(numbers);
		
		
		
		TreeSet<Product> products = new TreeSet<Product>(new PriceComparator());

		products.add(new Product(101,"Samsung", 1234));
		products.add(new Product(101,"Oppo", 1124));
		products.add(new Product(102,"Vivo", 1412));
		
		System.out.println(products);
		TreeSet<Product> products1 = new TreeSet<Product>((p1,p2)->p1.getProductId()-p2.getProductId());
		System.out.println(products1);
//		for (Iterator iterator = products.iterator(); iterator.hasNext();) {
//			 Iterable<Product> p = (Iterable<Product>) iterator.next();
//			 products1.add((Product) p);
//			 
//			
//		}
//		System.out.println(products1);
		
		TreeSet<Product> products2 = new TreeSet<Product>((p1,p2)->p1.getProductName().compareTo(p2.getProductName()));

		products2.add(new Product(101,"Samsung", 1234));
		products2.add(new Product(101,"Oppo", 1124));
		products2.add(new Product(102,"Vivo", 1412));
		
		for (Product p : products2) {
			System.out.println(p);
		}
		
		
		
		
		
		
	}
}
