package com.fju;

public class Bill {
    public static void main(String[] args) {
        Customer[] cs = new Customer[]{
                new Customer("0013",490),
                new Customer("0052",1000),
                new Customer("0081",290),
                new Customer("2122",2000),
        };
        System.out.println("客戶編號/消費金額/折讓/金額");
        for(Customer c:cs){
            if(c.price/1000>0){
                c.discount=100*(c.price/1000);
                c.total=c.price-c.discount;
            }else{
                c.discount=0;
                c.total=c.price;
            }
            c.printCustomer();
        }
    }
}
