package com.niit.Backend;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.SupplierDAO;
import com.niit.model.Supplier;



public class SupplierDAOTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static SupplierDAO supplierDAO;
	@Autowired
	static Supplier supplier;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");

		supplier = (Supplier) context.getBean("supplier");

	}

	/*@Test
	public void createSupplierTestCase() {
		supplier.setId("S0001");
		supplier.setName("Big C");
		supplier.setAddress("Ameerpet");

		boolean flag = supplierDAO.save(supplier);

		assertEquals("createSupplierTestCase", true, flag);

	}

	/*@Test
	public void updateSupplierTestCase() {
		supplier.setId("S0002");
		supplier.setName("Reliance Mobiles");
		supplier.setAddress("Beeramguda");

		boolean flag = supplierDAO.update(supplier);

		assertEquals("updateSupplierTestCase", true, flag);

	}

	@Test
	public void listAllSupplierTestCase() {
		int actualSize = supplierDAO.list().size();
		assertEquals(6, actualSize);
	}*/

}
