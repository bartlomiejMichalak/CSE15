/*
 * CSE 15
 * Bartlomiej "Bart" Michalak
 * bpm215
 * Class Description: Create a tic tac toe game
 * Program #5     
 * DEADLINE: December 7, 2011
 */
package p5;
import java.util.Scanner;
public class P5{

/* 
 * gameArray is the board that gets printed out after every move. Should be
 * noted that this is only the board and changes during game are not made in 
 * within its lines. 
 */

    int[][] gameArray = {{1,4,7},
{2,5,8},
{3,6,9}};

public static void main(String[] args) {
P5 game = new P5();
game.runGame();
}

/* 
 * This method controls the game itself and is called through the main. The 
 * Scanner is initialized within this method as well and the loop through which 
 * I have chosen to run the game.
 */

void runGame(){
Scanner keyboard = new Scanner (System.in);

boolean gameOver = true;

/* 
 * This while loop controls when the game runs. Once the the loop can be exited 
 * the game automatically ends and the method "gameOver" is called.
 */

int x = 0;
int humanPlayer = 10;
int computerPlayer = 11;
char humanPlayerToken = ' ';
char computerPlayerToken = ' ';
int activePlayer = 0;
int inactivePlayer = 0;

boolean flipForPlayer = true;

/* 
 * This is the flip mechanism. It is placed outside the do-while loop
 * in order to make sure that it is only run in the begginning of the game
 * it assigns player tokens for both the AI and the human player as well
 * as determines initial order.
 */

     System.out.println("Press enter to flip coin and choose order; Heads = X, Tails = O");
        keyboard.nextLine();
        double flip = Math.random();
        if(flip > .5){
            humanPlayerToken = 'X';
            computerPlayerToken = 'O';
            humanPlayer = 10;
            computerPlayer = 11;
            System.out.println("Heads! You are Player " + humanPlayerToken);
        }
        else {
            humanPlayerToken = 'O';
            computerPlayerToken = 'X';
            humanPlayer = 11;
            computerPlayer = 10;
            System.out.println("Tails! You are Player " + humanPlayerToken);
        }
        
        if (flip <= .5){
            System.out.println("Player " + humanPlayerToken + " goes first. The computer is " + computerPlayerToken + ".");
            activePlayer = humanPlayer;
            inactivePlayer = computerPlayer;
        }
        else{
            System.out.println("Player " + computerPlayerToken + " goes first. The computer is " + computerPlayerToken + ".");
            activePlayer = computerPlayer;
            inactivePlayer = humanPlayer;
        }
  

do{

  printgameArray();

if(activePlayer == computerPlayer){
    
    aiMove(computerPlayer);
    activePlayer = humanPlayer;
}
else{
    System.out.println("Enter the number (1-9) to where your token will be entered");
checkInt(keyboard, humanPlayer);
activePlayer = computerPlayer;
}

gameOver = gameOver();

if (!gameOver)
continue;

}while(gameOver);
printgameArray();
}

/* printgameArray() prints the gameArray and creates the baord the player visually 
 * interacts with. Method checkGridPiece() recieves the array and later chages the 
 * the contents of drid piece in play and changes it accordingly.
 */
void printgameArray() {
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
/* checkInt() sets the bounds for input. The method controls and makes sure that 
 * the same grid position that has already been played cannot be selected again 
 * as well as makes sure the inputed value is an integer between 1 and 9. This
 * only applies to the human player and only their scanner and charCode go in.
 */
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

/* gameOver() sets conditions for the end of the game. Once the condition has
 * been met the method will notify the player of the outcome and end the program.
 */
boolean gameOver() {

if(gameArray[0][0] == 10 && gameArray[0][1] == 10 && gameArray[0][2] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[1][0] == 10 && gameArray[1][1] == 10 && gameArray[1][2] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[2][0] == 10 && gameArray[2][1] == 10 && gameArray[2][2] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[0][0] == 10 && gameArray[1][0] == 10 && gameArray[2][0] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[0][0] == 10 && gameArray[0][1] == 10 && gameArray[0][2] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[0][1] == 10 && gameArray[1][1] == 10 && gameArray[2][1] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[0][2] == 10 && gameArray[1][2] == 10 && gameArray[2][2] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[0][0] == 10 && gameArray[1][1] == 10 && gameArray[2][2] == 10){
System.out.println("Player X Wins!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[0][1] == 11 && gameArray[0][2] == 11){
System.out.println("Player O Wins!");
return false;
}
else if(gameArray[1][0] == 11 && gameArray[1][1] == 11 && gameArray[1][2] == 11){
System.out.println("Player O Wins!");
return false;
}
else if(gameArray[2][0] == 11 && gameArray[2][1] == 11 && gameArray[2][2] == 11){
System.out.println("Player O Wins!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[1][0] == 11 && gameArray[2][0] == 11){
System.out.println("Player O Wins!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[0][1] == 11 && gameArray[0][2] == 11){
System.out.println("Player O Wins!");
return false;
}
else if(gameArray[0][1] == 11 && gameArray[1][1] == 11 && gameArray[2][1] == 11){
System.out.println("Player O Wins!");
return false;
}
else if(gameArray[0][2] == 11 && gameArray[1][2] == 11 && gameArray[2][2] == 11){
System.out.println("Player O Wins!");
return false;
}
else if(gameArray[0][0] == 11 && gameArray[1][1] == 11 && gameArray[2][2] == 11){
System.out.println("Player O Wins!");
return false;
}

if(gameArray[0][0] > 9 && gameArray[0][1] > 9 && gameArray[0][2] > 9 && gameArray[1][0] > 9 && gameArray[1][1] > 9 && gameArray[1][2] >9 && gameArray[2][0] > 9 && gameArray[2][1] > 9 && gameArray[2][2] >9){
 System.out.println("The game is a draw.");
 return false;
}
  

return true;

}

/*
 * The method aiMove() sets the computers moves and future strategies.
 * Block() returns a boolean value which allows the method to control which is
 * executed first or even executed at all.
 */

    public void aiMove(int computerPlayer) {
        if (!block(computerPlayer)) {
        
            futureWin(computerPlayer);
        }
        
    }
    /*
     * block() is the AI's priority as it blocks the player prior to completing
     * three tokens in a row (winning) as well as tells it to complete its own 
     * row of three in order to allow it to win if possible. The method is a
     * boolean and returns a true if the method has caused the AI to make a move
     * or a false if it did not causing furtureWin() to run. int computerPlayer is
     * passed it so that the gameArray can be filled with the AI's token
     * which of course varries depending on the flip made during
     * the first stage of the game.
     */
    public boolean block(int computerPlayer){
      if (gameArray[0][0] == gameArray[0][2] && gameArray[0][0] < 10){
            gameArray[0][1] = computerPlayer;
            return true;
        }
       else if (gameArray[0][1] == gameArray[0][2] && gameArray[0][0] < 10){
            gameArray[0][0] = computerPlayer;
            return true;
        }
       else if (gameArray[1][0] == gameArray[1][1] && gameArray[1][2] < 10){
            gameArray[1][2] = computerPlayer;
            return true;
        }
       else if (gameArray[1][0] == gameArray[1][2] && gameArray[1][1] < 10){
            gameArray[1][1] = computerPlayer;
            return true;
            
        }
       else if (gameArray[1][1] == gameArray[1][2] && gameArray[1][0] < 10){
            gameArray[1][0] = computerPlayer;
            return true;
        }
       else if (gameArray[2][0] == gameArray[2][1] && gameArray[2][2] < 10){
            gameArray[2][2] = computerPlayer;
            return true;
            
        }
       else if (gameArray[2][0] == gameArray[2][2] && gameArray[2][1] < 10){
            gameArray[2][1] = computerPlayer;
            return true;
            
        }
       else if (gameArray[2][1] == gameArray[2][2] && gameArray[2][0] < 10){
            gameArray[2][0] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][0] == gameArray[1][0] && gameArray[2][0] < 10){
            gameArray[2][0] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][0] == gameArray[2][0] && gameArray[1][0] < 10){
            gameArray[1][0] = computerPlayer;
            return true;
            
        }
       else if (gameArray[1][0] == gameArray[2][0] && gameArray[0][0] < 10){
            gameArray[0][0] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][1] == gameArray[1][1] && gameArray[2][1] < 10){
            gameArray[2][1] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][1] == gameArray[2][1] && gameArray[1][1] < 10){
            gameArray[1][1] = computerPlayer;
            return true;
            
        }
       else if (gameArray[1][1] == gameArray[2][1] && gameArray[0][1] < 10){
            gameArray[0][1] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][2] == gameArray[1][2] && gameArray[2][2] < 10){
            gameArray[2][2] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][2] == gameArray[2][2] && gameArray[1][2] < 10){
            gameArray[1][2] = computerPlayer;
            return true;
            
        }
       else if (gameArray[1][2] == gameArray[2][2] && gameArray[0][2] < 10){
            gameArray[0][2] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][0] == gameArray[1][1] && gameArray[2][2] < 10){
            gameArray[2][2] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][0] == gameArray[2][2] && gameArray[1][1] < 10){
            gameArray[1][1] = computerPlayer;
            return true;
            
        }
       else if (gameArray[1][1] == gameArray[2][2] && gameArray[0][0] < 10){
            gameArray[0][0] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][2] == gameArray[1][1] && gameArray[2][0] < 10){
            gameArray[2][0] = computerPlayer;
            return true;
            
        }
       else if (gameArray[0][2] == gameArray[2][0] && gameArray[1][1] < 10){
            gameArray[1][1] = computerPlayer;
            return true;
            
        }
       else if (gameArray[2][0] == gameArray[1][1] && gameArray[0][2] < 10){
            gameArray[0][2] = computerPlayer;
            return true;
            }
       else
        return false;    
    }
    /*
     * futureWin() is a backup for the AI. If the AI cannot make a winning move
     * or it cannot block the player from winning it places a random piece on the
     * grid. int computerPlayer is passed it so that the gameArray can be filled with 
     * the AI's token which of course varries depending on the flip made during
     * the first stage of the game.
     */
        public void futureWin(int computerPlayer){
            if(gameArray[0][0] < 10)
                gameArray[0][0] = computerPlayer;
            
            else if(gameArray[0][1] < 10)
                gameArray[0][1] = computerPlayer;
                
            else if(gameArray[0][2] < 10)
                gameArray[0][2] = computerPlayer;
            
            else if(gameArray[1][0] < 10)
                gameArray[1][0] = computerPlayer;
            
            else if(gameArray[1][1] < 10)
                gameArray[1][1] = computerPlayer;
            
            else if(gameArray[1][2] < 10)
                gameArray[1][2] = computerPlayer;
            
            else if(gameArray[2][0] < 10)
                gameArray[2][0] = computerPlayer;
            
            else if(gameArray[2][1] < 10)
                gameArray[2][1] = computerPlayer;
            
            else if(gameArray[2][2] < 10)
                gameArray[2][2] = computerPlayer;
            
            else
                System.out.println("");
        }
        
        }