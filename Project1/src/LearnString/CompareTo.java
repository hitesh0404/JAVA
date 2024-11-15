package LearnString;

public class CompareTo {

	public CompareTo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((char)66);
		
		System.out.println("A".compareTo("B"));
		String name = "Hello World";
		for(int i =0;i<name.length();i++) {
			System.out.print(name.charAt(i));
		}
		System.out.println("\n"+name.toLowerCase());
		System.out.println(name.toUpperCase());
		name = "April";
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
		int count = 0;
		for(int i =0 ; i<name.length() ; i++) {
			char c=name.toLowerCase().charAt(i);
			if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u') {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("Hello world".indexOf("l"));
		System.out.println("laptop".substring(2,5));
		
	}

}
