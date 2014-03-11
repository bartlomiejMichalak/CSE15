/*
CSE 15
Bart MIchalak
bpm215

Program Description: Analyze arrays
Lab  #9
Date: November 8, 2011
*/

import java.util.Scanner;
public class Analyze {
public static void main(String[] args) {
        double [] score = new double[10];
    double average = 0; 
    double sum = 0; 
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter 10 integers values");
    for(int index = 0; index < score.length; index++){  
        score[index] = keyboard.nextDouble();         
        sum = sum + score[index];      
    }
    System.out.println(" ");
    System.out.println("Numbers in Array");
    System.out.println(score[0]);
          System.out.println(score[1]);
          
          System.out.println(score[2]);
          
          System.out.println(score[3]);
          
          System.out.println(score[4]);
          
          System.out.println(score[5]);
          
          System.out.println(score[6]);
          
          System.out.println(score[7]);
          
          System.out.println(score[8]);
          
          System.out.println(score[9]);
    average = sum / score.length;
    System.out.println("");
    System.out.printf("The average of the 10 numbers entered is %2.2f \n",average);
    System.out.println("");
    int counter = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > average) {
                counter++;
            }
        }
        System.out.println("The number of values greater than the average is " + counter);
        System.out.println(" ");
        System.out.println("Numbers in Reverse Order in Array");
        
        for (int i = score.length - 1; i >= 0; i--) {
        System.out.println(score[i]);

}

    }
}
