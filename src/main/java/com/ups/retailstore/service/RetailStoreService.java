package com.ups.retailstore.service;

import com.ups.retailstore.entity.CustomerType;
import com.ups.retailstore.model.Bill;
import org.springframework.stereotype.Service;

@Service
public class RetailStoreService implements  BillOperations{


    @Override
    public Bill getBillDiscount(Double billAmount,Double groceriesCost,int customerType) {
        Bill customerBill = new Bill();
        Double discountAmount = 0.0;
        Double billWithoutGroceriesCost=0.0;
        int discountPercentage = CustomerType.getDiscountPercentage(customerType);
        billWithoutGroceriesCost = (billAmount - groceriesCost);
        discountAmount = ((billWithoutGroceriesCost * discountPercentage) / 100);
        if(billAmount>=100){
            customerBill.setBillAmount(billWithoutGroceriesCost - discountAmount - getMoreDiscount(billWithoutGroceriesCost));
        }else
            customerBill.setBillAmount(billWithoutGroceriesCost - discountAmount);

        customerBill.setDiscount(discountPercentage+"%");

        return customerBill;
    }

    private Double getMoreDiscount(Double billAmount) {
        return  ((Math.floor(Math.floor(billAmount) / 100) * 5));
    }
}
