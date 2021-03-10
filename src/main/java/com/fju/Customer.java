package com.fju;

public class Customer {
    String number;
    int price;
    int discount;
    int total;

public Customer(String number, int price){
    this.number=number;
    this.price=price;
}

public void printCustomer(){
    System.out.println(number+"\t"+price+"\t"+discount+"\t"+total);
}
}
