class PNEO{
	public static void main(String[] args){
		int num = -17;
		if (num > 0){    //positive
			if (num % 2 == 0)      //even
				System.out.println("Positive Even");
			else
				System.out.println("Positive Odd");
		}
		else{   //negative
			if (num % 2 == 0)  //even
				System.out.println("Negative Even");
			else
				System.out.println("Negative Odd");
		}
	}

}