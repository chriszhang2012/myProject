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
public class User  {
    private int UserName;
    private int Password;
    private Product[] Cart;
    private double Payment;
    private double Balance;
    private String name;

    public User(int UserName, int Password, String name,Product[] Cart, double Payment,double Balance) {
        this.name = name;
        this.UserName = UserName;
        this.Password = Password;
        this.Cart = Cart;
        this.Payment = Payment;
        this.Balance = Balance;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public double getBalance() {
        return Balance;
    }
    
    
    public int getUserName() {
        return UserName;
    }

    public int getPassword() {
        return Password;
    }

    public Product[] getCart() {
        return Cart;
    }

    public double getPayment() {
        return Payment;
    }

    public void setUserName(int UserName) {
        this.UserName = UserName;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }

    public void setCart(Product[] Cart) {
        this.Cart = Cart;
    }

    public void setPayment(double Payment) {
        this.Payment = Payment;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
    
    
}
