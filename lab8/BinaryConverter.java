/*
CSE 15
Bart Michalak
bpm215
Binary Conversion 
Lab  #8  
Date: October 25, 2011
*/

import java.util.Scanner;
public class BinaryConverter
{
  public static void main(String [] args)
  {
    Scanner keyboard = new Scanner(System.in);
    
    char digit = '0';
    String line;
    int finalValue = 0;
    int place;
    int temp = 0;
    line = keyboard.nextLine();
    for( int i=line.length() - 1; i >= 0; i-- ) 
    {
     place = line.length() - i - 1;
     finalValue += Integer.parseInt(Character.toString(line.charAt(i))) * Math.pow(2, place);
          
    }
    
    System.out.println(line + " " + finalValue);
    
    
  }
}
