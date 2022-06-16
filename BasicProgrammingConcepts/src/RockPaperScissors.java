import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame(){
        System.out.println("In the playgame");
        int round = 1;
        int userWins =0;
        int compWins = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many rounds do you want to play?");
        int numRounds = scan.nextInt();

        System.out.println("Number: "+numRounds);

        if(numRounds>=1 && numRounds<=10){
            for(int i=1;i<=numRounds;i++) {

                System.out.println("What would you like to choose, Rock(1), Paper(2) or Scissors(3)?");
                int choice = scan.nextInt();
                System.out.println("Player chooses " + choice);

                Random randNum = new Random();
                int compNum = randNum.nextInt(3) + 1;    //random num between 1 and 3
                System.out.println("Computer chooses " + compNum);

                if(choice == 1 & compNum == 2){
                    compWins++;
                }
                else if(choice == 1 & compNum == 3){
                    userWins++;
                }
                else if(choice == 2 & compNum == 1){
                    userWins++;
                }
                else if(choice ==2 && compNum == 3){
                    compWins++;
                }
                else if(choice ==3 && compNum == 1){
                    compWins++;
                }
                else if(choice ==3 && compNum == 2){
                    userWins++;
                }

                round++;
            }

            System.out.println("User wins: "+userWins);
            System.out.println("Computer wins: "+compWins);
            System.out.println("Number of ties: "+(numRounds-userWins-compWins));
        }
        else{
            System.out.println("This number of rounds is not allowed!");
        }

        System.out.println("Would you like to play again? 1 for yes and 0 for no");
        int playAgain = scan.nextInt();

        if(playAgain == 1){
            System.out.println("How many rounds do you want to play?");
            numRounds = scan.nextInt();
            playGame();
        }
        else{
            System.out.println("Thanks for playing!");
        }
    }
}
