/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Pizza;
import java.util.Vector;

public class PizzaBuilder {
    private int toppingsNum;
    private String pizzaChain;
    private String size;
    private Vector<String> toppings = new Vector<String>();
    
    public PizzaBuilder(){
    }
    
    public void setToppings(int toppingsNum){
        this.toppingsNum = toppingsNum;
        toppings.setSize(toppingsNum);
        toppings.clear();
    }
    
    public void setPizzaChain(String pizzaChain){
        this.pizzaChain = pizzaChain;
    }
    
    public void setSize(String size){
        if(size.equals("Small") || size.equals("Medium") || size.equals("Large")){
            this.size = size;   
        }
        else{
            System.out.println("Pizza must be set to Small, Medium, or Large");
        }
    }
    
    public void addTopping(String item){
        toppings.add(item);
    }
    
    public void eat(){
        System.out.print(pizzaChain + " " + size + " " + toppings);
        System.out.println();
    }
    
}
