package com.ups.retailstore.service;

import com.ups.retailstore.model.Bill;

public interface BillOperations {

    public Bill getBillDiscount(Double billAmount,Double groceriesCost,int customerType);
}
