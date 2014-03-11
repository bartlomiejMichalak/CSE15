import java.util.*;
public class p2
{
  public double rate, prediction, stockPrice;
  public int diceOne, diceTwo, diceThree;
  public String type;
  
  
  
  public void diceRoll(){
    diceOne =(int)(6*(Math.random()+1));
    diceTwo =(int)(6*(Math.random()+1));
    diceThree = (int)Math.floor(2*(Math.random()));
    if(diceThree == 1){
      diceThree = 1;
    }
    else 
    {
      diceThree = -1;
    }
  }
  
  public void type(){
    rate = ((double)(diceOne)/(diceTwo))/ (100*diceThree);
    prediction = (rate * stockPrice) + stockPrice;
    stockPrice = prediction;
    if (diceThree == 1)
     type = " up ";
     else{
    type = " down "; 
   }
     rate = rate*100;
  }
  public void run()
  {
     //Variables and Stuff here
    Scanner keyboard = new Scanner(System.in);
    
    String ticker;
   
    
    
    //Input Output
    System.out.println("Please enter the ticker symbol for your company:");
    ticker = keyboard.next();
    System.out.println("Enter the current selling price of your stock:");
    stockPrice = keyboard.nextDouble();
   
    
    System.out.println("My 5 Day prediction for ticker " + ticker + " is: ");
    
    diceRoll();
    type();
    System.out.printf("Day1 $%3.2f %s %3.2f %%\n", prediction, type, rate);
    
    diceRoll();
    type();
    System.out.printf("Day2 $%3.2f %s %3.2f %%\n", prediction, type, rate);
    
    diceRoll();
    type();
    System.out.printf("Day3 $%3.2f %s %3.2f %%\n", prediction, type, rate);
    
    diceRoll();
    type();
    System.out.printf("Day4 $%3.2f %s %3.2f %%\n", prediction, type, rate);
    
    diceRoll();
    type();
    System.out.printf("Day5 $%3.2f %s %3.2f %%\n", prediction, type, rate);
    
    
  }
  
  public static void main(String [] args)
  {
    p2 newStock = new p2();
    newStock.run();
  }
}