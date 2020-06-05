package com.ups.retailstore;

import com.ups.retailstore.model.Bill;
import com.ups.retailstore.service.RetailStoreService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RetailstoreApplicationTests {

	@Autowired
	RetailStoreService retailStoreService;

	Double billAmount=1000.0;
	Double groceriesCost=100.0;
	@Test
	void contextLoads() {
	}

	@Test
	// 30 % Discount
	public void testEmployeeDiscount() {
		Bill employeeBill=retailStoreService.getBillDiscount(billAmount,groceriesCost,1);
		Assert.assertEquals((Object)585.0, employeeBill.getBillAmount());
	}

	@Test
	// 5 % Discount
	public void testAffiliateDiscount() {
		Bill affiliateBill=retailStoreService.getBillDiscount(billAmount,groceriesCost,3);
		Assert.assertEquals((Object) 810.0, affiliateBill.getBillAmount());
	}

	@Test
	// 10% Discount
	public void testOldCustomerDiscount() {
		Bill oldCustomerBill=retailStoreService.getBillDiscount(billAmount,groceriesCost,2);
		Assert.assertEquals((Object)765.0, oldCustomerBill.getBillAmount());
	}


}
