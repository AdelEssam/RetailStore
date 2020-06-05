
This project is a simple spring boot application applying some retail site discount which as the following

1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

## Requirements

For building and running the application you need:
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

```shell
mvn spring-boot:run
```


## Rest API sample Request
- http://localhost:8080/bill/getBillDetails?customerType=3&billAmount=1000&groceriesAmount=100

## Customer Types
- ID = 1 for Employee will get 30% discount.
- ID = 2 for affiliate of the store, he gets a 10% discount.
- ID = 3 for customer for over 2 years, he gets a 5% discount.