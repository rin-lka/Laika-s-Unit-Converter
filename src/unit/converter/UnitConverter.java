
package unit.converter;
import java.util.Scanner;

public class UnitConverter {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("!!Currently Only KPH working!!");
        System.out.println("Welcome to the Unit Converter!");
        System.out.println("What would you like to convert?");
        System.out.println("Distance - Time Zone - Speed - Weight");
        
        String userIn = reader.nextLine().toLowerCase();
        
        if (userIn.equals("speed")){
            System.out.println("You have selected speed, please choose your starting unit.");
            System.out.println("KPH - MPH - Knots - M/S");
            
            String speedSelect = reader.nextLine().toLowerCase();
            
            if (speedSelect.equals("kph")){
                System.out.println("You have selected Kilometres Per Hour, please enter the value you want to convert.");
                
                int userKPH = reader.nextInt();
                
                System.out.println("Please select your target unit.");
                System.out.println("MPH - Knots - M/S");
               
            }
        }
        
        

    }
    
}
