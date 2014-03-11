/*
CSE 15
Bart Michalak
bpm215
Conversion 
HW 15 part I  
Date: October 25, 2011
*/

import java.util.Scanner;
public class HexConverter
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
     finalValue=Integer.parseInt(line,16);
     place = line.length() - i - 1;
     //finalValue += Integer.parseInt(Character.toString(line.charAt(i))) * Math.pow(line, 8);
          
    }
    
    System.out.println(line + " " + finalValue);
    
    
  }
}
