package model;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {

	int addProduct(Product product) throws SQLException;

	List<Product> getAllProducts() throws SQLException;

	Product findProductById(Integer id) throws SQLException;

	int updateProduct(Product product) throws SQLException;

	int deleteProduct(Product product) throws SQLException;

}