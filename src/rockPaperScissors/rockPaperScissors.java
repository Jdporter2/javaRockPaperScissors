package rockPaperScissors;
import java.util.Scanner;

public class rockPaperScissors {
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int player = 5;
		
		while(true) {
			System.out.println("Type in rock, paper, scissors, or quit: ");
			
			String userMove = user.nextLine();
			
			if(userMove.equals("quit")) {
				break;
			}
			
			if(userMove.equals("rock")) {
				player = 0;
			}
			else if(userMove.equals("paper")) {
				player = 1;
			}
			else if(userMove.equals("scissors")) {
				player = 2;
			}
			else {
				System.out.println("Not a valid input.");
				break;
			}
			
			int rnum = (int)(Math.random()*3);
			
			if(rnum == player) {
				System.out.println("Draw");
			}
			else if((rnum == 0) && (player == 1)) {
				System.out.println("Computer chose rock.");
				System.out.println("You chose paper.");
				System.out.println("You win!");
			}
			else if((rnum == 1) && (player == 2)) {
				System.out.println("Computer chose paper.");
				System.out.println("You chose scissors.");
				System.out.println("You win!");
			}
			else if((rnum == 2) && (player == 0)) {
				System.out.println("Computer chose scissors.");
				System.out.println("You chose rock.");
				System.out.println("You win!");
			}
			else if((rnum == 0) && (player == 2)) {
				System.out.println("Computer chose rock.");
				System.out.println("You chose scissors.");
				System.out.println("You lose :(");
			}
			else if((rnum == 2) && (player == 1)) {
				System.out.println("Computer chose scissors.");
				System.out.println("You chose paper.");
				System.out.println("You lose :(");
			}
			else if((rnum == 1) && (player == 0)) {
				System.out.println("Computer chose paper.");
				System.out.println("You chose rock.");
				System.out.println("You lose :(");
			}
		}
		
	}
}
