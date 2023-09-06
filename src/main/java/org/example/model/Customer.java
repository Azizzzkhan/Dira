package org.example.model;

import java.util.List;

public class Customer {
    private String nameOfOrganization; //Наименование организации
    private String numberPhone; //Номер телефона
    private String address; //Адрес
    private List<Product> basket; //Корзина

    public Customer(String nameOfOrganization, String numberPhone, String address, List<Product> basket) {
        this.nameOfOrganization = nameOfOrganization;
        this.numberPhone = numberPhone;
        this.address = address;
        this.basket = basket;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameOfOrganization='" + nameOfOrganization + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}