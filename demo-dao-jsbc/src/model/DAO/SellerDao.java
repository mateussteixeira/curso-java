package model.DAO;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	void insert(Seller dep);
	void update(Seller dep);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	
}
