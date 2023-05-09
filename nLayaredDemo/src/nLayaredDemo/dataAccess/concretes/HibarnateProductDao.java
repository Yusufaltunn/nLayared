package nLayaredDemo.dataAccess.concretes;

import java.util.List;

import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;



public class HibarnateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
				System.out.println("hibarnate ile eklendi " + product.getName());
	}

	@Override
	public void update(Product product) {
				
	}

	@Override
	public void delete(Product product) {
		
	}

	@Override
	public Product get(int id) {
		return null;
	}

	@Override
	public List<Product> getAll() {
		return null;
	}
	
}
