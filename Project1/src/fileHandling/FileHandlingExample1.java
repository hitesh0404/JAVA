package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import collactions_package.Product;

public class FileHandlingExample1 {

	public FileHandlingExample1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\admin\\javafiletest.txt");
			Product p1 = new Product(100, "Samsung", 120000);
			
			try {
				ObjectOutputStream oos = new ObjectOutputStream(fout);
				oos.writeObject(p1);
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fout.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\admin\\javafiletest.txt");
			ObjectInputStream oin = new ObjectInputStream(fin);
			Product p2 = (Product)oin.readObject();
			System.out.println(p2);
			oin.close();
			fin.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
