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
   
    
    //Get Input
    System.out.println("Enter number of hours worked:");
    hours = keyboard.nextInt();
    System.out.println("Enter number of overtime hours worked:");
    overtimeHours = keyboard.nextInt();
    if( hours > 40){
     overtimeHours = hours - 40;
     hours = 40;
    }
    System.out.println("Enter hourly pay rate:");
    hrlyRate = keyboard.nextDouble();
    System.out.println("Enter federal tax withholding rate:");
    fedRate = keyboard.nextDouble();
    System.out.println("Enter state tax withholding rate:");
    stateRate = keyboard.nextDouble();
    
    grossPay = ((hours * hrlyRate) + (overtimeHours * (1.5 * hrlyRate)));
    fedDeduction = (((fedRate/100) * (((hours * hrlyRate)) + (overtimeHours * (1.5 * hrlyRate)))));
    stateDeduction = (((stateRate/100) * (((hours * hrlyRate)) + (overtimeHours * (1.5 * hrlyRate)))));
    totDeduction = stateDeduction + fedDeduction;
    netPay = grossPay - stateDeduction - fedDeduction;
    
    
    System.out.println("PayrollStatement:");
    System.out.println("Hours worked: " + hours);
    System.out.println("Overtime Hours worked: " + overtimeHours);
    System.out.println("Hourly Rate: " + hrlyRate);
    System.out.println("Gross Pay: $" + ((hours * hrlyRate) + (overtimeHours * (1.5 * hrlyRate))));
    
    System.out.println("\n Deductions:");
    System.out.println("\t Federal Withholding: " + fedRate + "%");
    System.out.println("\t Federal Deductions: $" + fedDeduction);
    System.out.println("\n\t State Withholding: " + stateRate + "%");
    System.out.println("\t State Deductions: $" + stateDeduction);
    System.out.println("Total Deduction: $" + totDeduction);
    System.out.println("\n Net Pay: $" + netPay);
    
    
    
    
    //Calculate gross pay, state and federal deductions and net pay
   
    
    //Output payroll statement
    
    
  }
}
    