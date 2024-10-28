/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Macronutrient;


public class Carbs extends Macronutrient{
    private static final Carbs instance = new Carbs();
    
    private Carbs(){
    }
    
    @Override
    public String getFood(String foodType){
        switch (foodType){
            case "Bread":
                return "Bread";
            case "Lentils":
                return "Lentils";
            case "Cheese":
                return "Cheese";
            case "Pistachio":
                return "Pistachio";
        }
        return null;
    }
    
    public static Carbs getInstance(){
        return instance;
    }
}
