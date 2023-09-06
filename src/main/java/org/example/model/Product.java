package org.example.model;

public class Product {

    private int id;
    private String nameProduct; //Имя продукта
    private String measure; //Мера измерения продукта
    private double quantity; //Кол-во продукта
    private double price; //Цена продукта

    public Product(int id,String nameProduct, String measure, double quantity, double price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.measure = measure;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", measure='" + measure + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
