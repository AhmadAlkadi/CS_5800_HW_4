/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Macronutrient;

public class Fats extends Macronutrient{
    private static final Fats instance = new Fats();
    
    private Fats(){
    }
    
    @Override
    public String getFood(String foodType){
        switch (foodType){
            case "Avocado":
                return "Avocado";
            case "Tuna":
                return "Tuna";
            case "Peanuts":
                return "Peanuts";
            case "Sour cream":
                return "Sour cream";
        }
        return null;
    }
    
    public static Fats getInstance(){
        return instance;
    }
}
