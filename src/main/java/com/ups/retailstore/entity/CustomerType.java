package com.ups.retailstore.entity;


public enum CustomerType {
    EMPLOYEE(1, 30),
    AFFILIATE(2, 10),
    OLD_CUSTOMER(3, 5);

    private final int typeId;
    private final int discPercentage;

    private CustomerType(Integer type, Integer discPercentage) {
        this.typeId = type;
        this.discPercentage = discPercentage;
    }

    public static int getDiscountPercentage(int customerType) {
        switch(customerType) {
            case 1:
                return EMPLOYEE.discPercentage;
            case 2:
                return AFFILIATE.discPercentage;
            case 3 :
                return OLD_CUSTOMER.discPercentage;
            default:
                return -1;
        }
    }

}
