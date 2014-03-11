/*
CSE 15
Bartlomiej "Bart" Michalak
bpm215
Methods 
Lab  #7  
Date: October 18, 2011
*/

import java.util.Scanner;
public class Equation{
  
  public static void main(String [] args){
    int choice,answer, correctAnswer;
    Scanner keyboard = new Scanner(System.in);
    do{
      callMenu();
      choice = getInt(keyboard);
      if(choice == 1){
        System.out.println("2 + 3 = ");
        answer = getInt(keyboard);
        correctAnswer = 5;
        processAnswer(keyboard, answer, correctAnswer);
        }
      else if(choice == 2){
        System.out.println("6 - 4 = ");
        answer = getInt(keyboard);
        correctAnswer = 2;
        processAnswer(keyboard, answer, correctAnswer);
      }
       else if(choice == 3){
        System.out.println("9/ 3 = ");
        answer = getInt(keyboard);
        correctAnswer = 3;
        processAnswer(keyboard, answer, correctAnswer);
      }
       else if(choice == 4){
        System.out.println("6 * 4 = ");
        answer = keyboard.nextInt();
        correctAnswer = 24;
        processAnswer(keyboard, answer, correctAnswer);
      }
       else if(choice != 5){
         System.out.println("You enter an invalid value try again");
       }
    }
    while(choice != 5);
     System.out.println("Thanks for playing");

  }
    public static int getInt(Scanner keyboard){
    while(keyboard.hasNextInt() == false){
      System.out.println("You entered a non-integer value -- try again");
      keyboard.next();
      keyboard.nextLine();
  }
    int choice = keyboard.nextInt();
    return choice;
  }
    public static void callMenu(){
      //int choice;
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Division");
      System.out.println("4. Multiplication");
      System.out.println("5. Exit");
      System.out.println("Enter the desired arithmetic operation or a 5 to stop the program");
      
    }
    public static void processAnswer(Scanner keyboard, int answer, int correctAnswer){
      while (correctAnswer != answer){
        System.out.println("You answer is incorrect");
           answer = getInt(keyboard);
      }
      System.out.println("You are correct great Job!");
      
    }
    
  }
