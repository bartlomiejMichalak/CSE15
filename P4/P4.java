import java.util.Scanner;

public class P4{
//* gameArray is the board that gets printed out after every move. Should be noted that this is only the board and changes during game are not made in within its lines. *//
int[][] gameArray = {{1,4,7},
{2,5,8},
{3,6,9}};


public static void main(String[] args) {
P4 game = new P4();
game.runGame();
}
//* This method controls the game itself and is called through the main. The Scanner is initialized within this method as well and the loop through which i have chosen to run the game.*//
void runGame(){
Scanner keyboard = new Scanner (System.in);

boolean gameOver = true;

//* This while loop controls when the game runs. Once the the loop can be exited the game automatically ends and the method "gameOver" is called.*//

while(gameOver){
printGameBoard();

System.out.println("Enter the number (1-9) to where the O will be entered");
checkInt(keyboard, 11);

gameOver = gameOver();

if (!gameOver)
continue;

printGameBoard();

System.out.println("Enter the number (1-9) to where the X will be entered");
checkInt(keyboard, 10);

gameOver = gameOver();
}
}
//* printGameBoard() prints the gameArray and creates the baord the player visually interacts with. Method checkGridPiece() recieves the array and later chages the the contents of drid piece in play and changes it accordingly.*//
void printGameBoard() {
System.out.println( "-------------" );
System.out.println( "| " + checkGridPiece(gameArray[0][0]) + " | " + checkGridPiece(gameArray[0][1]) + " | " + checkGridPiece(gameArray[0][2]) + " |" );
System.out.println( "| " + checkGridPiece(gameArray[1][0]) + " | " + checkGridPiece(gameArray[1][1]) + " | " + checkGridPiece(gameArray[1][2]) + " |" );
System.out.println( "| " + checkGridPiece(gameArray[2][0]) + " | " + checkGridPiece(gameArray[2][1]) + " | " + checkGridPiece(gameArray[2][2]) + " |" );
System.out.println( "-------------" );
}
//* Since there are 9 possible choices in the grid, the grid pieces for X and O are 10 and 11 respectively. This is done so that the game can call a draw once it sees each grid is filled with a value > 9.*//
String checkGridPiece( int gridPiece ) {
if (gridPiece == 10)
return "X";
else if (gridPiece == 11)
return "O";

return Integer.toString(gridPiece);
}
//* checkInt() sets the bounds for input. The method controls and makes sure that the same grid position that has already been played cannot be selected again as well as makes sure the inputed value is an integer between 1 and 9.*//
public void checkInt(Scanner keyboard, int charCode){

int gridPosition = 100;

boolean invalidInput = true;

while(invalidInput)
{
while(!keyboard.hasNextInt()) {
System.out.println("You entered a non-integer or out of bounds value -- try again");
keyboard.next();
}

gridPosition = keyboard.nextInt();

if ( gridPosition < 1 || gridPosition > 9 ) {
System.out.println("You entered a non-integer or out of bounds value -- try again");
continue;
}
else
invalidInput = false;
}

boolean foundPosition = false;

for ( int i = 0; i < gameArray.length; i++) {
for (int j = 0; j < gameArray[i].length; j++) {
if (gameArray[i][j] == gridPosition){
gameArray[i][j] = charCode;
foundPosition = true;
}
}
}

if (!foundPosition) {
System.out.println("Position taken -- try again");
checkInt(keyboard, charCode);

}

}

//* gameOver() sets conditions for the end of the game. Once the condition has been met the method will notify the player of the outcome and end the program.*//
boolean gameOver() {

if(gameArray[0][0] == 10 && gameArray[0][1] == 10 && gameArray[0][2] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[1][0] == 10 && gameArray[1][1] == 10 && gameArray[1][2] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[2][0] == 10 && gameArray[2][1] == 10 && gameArray[2][2] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[0][0] == 10 && gameArray[1][0] == 10 && gameArray[2][0] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[0][0] == 10 && gameArray[0][1] == 10 && gameArray[0][2] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[0][1] == 10 && gameArray[1][1] == 10 && gameArray[2][1] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[0][2] == 10 && gameArray[1][2] == 10 && gameArray[2][2] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[0][0] == 10 && gameArray[1][1] == 10 && gameArray[2][2] == 10){
System.out.println("Congratulations Player X! You Win!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[0][1] == 11 && gameArray[0][2] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}
else if(gameArray[1][0] == 11 && gameArray[1][1] == 11 && gameArray[1][2] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}
else if(gameArray[2][0] == 11 && gameArray[2][1] == 11 && gameArray[2][2] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[1][0] == 11 && gameArray[2][0] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[0][1] == 11 && gameArray[0][2] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}
else if(gameArray[0][1] == 11 && gameArray[1][1] == 11 && gameArray[2][1] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}
else if(gameArray[0][2] == 11 && gameArray[1][2] == 11 && gameArray[2][2] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[1][1] == 11 && gameArray[2][2] == 11){
System.out.println("Congratulations Player O! You Win!");
return false;
}

if(gameArray[0][0] > 9 && gameArray[0][1] > 9 && gameArray[0][2] > 9 && gameArray[1][0] > 9 && gameArray[1][1] > 9 && gameArray[1][2] >9 && gameArray[2][0] > 9 && gameArray[2][1] > 9 && gameArray[2][2] >9){
 System.out.println("The game is a draw.");
 return false;
}
  

return true;

}
}