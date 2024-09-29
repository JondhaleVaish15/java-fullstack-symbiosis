package Bookapp;
import java.time.LocalDate;

import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your joining date (yyyy-MM-dd): ");
        String joiningDateInput = scanner.nextLine();
      
     
        LocalDate joiningDate = LocalDate.parse(joiningDateInput);
        LocalDate retirementDate = joiningDate.plusYears(58);    
        System.out.println("Your retirement date will be: " + retirementDate);    
        scanner.close();
    }
}
