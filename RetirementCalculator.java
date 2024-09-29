package Bookapp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth (yyyy-MM-dd): ");
        String dob=sc.next();
        System.out.println("Enter your joining date (yyyy-MM-dd): ");
        String jd = sc.next();
       LocalDate dateofbirth=LocalDate.parse(dob);
     
        LocalDate dateogjoining = LocalDate.parse(jd);
        Period time=Period.between(dateofbirth, dateogjoining);
        LocalDate retirementDate =dateofbirth.plusYears(58);    
        System.out.println("Your retirement date will be: " + retirementDate);    
        sc.close();
    }
}
