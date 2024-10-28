/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Macronutrient;

public class MacronutrientMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer firstCustomer = new Customer();
        firstCustomer.setCustomerName("Suoma");
        firstCustomer.setCustomerDiet("Paleo");
        firstCustomer.printDiet();
        
        Customer secondCustomer = new Customer();
        secondCustomer.setCustomerName("Ana");
        secondCustomer.setCustomerDiet("No Restriction");
        secondCustomer.printDiet();
        
        Customer thirdCustomer = new Customer();
        thirdCustomer.setCustomerName("Mandlenkosi");
        thirdCustomer.setCustomerDiet("Vegan");
        thirdCustomer.printDiet();
        
        Customer forthCustomer = new Customer();
        forthCustomer.setCustomerName("Iisakki");
        forthCustomer.setCustomerDiet("Nut Allergy");
        forthCustomer.printDiet();
        
        Customer fifthCustomer = new Customer();
        fifthCustomer.setCustomerName("Dubán");
        fifthCustomer.setCustomerDiet("Vegan");
        fifthCustomer.printDiet();
        
        Customer sixthCustomer = new Customer();
        sixthCustomer.setCustomerName("Madita");
        sixthCustomer.setCustomerDiet("No Restriction");
        sixthCustomer.printDiet();
    }
    
}
