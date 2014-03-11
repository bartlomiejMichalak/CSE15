/*
CSE 15
Bartlomiej Michalak
bpm215
Lab 10
Review for midterm
Lab  #10
Date: November 15, 2011
*/

public class ArrayDemo{
    public static void main (String [] args){
      int [] numbers = new int[50];
      fillArray(numbers);
             printArray(numbers);
             boolean found = searchArray(numbers,50);
             System.out.println(found);
    }
    public static void fillArray(int [] numbers) {
     for(int i = 0; i < numbers.length; i++)
       numbers [i] = i * 25;
    }


public static void printArray(int [] numbers) {
  for(int i=0; i < numbers.length; i++){
   System.out.println(numbers[i]); 
  }
}
public static boolean searchArray(int [] numbers, int key){
 for (int i = 0; i < numbers.length; i++) {
        if (key == numbers[i]) {
            return true;  // Found key, return index.
        }
    }
    return false; 
}
}