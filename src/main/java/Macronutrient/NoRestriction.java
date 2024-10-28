/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Macronutrient;
import java.util.Random;

public class NoRestriction extends DietPlan{
    private Random rand = new Random();
    
    public void NoRestriction(){
    }
    
    @Override
    public String getCarbs(){
        int randValue = rand.nextInt(4);
        String carbs = null;
        switch (randValue){
            case 0:
                carbs = Carbs.getInstance().getFood("Bread");
                break;
            case 1:
                carbs = Carbs.getInstance().getFood("Lentils");
                break;
            case 2:
                carbs = Carbs.getInstance().getFood("Cheese");
                break;
            case 3:
                carbs = Carbs.getInstance().getFood("Pistachio");
                break;
        }
        return carbs;
    }
    @Override
    public String getProtein(){
        int randValue = rand.nextInt(4);
        String protein = null;
        switch (randValue){
            case 0:
                protein = Fats.getInstance().getFood("Fish");
                break;
            case 1:
                protein = Fats.getInstance().getFood("Chicken");
                break;
            case 2:
                protein = Fats.getInstance().getFood("Beef");
                break;
            case 3:
                protein = Fats.getInstance().getFood("Tofu");
                break;
        }
        return protein;
    }
    @Override
    public String getFats(){
        int randValue = rand.nextInt(4);
        String fats = null;
        switch (randValue){
            case 0:
                fats = Fats.getInstance().getFood("Avocado");
                break;
            case 1:
                fats = Fats.getInstance().getFood("Tuna");
                break;
            case 2:
                fats = Fats.getInstance().getFood("Peanuts");
                break;
            case 3:
                fats = Fats.getInstance().getFood("Sour cream");
                break;
        }
        return fats;
    }
}
