package application;

import java.util.List;
import java.util.Date;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.db.Department;
import model.db.Seller;

public class program {

	public static void main(String[] args) {
		// parei na aula 277
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
			
		}
			System.out.println("\n=== TEST 3: seller findall =====");
			list = sellerDao.findAll();
			for (Seller obj : list) {
				System.out.println(obj);
			}
		}
	}


