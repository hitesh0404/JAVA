package collactions_package;

import java.util.ArrayList;
import java.util.Iterator;

public class ListProduct {

	public ListProduct() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "laptop", 55000));
		products.add(new Product(102, "Mobile", 30000));
		products.add(new Product(103, "HeadPhones", 3400));
		for (Product product : products) {
			if(product.getPrice()<10000){
				System.out.println(product);
			};
		}
		
		
		System.out.println(products.get(2));		
		for (Iterator iterator = products.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			System.out.println(product);
		}

	}

}
