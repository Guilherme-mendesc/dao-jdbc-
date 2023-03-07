package application;

import java.util.Date;

import model.db.Department;
import model.db.Seller;

public class program {

	public static void main(String[] args) {
		// parei na aula 277
		
		Department obj = new Department(1, "test");
		
		Seller seller = new Seller(21,"Bob", "bob@gmail.com", new Date(), 3000.0 , obj);
		
		System.out.println(seller);
		System.out.println(obj);

	}

}
