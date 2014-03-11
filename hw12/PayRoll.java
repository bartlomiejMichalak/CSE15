/*
CSE 15
Bartlomiej Michalak
hsz215
Program Description: Designing a financial applications payroll system
Homework 11   
Date: October 6, 2011
*/

import java.util.Scanner;
public class PayRoll
{
  public static void main(String [] args)
  {
    //variable declarations
    Scanner keyboard = new Scanner(System.in);
    int hours = 0;
    int overHours = 0;
    String firstName, lastName, payPeriod;
    double hrlyRate = 0, grossPay, netPay;
    double fedRate = 0, stateRate = 0, fedDeduction, stateDeduction, totDeduction;
    
    
    /*System.out.printf("The number is: %3.2f\n", number);
    System.out.printf("The integer number is: %6d", number2);
    */
    //Get Input
    System.out.println("Enter Employee's Name (First and Last)");
    firstName = keyboard.next();
    lastName = keyboard.next();
    System.out.println("Enter number of hours worked in a pay period:");
    if (keyboard.hasNextInt() == true){
 hours = keyboard.nextInt();
  while (hours>80||hours<40){
   System.out.println("Entered value is incorrect.Please enter number of hours worked (between 40 and 80) in a pay period:");
    if (keyboard.hasNextInt() == true){
 hours = keyboard.nextInt();
  }
  
  }
    }
  
    
 
 else{
  System.out.println("You did not enter an integer value for Hours Worked");
  System.exit(1);
 }
 
 
    keyboard.nextLine();
    System.out.println("Enter hourly pay rate:");
 if (keyboard.hasNextDouble() == true){
 hrlyRate = keyboard.nextDouble();
  while (hrlyRate<5||hrlyRate>100){
   keyboard.nextLine();
    System.out.println("The entered value is incorrect. Please enter hourly pay rate between $5 and $100:");
    if (keyboard.hasNextInt() == true){
 hrlyRate = keyboard.nextInt();
  }
  }
 }
  
    keyboard.nextLine();
    System.out.println("Enter Dates of Pay Period Worked");
    payPeriod = keyboard.nextLine();
    System.out.println("Enter federal tax withholding rate:");
    
 if (keyboard.hasNextDouble() == true){
 fedRate = keyboard.nextDouble();
  while (fedRate<5||fedRate>35){
   payPeriod = keyboard.nextLine();
    System.out.println("Value entered is invalid.Please enter federal tax withholding (between 5% and 35&) rate:");
    if (keyboard.hasNextInt() == true){
 fedRate = keyboard.nextInt();
  }
  }
  
 }
 
 else{
  System.out.println("You did not enter an integer value for Federal Rate");
  System.exit(1);
 }

    System.out.println("Enter state tax withholding rate:");
    
 if (keyboard.hasNextDouble() == true){
 stateRate = keyboard.nextDouble();
  while (stateRate<2||stateRate>20){
     System.out.println("Value entered is invalid. Please enter state tax withholding (between 2% and 20% rate:");
    if (keyboard.hasNextDouble() == true){
 stateRate = keyboard.nextDouble();
   
  }
  }
 }
 
 else{
  System.out.println("You did not enter an integer value for State Rate");
  System.exit(1);
 }

 
    
    
    //Calculate gross pay, state and federal deductions and net pay
    
    if (hours>40)
    {
      overHours = hours - 40;
      hours = 40;
    }
    else {
    }
    
    grossPay = hrlyRate * hours + (overHours * hrlyRate * 1.5);
    fedDeduction = fedRate/100 * grossPay;
    stateDeduction = stateRate/100 * grossPay;
    totDeduction = fedDeduction + stateDeduction;
    netPay = grossPay - totDeduction;
    
    
    //Output payroll statement
    System.out.println("Payroll statement" + "\n");
    
    System.out.println("Employee's Last Name: " + lastName);
    System.out.println("Employee's First Name: " + firstName);
    System.out.printf("Pay Period Worked : %s", payPeriod + "\n");
    System.out.println("Hours Worked: " + hours);
    System.out.printf("Hourly Rate: $%3.2f\n", hrlyRate);
    System.out.printf("Gross Pay: $%3.2f\n", grossPay);
    System.out.println("Deductions:");
    System.out.printf("\t Federal Withholding (%2.0f%%): $%3.2f\n",fedRate, fedDeduction);
    System.out.printf("\t State Withholding(%1.0f%%): $%3.2f\n", stateRate, stateDeduction);
    System.out.printf("Total Deductions: $%3.2f\n",totDeduction);
    System.out.printf("Net Pay: $%3.2f", netPay);
    
    
  }
}
    