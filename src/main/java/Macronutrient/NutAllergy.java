/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Macronutrient;

import java.util.Random;

public class NutAllergy extends DietPlan{
    private Random rand = new Random();
    
    public void NutAllergy(){
    }
    
    @Override
    public String getCarbs(){
        int randValue = rand.nextInt(3);
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
        }
        return carbs;
    }
    @Override
    public String getProtein(){
        int randValue = rand.nextInt(4);
        String protein = null;
        switch (randValue){
            case 0:
                protein = Protein.getInstance().getFood("Fish");
                break;
            case 1:
                protein = Protein.getInstance().getFood("Chicken");
                break;
            case 2:
                protein = Protein.getInstance().getFood("Beef");
                break;
            case 3:
                protein = Protein.getInstance().getFood("Tofu");
                break;
        }
        return protein;
    }
    @Override
    public String getFats(){
        int randValue = rand.nextInt(3);
        String fats = null;
        switch (randValue){
            case 0:
                fats = Fats.getInstance().getFood("Avocado");
                break;
            case 1:
                fats = Fats.getInstance().getFood("Tuna");
                break;
            case 2:
                fats = Fats.getInstance().getFood("Sour cream");
                break;
        }
        return fats;
    }
}
