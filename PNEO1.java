class PNEO1{
	public static void main(String[] args){
		int num = -19 ;
		if ( (num > 0) && (num % 2 == 0) )   //negative or odd
				System.out.println("Positive Even");
		else if(num % 2 == 0)
				System.out.println("Negative Even");
		else if(num < 0 )
				System.out.println("Negative Odd");
		else
				System.out.println("Positive Odd");
	}

}