package com.niit.Backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.ProductDAO;
import com.niit.model.Product;



public class ProductDAOTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static ProductDAO productDAO;
	@Autowired
	static Product product;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		
		productDAO =  (ProductDAO) context.getBean("productDAO");
		
		product = (Product)context.getBean("product");
		
	}
	
	
	/*@Test
	public void createProductTestCase()
	{
		
		product.setId("Moto_001");
		product.setCategory_id("Mobiles");
		product.setDescription("Brand new Moto G4 32gb white");
		product.setName("Moto G4 Plus");
		product.setPrice(14499);
		product.setQuantity(1);
		product.setSupplier_id("S0001");
		
		boolean flag =  productDAO.saveOrUpdate(product);

		assertEquals("createProductTestCase",true,flag);
		
	}
	/*@Test
	public void updateCategoryTestCase()
	{
		product.setId("Moto");
		product.setName("Moto G4 Plus");
		product.setDescription("Brand new Moto G4 32gb black");
		product.setCategory_id("Mobiles");
		product.setPrice(14999);
		product.setSupplier_id("S0002");
		product.setQuantity(4);
		boolean flag = productDAO.saveOrUpdate(product);
		assertEquals("update Product TestCase",true,flag);
	}
	@Test
	public void listAllProductTestCase()
	{
		int actualSize = productDAO.list().size();
		assertEquals(2, actualSize);
	} */
}
