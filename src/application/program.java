package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.db.Seller;

public class program {

	public static void main(String[] args) {
		// parei na aula 277
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		

	}

}
