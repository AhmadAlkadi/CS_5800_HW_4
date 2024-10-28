/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Macronutrient;

public class Customer {
    private String name;
    private String carbs;
    private String fats;
    private String protein;
    private String diet;
    
    public void Customer(){
    }
    
    public void setCustomerName(String name){
        this.name = name;
    }
    
    public void setCustomerDiet(String diet){
        this.diet = diet;
        switch(diet){
            case "No Restriction":
                NoRestriction noRestriction = new NoRestriction();
                carbs = noRestriction.getCarbs();
                fats = noRestriction.getFats();
                protein = noRestriction.getProtein();
                break;
            case "Paleo":
                Paleo paleo = new Paleo();
                carbs = paleo.getCarbs();
                fats = paleo.getFats();
                protein = paleo.getProtein();
                break;
            case "Vegan":
                Vegan vegan = new Vegan();
                carbs = vegan.getCarbs();
                fats = vegan.getFats();
                protein = vegan.getProtein();
                break;
            case "Nut Allergy":
                NutAllergy nutAllergy = new NutAllergy();
                carbs = nutAllergy.getCarbs();
                fats = nutAllergy.getFats();
                protein = nutAllergy.getProtein();
                break;
        }
    }
    
    public void printDiet(){
        System.out.println("Customers Name: "+name+ " |Diet Type: " + diet +
                " |Suggested Carbs: " + carbs + " |Suggested Protein: "
        + protein + " |Suggested Fats: " + fats);
    }
}
