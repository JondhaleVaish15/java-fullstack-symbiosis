package Bookapp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your date of birth (yyyy-MM-dd): ");
        String dob = sc.nextLine();
        System.out.println("Enter today's date(yyyy-MM-dd): ");
        String currentDate=sc.nextLine();
        
        LocalDate dateOfBirth = LocalDate.parse(dob);
         
        LocalDate currentDate1 = LocalDate.now();
        
         Period age = Period.between(dateOfBirth, currentDate1);
        
      System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days old.");
        
      
        sc.close();
    }
}

