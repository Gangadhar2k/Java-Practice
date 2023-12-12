package com.functionalProgramming.FunctionalInterface;

import java.util.function.Consumer;

class CustomerRecord{
     public final String name;
    public final int phone;

    public CustomerRecord(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }
}
public class _Consumer {
    public static void main(String[] args) {

        Consumer<CustomerRecord> CustomerInfo = customer -> System.out.println("This is "+customer.name+" and Phone Number "+customer.phone);
        var customer = new CustomerRecord("Aravind",98765);
        CustomerInfo.accept(customer);
        //This isAravind and Phone Number 98765
    }
}

