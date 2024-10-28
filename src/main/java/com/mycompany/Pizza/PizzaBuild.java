/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Pizza;

public class PizzaBuild {

    public static void main(String[] args) {
        PizzaBuilder pizzaHutFirst = new PizzaBuilder();
        pizzaHutFirst.setToppings(3);
        pizzaHutFirst.setPizzaChain("Pizza Hut");
        pizzaHutFirst.setSize("Large");
        pizzaHutFirst.addTopping("Pepperoni");
        pizzaHutFirst.addTopping("Bacon");
        pizzaHutFirst.addTopping("Beef");
        pizzaHutFirst.eat();
        
        PizzaBuilder pizzaHutSecond = new PizzaBuilder();
        pizzaHutFirst.setToppings(2);
        pizzaHutFirst.setPizzaChain("Pizza Hut");
        pizzaHutFirst.setSize("Small");
        pizzaHutFirst.addTopping("Pepperoni");
        pizzaHutFirst.addTopping("Bacon");
        pizzaHutFirst.eat();
        
        PizzaBuilder littleCaesarsFirst = new PizzaBuilder();
        pizzaHutFirst.setToppings(8);
        pizzaHutFirst.setPizzaChain("Little Caesars");
        pizzaHutFirst.setSize("Medium");
        pizzaHutFirst.addTopping("Pepperoni");
        pizzaHutFirst.addTopping("Bacon");
        pizzaHutFirst.addTopping("Beef");
        pizzaHutFirst.addTopping("Olives");
        pizzaHutFirst.addTopping("Spinach");
        pizzaHutFirst.addTopping("Ham");
        pizzaHutFirst.addTopping("Pesto");
        pizzaHutFirst.addTopping("Spicy Pork");
        pizzaHutFirst.eat();
        
        PizzaBuilder littleCaesarsSecond = new PizzaBuilder();
        pizzaHutFirst.setToppings(6);
        pizzaHutFirst.setPizzaChain("Little Caesars");
        pizzaHutFirst.setSize("Small");
        pizzaHutFirst.addTopping("Pepperoni");
        pizzaHutFirst.addTopping("Beef");
        pizzaHutFirst.addTopping("Olives");
        pizzaHutFirst.addTopping("Spinach");
        pizzaHutFirst.addTopping("Ham");
        pizzaHutFirst.addTopping("Pesto");
        pizzaHutFirst.eat();
        
        PizzaBuilder dominosFirst = new PizzaBuilder();
        pizzaHutFirst.setToppings(1);
        pizzaHutFirst.setPizzaChain("Dominos");
        pizzaHutFirst.setSize("Small");
        pizzaHutFirst.addTopping("Pepperoni");
        pizzaHutFirst.eat();
        
        PizzaBuilder dominosSecond = new PizzaBuilder();
        pizzaHutFirst.setToppings(3);
        pizzaHutFirst.setPizzaChain("Dominos");
        pizzaHutFirst.setSize("Large");
        pizzaHutFirst.addTopping("Spinach");
        pizzaHutFirst.addTopping("Ham");
        pizzaHutFirst.addTopping("Pesto");
        pizzaHutFirst.eat();
    }
}
