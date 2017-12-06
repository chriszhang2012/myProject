/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis044.project;

import javax.swing.JFrame;

/**
 *
 * @author chris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayBag<Product> cart = new ArrayBag<>();
        User[] userlist = new User[20];
        int index_acc=-1;
        
        
        Product p1 = new Product("Dell", "laptop", 1000.00, 10);
        Product p2 = new Product("Dell", "computer", 1200.00, 20);
        Product p3 = new Product("Apple", "Macbook", 1500.00, 100);
        Product p4 = new Product("Apple", "Ipad", 500.00, 100);
        Product p5 = new Product("Apple", "Iphone", 800.00, 100);
        Product p6 = new Product("Nike", "shoes", 60.00, 100);
        Product p7 = new Product("Adidas", "shoes", 70.00, 100);
        Product p8 = new Product("Adidas", "shirt", 20.00, 50);
        Product p9 = new Product("Nike","shirt",15.00,50);
        Product p10 = new Product("Canon","printer",100.00,100);
        Product p11 = new Product("HP","printer",120.00,100);
        Product p12 = new Product("Canon","Camera",1200.00,10);
        

        cart.add(p1);
        cart.add(p2);
        cart.add(p3);
        cart.add(p4);
        cart.add(p5);
        cart.add(p6);
        cart.add(p7);
        cart.add(p8);
        cart.add(p9);
        cart.add(p10);
        cart.add(p11);
        cart.add(p12);

        
        Frame_LoginSignupPage login = new Frame_LoginSignupPage(userlist, index_acc, cart);
        login.setTitle("Login Page");
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        // TODO code application logic here
    }

}
