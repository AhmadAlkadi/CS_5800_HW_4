/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Macronutrient;

/**
 *
 * @author PROXD
 */
public class Protein extends Macronutrient{
    private static final Protein instance = new Protein();
    
    private Protein(){
    }
    
    @Override
    public String getFood(String foodType){
        switch (foodType){
            case "Fish":
                return "Fish";
            case "Chicken":
                return "Chicken";
            case "Beef":
                return "Beef";
            case "Tofu":
                return "Tofu";
        }
        return null;
    }
    
    public static Protein getInstance(){
        return instance;
    }
}
