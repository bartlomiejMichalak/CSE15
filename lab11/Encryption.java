/*
CSE 15
Bartlomiej "Bart" Michalak
bpm215
Encryption
Program Description: Practice data encryption
Lab #11
Date: November 22, 2011
*/

import java.util.Scanner;

public class Encryption{

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    char[][]letters = {{'A','B','C','D','E'},
      {'F','G','H','I','J'},
      {'K','L','M','N','O'},
      {'P','Q','R','S','T'},
      {'U','V','W','X','Y','Z'}};
String input = "";

String output = "";

System.out.println("Please enter a phrase: ");
input = keyboard.nextLine();
for (int i = 0; i < input.length(); i++)
for (int j = 0; j < letters.length; j++)
for (int k = 0; k < letters[j].length; k++)
if(input.charAt(i) == letters[j][k])
output = output + (k + 1) + (j + 1) + " ";

System.out.println(output);
}
}
