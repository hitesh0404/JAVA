package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import collactions_package.Product;

public class StreamAPIExample {

	public StreamAPIExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =    Arrays.asList(1,2,3,4,54,32,12,22,67);
	    Stream<Integer> stream = list.stream();
	    stream.forEach((n)->System.out.print(n%2==0?n+" ":""));
//	    System.out.println(stream);
//	    stream.forEach((n)->System.out.print(n*n+" "));
	    System.out.println(list.stream().map(n->n*n).collect(Collectors.toList()));
	
	
	
	    
	    
	    List<String> names = Arrays.asList("Manish","Rakesh","Sonu");
	    List<Integer> result =names.stream().map(s->s.length()).collect(Collectors.toList());
	    System.out.println(result);
	    
	    
	    List<Product> products = Arrays.asList(
	    		(new Product(101,"Samsung", 1234)),
	    		(new Product(101,"Oppo", 1124)),
	    		(new Product(102,"Vivo", 1412))
	    		);
	    
	    List<String> namesOfProducts = products.stream().map(p->p.getProductName()).collect(Collectors.toList());
	    System.out.println(namesOfProducts);
	    
	    List<Integer> prices = products.stream().map(p->p.getPrice()).collect(Collectors.toList());
	    System.out.println(prices);
	    
	    Optional<Integer> total = prices.stream().reduce((a,b)->a+b);
	    System.out.println(total.get());
	    
	    
	}

}
