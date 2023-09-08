package org.example;

import org.example.controller.ControllerCustomer;
import org.example.controller.ControllerSeller;
import org.example.enumeration.CategoryOfProduct;
import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Seller;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Twix", "шт", 10.0, 100.0, CategoryOfProduct.CANDY_SECTION);
        Product product2 = new Product(2,"Coca-cola 0.5", "шт", 20.0, 100,CategoryOfProduct.BAR);
        Product product3 = new Product(3,"Ice-cool шайба", "шт", 8.0, 100,CategoryOfProduct.TOBACCO_AND_ALCOHOL);
        List<Product> basket = new ArrayList<>();
        List<Product> assortment = new ArrayList<>();

        assortment.add(product1);
        assortment.add(product2);
        assortment.add(product3);

        Customer customer = new Customer("customer", "customerNumber", "customerAddress", basket,12000);
        Seller seller = new Seller("seller", "sellerNumber", "sellerAddress", assortment,0);
        ControllerCustomer controllerCustomer = new ControllerCustomer(seller, customer);
        ControllerSeller controllerSeller = new ControllerSeller(seller, customer);
        System.out.println("Бюджет покупателя до: " + customer.getCash());
        System.out.println("Бюджет продавца до: " + seller.getCash());
        controllerCustomer.viewAssortment();
        controllerCustomer.choiceProduct(1,4.0);
        controllerCustomer.choiceProduct(2,2.0);
        controllerSeller.invoicing();
        controllerCustomer.paymentBuy();
        System.out.println(customer.getBasketPrice());
        System.out.println("Бюджет покупателя после: " + customer.getCash());
        System.out.println("Бюджет продавца после: " + seller.getCash());

    }
}
// Проблема с id не совпадают 🗸
// Взаимосвязь количества товаров у покупателя и продавца🗸
// Указали категории товаров 🗸