
//package p3;

/*
CSE 15
Bartlomiej "Bart" Michalak
bpm215
Methods 
Project # 3 
Date: October 18, 2011
*/
import java.util.Scanner;
public class P3 {
    
    public static void main(String[] args) {
    double sumTotal = 0;
    int choice = 0;
    Scanner keyboard = new Scanner(System.in);
    mainMenu(keyboard, choice, sumTotal);
    
    }
    
    public static void mainMenu(Scanner keyboard, int choice, double sumTotal){
     do{
     System.out.println("1. Order Movie Tickets");
     System.out.println("2. Order Food");
     System.out.println("3. Movie Times");
     System.out.println("4. Pay Bill");
     System.out.println("5. Exit");
     choice = getInt(keyboard);
     switch(choice){
         case 1: sumTotal = orderTickets(keyboard, choice, sumTotal);
                break;
         case 2: sumTotal = orderFood(keyboard, choice, sumTotal);
                break;
         case 3: movieTimes(keyboard);
                break;
         case 4: payBill(sumTotal, keyboard);
                break;
         case 5: System.out.println("Thank you. Goodbye.");
                break;
     }
     if(choice >5 || choice < 1){
       System.out.println("You enter an invalid value try again");
     } 
         
     }while(choice != 5);
    
     
    }
    
    public static double orderTickets(Scanner keyboard, int choice, double sumTotal){
      double price = 0;
      
      do{
      System.out.println("TICKET MENU");
      System.out.println("Please select your movie and quantity of tickets you would like to purchase.");  
      System.out.println("1. Never Say Never      - $5.75");
      System.out.println("2. Just Go with It      - $7.50");
      System.out.println("3. The Eagle            - $8.00");
      System.out.println("4. Return to main menu");
      choice = getInt(keyboard);
   
     switch(choice){
         case 1: price = 5.75;
                sumTotal += totalAmount(price, sumTotal, keyboard);
                break;
         case 2: price = 7.50;
                sumTotal += totalAmount(price, sumTotal, keyboard);
                break;
         case 3: price = 8.00;
                sumTotal += totalAmount(price, sumTotal, keyboard);
                break;
         case 4: 
                break;
     }
         }while(choice != 4);
      return sumTotal;
    }
    
    public static double orderFood(Scanner keyboard, int choice, double sumTotal){
      double price = 0;
      do{
      System.out.println("FOOD MENU");  
      System.out.println("Please select your choice and quantity you would like to purchase.");  
      System.out.println("1. Bucket of popcorn  - $10.00");
      System.out.println("2. Can ofSoda         - $2.50");
      System.out.println("3. Candy              - $5.00");
      System.out.println("4. Return to main menu");
      choice = getInt(keyboard);
     
     switch(choice){
         case 1: price = 10.00;
                sumTotal += totalAmount(price, sumTotal, keyboard);
                break;
         case 2: price = 2.50;
                sumTotal += totalAmount(price, sumTotal, keyboard);
                break;
         case 3: price = 5.00;
                sumTotal += totalAmount(price, sumTotal, keyboard);
                break;
         case 4: 
                break;
     }
         }while(choice != 4);
      return sumTotal;
      
        
    }
    public static void movieTimes(Scanner keyboard){
      System.out.println("TICKET PRICES");
      System.out.println("Please select your movie and quantity of tickets you would like to purchase.");  
      System.out.println("1. Never Say Never      - 12:00, 3:00, 7:00");
      System.out.println("2. Just Go with It      - 2:00, 6:00 10:00");
      System.out.println("3. The Eagle            - 1:00, 5:00 8:00");
      System.out.println("Hit the enter key to continue");
      keyboard.nextLine();
        
    }
    public static int getDouble(Scanner keyboard){
    while(keyboard.hasNextDouble() == false){
      System.out.println("You entered a non-double value -- try again");
      keyboard.next();
      keyboard.nextLine();
  }
    int choice = keyboard.nextInt();
    keyboard.nextLine();
    return choice;
    }
    public static double totalAmount(double price, double sumTotal, Scanner keyboard){
        System.out.println("Please enter quantity needed: ");
        int quantity = getInt(keyboard);
        do{
          if(quantity < 0){
          System.out.println("Please enter a number greater than 0.");
          quantity = getInt(keyboard);
        }
        }while(quantity < 0);
        sumTotal = price * quantity;
        return sumTotal;
        
        
    }
    public static void payBill(double sumTotal, Scanner keyboard){
        double change = 0;
        double money = 0;
        double sumTotalTax = sumTotal * 1.06;
        System.out.printf("Your bill total with tax is: $%3.2f\n",sumTotalTax);
        do{
            if (money == 0) {
            System.out.println("Please enter amount given: $" );    
            money = getInt(keyboard);
            }
            
            if (money < sumTotalTax) {
                System.out.printf("Not enough money given. You still owe an additional $%3.2f\n",(sumTotalTax - money) );
                money = getInt(keyboard); 
            }
    }
        while(sumTotalTax > money);
                
    change = money - sumTotalTax;
                
     System.out.printf("Your change is: $%3.2f\n",change);
    }
    
    
    
    public static int getInt(Scanner keyboard){
    while(keyboard.hasNextInt() == false){
      System.out.println("You entered a non-integer or double value -- try again");
      keyboard.next();
      keyboard.nextLine();
  }
    int choice = keyboard.nextInt();
    keyboard.nextLine();
    return choice;
    
    
}
}


