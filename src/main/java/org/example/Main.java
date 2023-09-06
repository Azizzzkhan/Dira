package org.example;

import org.example.conroller.ControllerCustomer;
import org.example.conroller.ControllerSeller;
import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Seller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Twix", "шт", 10.0, 100.0);
        Product product2 = new Product(2,"Coca-cola 0.5", "шт", 20.0, 100);
        Product product3 = new Product(3,"Ice-cool шайба", "шт", 8.0, 100);
        List<Product> basket = new ArrayList<>();
        List<Product> assortment = new ArrayList<>();

        assortment.add(product1);
        assortment.add(product2);
        assortment.add(product3);

        Customer customer = new Customer("customer", "customerNumber", "customerAddress", basket);
        Seller seller = new Seller("seller", "sellerNumber", "sellerAddress", assortment);
        ControllerCustomer controllerCustomer = new ControllerCustomer(seller, customer);
        ControllerSeller controllerSeller = new ControllerSeller(seller, customer);
        controllerCustomer.viewAssortment();
        controllerCustomer.choiceProduct(1,4.0);
        controllerCustomer.choiceProduct(2,2.0);
        controllerSeller.invoicing();
        System.out.println(customer.getBasketPrice());
    }
}
// Проблема с id не совпадают
// Взаимосвязь количества товаров у покупателя и продавца