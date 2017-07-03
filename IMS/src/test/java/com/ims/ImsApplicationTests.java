package com.ims;

import com.ims.domain.*;
import com.sun.jmx.snmp.Timestamp;
import oracle.sql.TIMESTAMP;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.ims.dao.*;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.sql.Time;
import java.util.List;

import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ImsApplicationTests
{
	@Mock
	static AddressDao adao;
	static CategoryDao cdao;
	static ProductDao pdao;
	static ProductCategoryDao pcdao;
	static PurchaseOrderLineDao poldao;
	static PurchaseOrderDao podao;
	static RetailerDao rdao;
	static RetailerInventoryDao ridao;
	static RetailerSaleDao rsdao;
	static SupplierDao sdao;

	@BeforeClass
	public static void initTest()
	{
		adao = mock(AddressDao.class);
		cdao = mock(CategoryDao.class);
		pdao = mock(ProductDao.class);
		pcdao = mock(ProductCategoryDao.class);
		poldao = mock(PurchaseOrderLineDao.class);
		podao = mock(PurchaseOrderDao.class);
		rdao = mock(RetailerDao.class);
		ridao = mock(RetailerInventoryDao.class);
		rsdao = mock(RetailerSaleDao.class);
		sdao = mock(SupplierDao.class);


		//Mockito.when(adao.findAll()).thenReturn((Iterable<Address>) new Address());
		Mockito.when(adao.findOne(1)).thenReturn(new Address(1, "Street", "City", "State", "zippy"));
		Mockito.when(adao.findOne(30)).thenReturn(null);

		//Mockito.when(cdao.findAll()).thenReturn((List<Category>) new Category());
		Mockito.when(cdao.findOne(1)).thenReturn(new Category(1, "Toys"));
		//Mockito.when(cdao.findOne(30)).thenReturn(null);


		//Mockito.when(pdao.findAll()).thenReturn((List<Product>) new Product());
		Mockito.when(pdao.findOne(1)).thenReturn(new Product(1, "Phone", 300.00F, 400.00F, (new ProductCategory(1, new Category(1, "Cell Phones")))));
		Mockito.when(pdao.findOne(30)).thenReturn(null);

		//Mockito.when(pcdao.findAll()).thenReturn((List<ProductCategory>) new ProductCategory());
		Mockito.when(pcdao.findOne(1)).thenReturn(new ProductCategory(1, new Category(1, "Toys")));
		Mockito.when(pcdao.findOne(30)).thenReturn(null);

		//Mockito.when(poldao.findAll()).thenReturn((List<PurchaseOrderLine>) new PurchaseOrderLine());
		Mockito.when(poldao.findOne(1)).thenReturn(new PurchaseOrderLine(1, 2, new Product(1, "Phone", 300.00F, 400.00F, (new ProductCategory(1, new Category(1, "Cell Phones")))), 40, 500.00F));
		Mockito.when(poldao.findOne(30)).thenReturn(null);

		//Mockito.when(podao.findAll()).thenReturn((List<PurchaseOrder>) new PurchaseOrder());
		Mockito.when(podao.findOne(1)).thenReturn(new PurchaseOrder(1, new TIMESTAMP(), new Supplier(1, "Supplier", new Address(2, "Street", "City", "State", "zippy")), new Retailer(1, "Retailer", new Address(2, "RStreet", "RCity", "RState", "Rzippy")), 500.00F));
		Mockito.when(podao.findOne(30)).thenReturn(null);

		//Mockito.when(rdao.findAll()).thenReturn((List<Retailer>) new Retailer());
		Mockito.when(rdao.findOne(1)).thenReturn(new Retailer(1, "Retailer", new Address(1, "Street", "City", "State", "zippy")));
		Mockito.when(rdao.findOne(30)).thenReturn(null);

		//Mockito.when(ridao.findAll()).thenReturn((List<RetailerInventory>) new RetailerInventory());
		Mockito.when(ridao.findOne(1)).thenReturn(new RetailerInventory(1, 3, 7, 50, 20));
		Mockito.when(ridao.findOne(30)).thenReturn(null);

		//Mockito.when(rsdao.findAll()).thenReturn((List<RetailerSale>) new RetailerSale());
		Mockito.when(rsdao.findOne(1)).thenReturn(new RetailerSale(1, 6, 19, 50, 600.00F, new TIMESTAMP()));
		Mockito.when(rsdao.findOne(30)).thenReturn(null);

		//Mockito.when(sdao.findAll()).thenReturn((List<Supplier>) new Supplier());
		Mockito.when(sdao.findOne(1)).thenReturn(new Supplier(1, "Supplier", new Address(1, "Street", "City", "State", "zippy")));
		Mockito.when(sdao.findOne(30)).thenReturn(null);

	}

	@Test
	public void contextLoads()
	{
		System.out.println();
		System.out.println("Beginning FindOne Function Testing......\n");
		Address addy = adao.findOne(1);
		System.out.println("Address mocked: " + addy);


		Category cat = cdao.findOne(1);
		System.out.println("Category mocked: " + cat);

		Product prod = pdao.findOne(1);
		System.out.println("Product mocked: " + prod);

		ProductCategory pc = pcdao.findOne(1);
		System.out.println("Product Category mocked: " + pc);

		PurchaseOrder po = podao.findOne(1);
		System.out.println("Purchase Order mocked: " + po);

		PurchaseOrderLine pol = poldao.findOne(1);
		System.out.println("Purchase Order Line mocked: " + pol);

		Retailer ret = rdao.findOne(1);
		System.out.println("Retailer mocked: " + ret);

		RetailerInventory ri = ridao.findOne(1);
		System.out.println("Retailer Inventory mocked: " + ri);

		RetailerSale rs = rsdao.findOne(1);
		System.out.println("Retailer Sale mocked: " + rs);

		Supplier supp = sdao.findOne(1);
		System.out.println("Supplier mocked: " + supp);

		System.out.println("....FindOne Function Testing Ended\n");


	}

}
