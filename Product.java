/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis044.project;

/**
 *
 * @author chris
 */
public class Product implements Comparable<Product> {
    private String brand;
    private String itemName;
    private double itemPrice;
    private int quantity;
    
    public Product(String brand, String itemName, double itemPrice,  int quantity) {
        this.brand = brand;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString(){
        return brand + " "+ itemName + " $" + itemPrice +"\n";
    
    }

    @Override
    public int compareTo(Product other) {
        if(getItemPrice()>other.getItemPrice()) return -1;
        if(getItemPrice()<other.getItemPrice()) return  1;
        return 0;
        
        
    }
    
    
    
    
}
