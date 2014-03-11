/*
CSE 15
Bart Michalak
bpm215
Program Description: Java
Lab  #5    
Date: September 26, 2011
*/

import java.util.Scanner;
public class PayRoll
{
  public static void main(String [] args)
  {
    //variable declarations
    Scanner keyboard = new Scanner(System.in);
    int hours;
    int overtimeHours = 0;
    double hrlyRate, grossPay, netPay, overTime;
    double fedRate, stateRate, fedDeduction, stateDeduction, totDeduction;
    String lName, fName, payPeriod;
    /*
    double number = 23.456;
    int number2 = 45678;
    char letter = 'a';
    String name = "Bart Michalak";
    
    System.out.printf("The number is :(%3.2f)\n",number);
    System.out.printf("The integer number is: %d%%\n",number2);
    System.out.printf("Name is %s\n", name);
    */
    
    //Input  
    System.out.println("Enter Empolyee's Name (First and Last)");
    fName = keyboard.next();
    lName = keyboard.next();
    //Get Input
    System.out.println("Enter number of hours worked:");
    hours = keyboard.nextInt();
    keyboard.nextLine();
    System.out.println("Enter number of overtime hours worked:");
    overtimeHours = keyboard.nextInt();
    if( hours > 40){
     overtimeHours = hours - 40;
     hours = 40;
    }
    keyboard.nextLine();
    System.out.println("Enter hourly pay rate:");
    hrlyRate = keyboard.nextDouble();
    keyboard.nextLine();
    System.out.println("Enter Dates of Pay Period Worked:");
    payPeriod = keyboard.nextLine();
    System.out.println("Enter federal tax withholding rate:");
    fedRate = keyboard.nextDouble();
    keyboard.nextLine();
    System.out.println("Enter state tax withholding rate:");
    stateRate = keyboard.nextDouble();
    
    grossPay = ((hours * hrlyRate) + (overtimeHours * (1.5 * hrlyRate)));
    fedDeduction = (((fedRate/100) * (((hours * hrlyRate)) + (overtimeHours * (1.5 * hrlyRate)))));
    stateDeduction = (((stateRate/100) * (((hours * hrlyRate)) + (overtimeHours * (1.5 * hrlyRate)))));
    totDeduction = stateDeduction + fedDeduction;
    netPay = grossPay - stateDeduction - fedDeduction;
    
    
    System.out.printf("PayrollStatement: \n\n");
    System.out.println("Employee's Last Name: " + lName);
    System.out.println("Employee's First Name: " + fName);
    System.out.println("Hours worked: " + hours);
    System.out.printf("Pay Period Worked: %s\n",payPeriod);
    System.out.println("Overtime Hours worked: " + overtimeHours);
    System.out.println("Hourly Rate: " + hrlyRate);
    System.out.println("\n Gross Pay: $" + ((hours * hrlyRate) + (overtimeHours * (1.5 * hrlyRate))));
    System.out.println("Deductions:");
    System.out.printf("\t Federal Withholding(%2.0f%%): $%3.2f\n",fedRate,fedDeduction);
    System.out.printf("\t State Withholding(%2.0f%%): $%3.2f\n",fedRate,fedDeduction);
    System.out.println("\n\t State Withholding: " + stateRate + "%");
    System.out.println("\t State Deductions: $" + stateDeduction);
    System.out.println("Total Deduction: $" + totDeduction);
    System.out.println("\n Net Pay: $" + netPay);
    
    
  }
}


    