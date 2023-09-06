package org.example.conroller;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Seller;

public class ControllerCustomer {
    private Seller seller;
    private Customer customer;


    public ControllerCustomer(Seller seller,Customer customer) {
        this.seller = seller;
        this.customer = customer;
    }

    public void viewAssortment(){
        System.out.println(seller.getAssortment());
    }
    public void choiceProduct(int id,double quantity){
        Product product = seller.returnProductById(id);
        product.setQuantity(quantity);
        customer.addProductInBasket(product);
    }
}
