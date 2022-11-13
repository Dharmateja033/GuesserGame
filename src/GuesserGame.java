import java.util.Scanner;

class Guesser {
	int guessNum;
	int hint;

	public int guessing() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hey Guesser! Guess a even whole number below 20");
		guessNum = sc.nextInt();

		while (guessNum >= 20) {
			System.out.println("Invalid! Number should be below 20.Guesser please Guess again!");
			guessNum = sc.nextInt();
		}
		System.out.println("----------------------------------------------------------");
		return guessNum;
	}

	public int hinting() {
		hint = guessNum;
		return hint;
	}

}

class Player1 {
	int player1Num;
	String choice;
	String input = "Yes";
	int hintNum;

	public int guessing() {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Player1 ! Guess a  whole number below 20");
		System.out.println();
		System.out.println("Enter 'Yes' if you need a hint or 'No' to continue");
		choice = sc.nextLine();

		if (choice.equalsIgnoreCase(input)) {

			if (hintNum % 2 == 0) {

				System.out.println("Hint ==> Guesser Number is a even Number");
				System.out.println();
			} else if (hintNum % 2 != 0) {

				System.out.println("Hint ==> Guesser Number is a odd Number");
				System.out.println();
			}
		}

		System.out.println("Player1 ! Now guess the number");
		player1Num = sc.nextInt();
		while (player1Num >= 20) {

			System.out.println("Invalid! Number should be below 20.Player1 please Guess again!");
			player1Num = sc.nextInt();
		}
		System.out.println("----------------------------------------------------------");
		return player1Num;

	}
}

class Player2 {

	int player2Num;
	String choice;
	String input = "Yes";
	int hintNum;

	public int guessing() {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Player2 ! Guess a  whole number below 20");
		System.out.println();
		System.out.println("Enter 'Yes' if you need a hint or 'No' to continue");
		choice = sc.nextLine();

		if (choice.equalsIgnoreCase(input)) {

			if (hintNum % 2 == 0) {

				System.out.println("Hint ==> Guesser Number is a even Number");
				System.out.println();
			} else if (hintNum % 2 != 0) {

				System.out.println("Hint ==> Guesser Number is a odd Number");
				System.out.println();
			}
		}

		System.out.println("Player2 ! Now guess the number");
		player2Num = sc.nextInt();
		while (player2Num >= 20) {

			System.out.println("Invalid! Number should be below 20.Player2 please Guess again!");
			player2Num = sc.nextInt();
		}
		System.out.println("----------------------------------------------------------");
		return player2Num;

	}
}

class Player3 {

	int player3Num;
	String choice;
	String input = "Yes";
	int hintNum;

	public int guessing() {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Player3 ! Guess a  whole number below 20");
		System.out.println();
		System.out.println("Enter 'Yes' if you need a hint or 'No' to continue");
		choice = sc.nextLine();

		if (choice.equalsIgnoreCase(input)) {

			if (hintNum % 2 == 0) {

				System.out.println("Hint ==> Guesser Number is a even Number");
				System.out.println();
			} else if (hintNum % 2 != 0) {

				System.out.println("Hint ==> Guesser Number is a odd Number");
				System.out.println();
			}
		}

		System.out.println("Player3 ! Now guess the number");
		player3Num = sc.nextInt();
		while (player3Num >= 20) {

			System.out.println("Invalid! Number should be below 20.Player3 please Guess again!");
			player3Num = sc.nextInt();
		}
		System.out.println("----------------------------------------------------------");
		return player3Num;

	}
}

class Player4 {
	int player4Num;
	String choice;
	String input = "Yes";
	int hintNum;

	public int guessing() {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Player4 ! Guess a  whole number below 20");
		System.out.println();
		System.out.println("Enter 'Yes' if you need a hint or 'No' to continue");
		choice = sc.nextLine();

		if (choice.equalsIgnoreCase(input)) {

			if (hintNum % 2 == 0) {

				System.out.println("Hint ==> Guesser Number is a even Number");
				System.out.println();
			} else if (hintNum % 2 != 0) {

				System.out.println("Hint ==> Guesser Number is a odd Number");
				System.out.println();
			}
		}

		System.out.println("Player4 ! Now guess the number");
		player4Num = sc.nextInt();
		while (player4Num >= 20) {

			System.out.println("Invalid! Number should be below 20.Player4 please Guess again!");
			player4Num = sc.nextInt();
		}
		System.out.println("----------------------------------------------------------");
		return player4Num;

	}
}

class Rank {

	int rP1, rP2, rP3, rP4;
	String choice;
	String input = "Yes";

	public void ranking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'Yes'  to see Final LeaderBoard");
		choice = sc.nextLine();
		if (choice.equalsIgnoreCase(input)) {
			System.out.println();
			System.out.println("          -------------------          ");
			System.out.println("         | Final LeaderBoard |          ");
			System.out.println("          -------------------          ");
			System.out.println();
			System.out.println("    Players                   Rank    ");
			System.out.println("=======================================");
			System.out.println("    Player1                    " + rP1);
			System.out.println();
			System.out.println("    Player2                    " + rP2);
			System.out.println();
			System.out.println("    Player3                    " + rP3);
			System.out.println();
			System.out.println("    Player4                    " + rP4);
		} else
			System.out.println("Play Next Game!");

	}

}

class GameOverview {

	String o1 = "Not Reached";
	String o2 = "Not Reached";
	String o3 = "Not Reached";
	String choice;
	String input = "Yes";

	public void overview() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'Yes'  to see Game Overview");
		choice = sc.nextLine();

		if (choice.equalsIgnoreCase(input)) {
			System.out.println();
			System.out.println("                         GameOverview");
			System.out.println("                         ------------");
			System.out.println();
			System.out.println("QuarterFinal  -->   " + o1);
			System.out.println();
			System.out.println("SemiFinal     -->   " + o2);
			System.out.println();
			System.out.println("Final         -->   " + o3);

		} else
			System.out.println("Play Next Game!");
	}
}

class Umpire {
	int guesserNumber;
	int player1Number;
	int player2Number;
	int player3Number;
	int player4Number;
	int r;

	public void readingGuesserChoice() {
		Guesser g = new Guesser();
		guesserNumber = g.guessing();
	}

	public void rankingPlayers() {
		Rank r = new Rank();
		r.ranking();
	}

	public void readingPlayersChoice() {

		Player1 P1 = new Player1();
		P1.hintNum = guesserNumber;

		Player2 P2 = new Player2();
		P2.hintNum = guesserNumber;

		Player3 P3 = new Player3();
		P3.hintNum = guesserNumber;

		Player4 P4 = new Player4();
		P4.hintNum = guesserNumber;

		player1Number = P1.guessing();
//			System.out.println("----------------------------------------------------------");
		player2Number = P2.guessing();
//			System.out.println("----------------------------------------------------------");
		player3Number = P3.guessing();
//			System.out.println("----------------------------------------------------------");
		player4Number = P4.guessing();
	}

	void matching() {
		Guesser g = new Guesser();
		Player1 P1 = new Player1();
		Player2 P2 = new Player2();
		Player3 P3 = new Player3();
		Player4 P4 = new Player4();
		Rank r = new Rank();
		GameOverview go = new GameOverview();

		if (guesserNumber == player1Number)// 1M
		{
			if (guesserNumber == player2Number && guesserNumber == player3Number && guesserNumber == player4Number)// 1234
			{
				System.out.println("Match Tied! All the Players Guessed correctly.Play next game. ");
				r.rP1 = 1;
				r.rP2 = 1;
				r.rP3 = 1;
				r.rP4 = 1;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Match Drawn!";

			} else if (guesserNumber == player2Number && guesserNumber == player3Number) // 123
			{
				System.out.println("Players 1,2,3 Guessed correctly.You play again with the Guesser!");
				System.out.println();
				r.rP4 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Player4 Out of the Game!!";

				guesserNumber = g.guessing();

				player1Number = P1.guessing();
				player2Number = P2.guessing();
				player3Number = P3.guessing();

				if (guesserNumber == player1Number && guesserNumber == player2Number && guesserNumber == player3Number)// 123
				{
					System.out.println("All the guesses matched again.Players 1,2,3 won the game!");
					System.out.println();
					r.rP1 = 1;
					r.rP2 = 1;
					r.rP3 = 1;
					go.o2 = "Player1 vs Player2 vs Player3             -->   Game tied in this round!";

				} else if (guesserNumber == player1Number && guesserNumber == player2Number)// 12s
				{
					System.out.println("Players 1 and 2 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					r.rP3 = 3;
					go.o2 = "Player1 vs Player2 vs Player3             -->   Player3 Out of the Game!";

					guesserNumber = g.guessing();

					player1Number = P1.guessing();
					player2Number = P2.guessing();

					if (guesserNumber == player1Number && guesserNumber == player2Number)// 12s
					{
						System.out.println("All the guesses matched again.Players 1,2 won the game!");
						System.out.println();
						r.rP1 = 1;
						r.rP2 = 1;
						go.o3 = "Player1 vs Player2                         -->   Match tied in this round!";
					}

					else if (guesserNumber == player1Number) {
						System.out.println("yeh! Player1 won the Game");
						r.rP1 = 1;
						r.rP2 = 2;
						go.o3 = "Player1 vs Player2                         -->   Player2 Out of the Game!";

					} else if (guesserNumber == player2Number) {
						System.out.println("yeh! Player2 won the Game");
						r.rP1 = 2;
						r.rP2 = 1;
						go.o3 = "Player1 vs Player2                        -->   Player1 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP1 = 1;
						r.rP2 = 1;
						go.o3 = "Player1 vs Player2                        -->   Player1 and Player2 Out of the Game!";
					}

				}

				else if (guesserNumber == player1Number && guesserNumber == player3Number)// 13s
				{
					System.out.println("Players 1 and 3 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					r.rP2 = 3;
					go.o2 = "Player1 vs Player2 vs Player3             -->   Player2 Out of the Game!";

					guesserNumber = g.guessing();

					player1Number = P1.guessing();
					player3Number = P3.guessing();

					if (guesserNumber == player1Number && guesserNumber == player3Number)// 13s
					{
						System.out.println("All the guesses matched again.Players 1,3 won the game!");
						r.rP1 = 1;
						r.rP3 = 1;
						go.o3 = "Player1 vs Player3                        -->   Match tied in this round";
					}

					else if (guesserNumber == player1Number) {
						System.out.println("yeh! Player1 won the Game");
						r.rP1 = 1;
						r.rP3 = 2;
						go.o3 = "Player1 vs Player3                        -->   Player3 Out of the Game";
					} else if (guesserNumber == player3Number) {
						System.out.println("yeh! Player3 won the Game");
						r.rP1 = 2;
						r.rP3 = 1;
						go.o3 = "Player1 vs Player3                        -->   Player1 Out of the Game";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP1 = 2;
						r.rP3 = 2;
						go.o3 = "Player1 vs Player3                        -->   Player1 and Player3 Out of the Game!";
					}
				}

				else if (guesserNumber == player2Number && guesserNumber == player3Number)// 23s
				{
					System.out.println("Players 2 and 3 Guessed correctly.You play again with the Guesser!");
					r.rP1 = 3;
					System.out.println();
					go.o2 = "Player1 vs Player2 vs Player3             -->   Player1 Out of the Game!";

					guesserNumber = g.guessing();

					player2Number = P2.guessing();
					player3Number = P3.guessing();

					if (guesserNumber == player2Number && guesserNumber == player3Number)// 23s
					{
						System.out.println("All the guesses matched again.Players 2 and 3 won the game!");

						r.rP2 = 1;
						r.rP3 = 1;
						go.o3 = "Player2 vs Player3                        -->   Match tied in this round";
					}

					else if (guesserNumber == player2Number) {
						System.out.println("yeh! Player2 won the Game");
						r.rP2 = 1;
						r.rP3 = 2;
						go.o3 = "Player2 vs Player3                        -->   Player3 Out of the Game!";
					} else if (guesserNumber == player3Number) {
						System.out.println("yeh! Player3 won the Game");
						r.rP2 = 2;
						r.rP3 = 1;
						go.o3 = "Player2 vs Player3                        -->   Player2 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP2 = 1;
						r.rP3 = 1;
						go.o3 = "Player2 vs Player3                        -->   Player2 and Player3 Out of the Game!";
					}
				}

				else if (guesserNumber == player1Number)// 1
				{
					System.out.println("yeh! Player1 won the Game");
					r.rP1 = 1;
					r.rP2 = 2;
					r.rP3 = 2;
					go.o2 = "Player1 vs Player2 vs Player3             -->   Player2 and Player3 Out of the Game!";

				}

				else if (guesserNumber == player2Number)// 2
				{
					System.out.println("yeh! Player2 won the Game");
					r.rP1 = 2;
					r.rP2 = 1;
					r.rP3 = 2;
					go.o2 = "Player1 vs Player2 vs Player3             -->   Player1 and Player3 Out of the Game!";
				} else if (guesserNumber == player3Number)// 3
				{
					System.out.println("yeh! Player3 won the Game");
					r.rP1 = 2;
					r.rP2 = 2;
					r.rP3 = 1;
					go.o2 = "Player1 vs Player2 vs Player3             -->   Player1 and Player2 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game"); // N
					r.rP1 = 2;
					r.rP2 = 2;
					r.rP3 = 2;
					go.o2 = "Player 1 vs Player2 vs Player3            -->   Players 1,2,3 Out of the Game!";
				}

			}

			else if (guesserNumber == player2Number && guesserNumber == player4Number) // 124
			{
				System.out.println("Players 1,2,4 Guessed correctly.You play again with the Guesser!");
				System.out.println();
				r.rP3 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Player 3 Out of the Game!";

				guesserNumber = g.guessing();

				player1Number = P1.guessing();
				player2Number = P2.guessing();
				player4Number = P4.guessing();

				if (guesserNumber == player1Number && guesserNumber == player2Number && guesserNumber == player4Number)// 124
				{
					System.out.println("All the guesses matched again.Players 1,2,4 won the game!");
					r.rP1 = 1;
					r.rP2 = 1;
					r.rP4 = 1;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Match tied in this round";
				} else if (guesserNumber == player1Number && guesserNumber == player2Number)// 12s
				{
					System.out.println("Players 1 and 2 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					r.rP4 = 3;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Player 4 Out of the Game!";

					guesserNumber = g.guessing();

					player1Number = P1.guessing();
					player2Number = P2.guessing();

					if (guesserNumber == player1Number && guesserNumber == player2Number)// 12s
					{
						System.out.println("All the guesses matched again.Players 1 and 2 won the game!");
						r.rP1 = 1;
						r.rP2 = 1;
						go.o3 = "Player1 vs Player2                        -->   Match tied in this round";

					}

					else if (guesserNumber == player1Number) {
						System.out.println("yeh! Player1 won the Game");
						r.rP1 = 1;
						r.rP2 = 2;
						r.rP4 = 2;
						go.o3 = "Player1 vs Player2                        -->   Player2 Out of the Game!";
					} else if (guesserNumber == player2Number) {
						System.out.println("yeh! Player2 won the Game");
						r.rP1 = 2;
						r.rP2 = 1;
						r.rP3 = 2;
						go.o3 = "Player1 vs Player2                        -->   Player1 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP1 = 2;
						r.rP2 = 2;
						r.rP3 = 2;
						go.o3 = "Player1 vs Player2                       -->   Player1 and Player2 Out of the Game!";
					}
				}

				else if (guesserNumber == player1Number && guesserNumber == player4Number)// 14s
				{
					System.out.println("Players 1 and 4 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					r.rP2 = 3;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Player2 Out of the Game!";

					guesserNumber = g.guessing();

					player1Number = P1.guessing();
					player4Number = P4.guessing();

					if (guesserNumber == player1Number && guesserNumber == player4Number)// 14s
					{
						System.out.println("All the guesses matched again.Players 1 and 4 won the game!");
						r.rP1 = 1;
						r.rP4 = 1;
						go.o3 = "Player1 vs Player4                        -->   Match tied in this round!";
					}

					else if (guesserNumber == player1Number) {
						System.out.println("yeh! Player1 won the Game");
						r.rP1 = 1;
						r.rP4 = 2;
						go.o3 = "Player1 vs Player4                        -->   Player4 Out of the Game!";
					} else if (guesserNumber == player4Number) {
						System.out.println("yeh! Player4 won the Game");
						r.rP1 = 2;
						r.rP4 = 1;
						go.o3 = "Player1 vs Player4                        -->   Player1 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP1 = 2;
						r.rP4 = 2;
						go.o3 = "Player1 vs Player4                        -->   Player1 and Player4 Out of the Game!";
					}
				}

				else if (guesserNumber == player2Number && guesserNumber == player4Number)// 24s
				{
					System.out.println("Players 2 and 4 Guessed correctly.You play again with the Guesser!");
					r.rP1 = 3;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Player1 Out of the Game!";

					guesserNumber = g.guessing();

					player2Number = P2.guessing();
					player4Number = P4.guessing();

					if (guesserNumber == player2Number && guesserNumber == player4Number)// 24s
					{
						System.out.println("All the guesses matched again.Players 2 and 4 won the game!");
						r.rP2 = 1;
						r.rP4 = 1;
						go.o3 = "Player2 vs Player4                        -->   Game tied in this round";
					}

					else if (guesserNumber == player2Number) {
						System.out.println("yeh! Player2 won the Game");
						r.rP2 = 1;
						r.rP4 = 2;
						go.o3 = "Player2 vs Player4                        -->   Player4 Out of the Game!";
					} else if (guesserNumber == player4Number) {
						System.out.println("yeh! Player4 won the Game");
						r.rP2 = 2;
						r.rP4 = 1;
						go.o3 = "Player2 vs Player4                        -->   Player2 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP2 = 2;
						r.rP4 = 2;
						go.o3 = "Player2 vs Player4                       -->   Player2 and Player4 Out of the Game!";
					}
				}

				else if (guesserNumber == player1Number)// 1
				{
					System.out.println("yeh! Player1 won the Game");
					r.rP1 = 1;
					r.rP2 = 2;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Player2 and player4 Out of the Game!";

				}

				else if (guesserNumber == player2Number)// 2
				{
					System.out.println("yeh! Player2 won the Game");
					r.rP1 = 2;
					r.rP2 = 1;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Player1 and player4 Out of the Game!";
				} else if (guesserNumber == player4Number)// 4
				{
					System.out.println("yeh! Player4 won the Game");
					r.rP1 = 2;
					r.rP2 = 2;
					r.rP4 = 1;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Player1 and player2 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game"); // N
					r.rP1 = 2;
					r.rP2 = 2;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player2 vs Player4             -->   Players 1,2,4 Out of the Game!";
				}

			}

			else if (guesserNumber == player3Number && guesserNumber == player4Number) // 134
			{
				System.out.println("Players 1,3,4 Guessed correctly.You play again with the Guesser!");
				System.out.println();

				r.rP2 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->    Player 2 Out of the Game!";
				guesserNumber = g.guessing();

				player1Number = P1.guessing();
				player3Number = P3.guessing();
				player4Number = P4.guessing();

				if (guesserNumber == player1Number && guesserNumber == player3Number && guesserNumber == player4Number)// 134
				{
					System.out.println("All the guesses matched again.Players 1,3,4 won the game!");
					r.rP1 = 1;
					r.rP3 = 1;
					r.rP4 = 1;
					go.o2 = "Player1 vs Player3 vs Player4             -->    Game tied in this round!";

				} else if (guesserNumber == player1Number && guesserNumber == player3Number)// 13s
				{
					System.out.println("Players 1 and 3 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					r.rP4 = 3;
					go.o2 = "Player1 vs Player3 vs Player4             -->    Player4 Out of the Game";

					guesserNumber = g.guessing();

					player1Number = P1.guessing();
					player3Number = P3.guessing();

					if (guesserNumber == player1Number && guesserNumber == player3Number)// 13s
					{
						System.out.println("All the guesses matched again.Players 1 and 3 won the game!");

						r.rP1 = 1;
						r.rP3 = 1;
						go.o3 = "Player1 vs Player3                        -->    Game tied in this round!";
					}

					else if (guesserNumber == player1Number) {
						System.out.println("yeh! Player1 won the Game");
						r.rP1 = 1;
						r.rP3 = 2;
						go.o3 = "Player1 vs Player3                        -->    Player3 Out of the Game!";
					} else if (guesserNumber == player3Number) {
						System.out.println("yeh! Player3 won the Game");
						r.rP1 = 2;
						r.rP3 = 1;
						go.o3 = "Player1 vs Player3                        -->    Player1 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP1 = 2;
						r.rP3 = 2;
						go.o2 = "Player1 vs Player3                        -->    Player1 and  Player3 Out of the Game!";
					}
				}

				else if (guesserNumber == player1Number && guesserNumber == player4Number)// 14s
				{
					System.out.println("Players 1 and 4 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					r.rP3 = 3;
					go.o2 = "Player1 vs Player3 vs Player4             -->    Player3 Out of the Game!";

					guesserNumber = g.guessing();

					player1Number = P1.guessing();
					player4Number = P4.guessing();

					if (guesserNumber == player1Number && guesserNumber == player4Number)// 14s
					{
						System.out.println("All the guesses matched again.Players 1 and 4 won the game!");
						r.rP1 = 1;
						r.rP4 = 1;
						go.o3 = "Player1 vs Player4                        -->    Game tied in this round!";
					}

					else if (guesserNumber == player1Number) {
						System.out.println("yeh! Player1 won the Game");
						r.rP1 = 1;
						r.rP4 = 2;
						go.o3 = "Player1 vs Player4                        -->    Player 4 Out of the Game!";
					} else if (guesserNumber == player4Number) {
						System.out.println("yeh! Player4 won the Game");
						r.rP1 = 2;
						r.rP4 = 1;
						go.o3 = "Player1 vs Player4                        -->    Player 1 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP1 = 2;
						r.rP4 = 2;
						go.o3 = "Player1 vs Player4                         -->    Player1 and Player4 Out of the Game!";
					}
				}

				else if (guesserNumber == player3Number && guesserNumber == player4Number)// 34s
				{
					System.out.println("Players 3 and 4 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					r.rP1 = 3;
					go.o2 = "Player1 vs player3 vs Player4             -->    Player 1 Out of the Game!";

					guesserNumber = g.guessing();

					player3Number = P3.guessing();
					player4Number = P4.guessing();

					if (guesserNumber == player3Number && guesserNumber == player4Number)// 34s
					{
						System.out.println("All the guesses matched again.Players 3 and 4 won the game!");
						r.rP3 = 1;
						r.rP4 = 1;
						go.o3 = "Player3 vs Player4                        -->    Game tied in this round!";
					}

					else if (guesserNumber == player3Number) {
						System.out.println("yeh! Player3 won the Game");
						r.rP3 = 1;
						r.rP4 = 2;
						go.o3 = "Player3 vs Player4                        -->    Player 4 Out of the Game!";
					} else if (guesserNumber == player4Number) {
						System.out.println("yeh! Player4 won the Game");
						r.rP3 = 2;
						r.rP4 = 1;
						go.o3 = "Player3 vs Player4                         -->    Player 3 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP3 = 2;
						r.rP4 = 2;
						go.o3 = "Player3 vs Player4                        -->    Player3 and Player 4 Out of the Game!";
					}
				}

				else if (guesserNumber == player1Number)// 1
				{
					System.out.println("yeh! Player1 won the Game");
					r.rP1 = 1;
					r.rP3 = 2;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player3 vs Player4             -->    Player3 and Player4 Out of the Game!";
				}

				else if (guesserNumber == player3Number)// 3
				{
					System.out.println("yeh! Player3 won the Game");
					r.rP1 = 2;
					r.rP3 = 1;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player3 vs Player4             -->    Player1 and Player4 Out of the Game!";
				} else if (guesserNumber == player4Number)// 4
				{
					System.out.println("yeh! Player4 won the Game");
					r.rP1 = 2;
					r.rP3 = 2;
					r.rP4 = 1;
					go.o2 = "Player1 vs Player3 vs Player4             -->    Player1 and Player3 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game"); // N
					r.rP1 = 2;
					r.rP3 = 2;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player3 vs Player4             -->    Player1,Player3 and Player4 Out of the Game!";
				}
			}

			else if (guesserNumber == player2Number) {
				System.out.println("Players 1 and 2 Guessed correctly.You play again with the Guesser!");// 12s
				System.out.println();
				r.rP3 = 4;
				r.rP4 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4   -->    Player3 and Player4 Out of the Game!";

				guesserNumber = g.guessing();

				player1Number = P1.guessing();
				player2Number = P2.guessing();

				if (guesserNumber == player1Number && guesserNumber == player2Number)// 12s
				{
					System.out.println("All the guesses matched again.Players 1 and 2 won the game!");
					r.rP1 = 1;
					r.rP2 = 1;
					go.o2 = "Player1 vs Player2                         -->    Game tied in this round!!";
				}

				else if (guesserNumber == player1Number) {
					System.out.println("yeh! Player1 won the Game");
					r.rP1 = 1;
					r.rP2 = 2;
					go.o2 = "Player1 vs Player2                         -->    Player2 Out of the Game!";
				} else if (guesserNumber == player2Number) {
					System.out.println("yeh! Player2 won the Game");
					r.rP1 = 2;
					r.rP2 = 1;
					go.o2 = "Player1 vs Player2                         -->    Player1 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game");
					r.rP1 = 2;
					r.rP2 = 2;
					go.o2 = "Player1 vs Player2                         -->    Player1 and Player2 Out of the Game!";
				}
			}

			else if (guesserNumber == player3Number)// 13s
			{
				System.out.println("Players 1 and 3 Guessed correctly.You play again with the Guesser!");
				System.out.println();
				r.rP2 = 4;
				r.rP4 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4   -->    Player2 and Player4 Out of the Game!";

				guesserNumber = g.guessing();

				player1Number = P1.guessing();
				player3Number = P3.guessing();

				if (guesserNumber == player1Number && guesserNumber == player3Number)// 13s
				{
					System.out.println("All the guesses matched again.Players 1 and 3 won the game!");
					r.rP1 = 1;
					r.rP3 = 1;
					go.o2 = "Player1 vs Player3                         -->    Game tied in this round!";
				}

				else if (guesserNumber == player1Number) {
					System.out.println("yeh! Player1 won the Game");
					r.rP1 = 1;
					r.rP3 = 2;
					go.o2 = "Player1 vs Player3                         -->    Player3 Out of the Game!";
				} else if (guesserNumber == player3Number) {
					System.out.println("yeh! Player3 won the Game");
					r.rP1 = 2;
					r.rP3 = 1;
					go.o2 = "Player1 vs Player3                         -->    Player1 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game");
					r.rP1 = 2;
					r.rP3 = 2;
					go.o2 = "Player1 vs Player3                         -->    Player1 and Player3 Out of the Game!";
				}
			}

			else if (guesserNumber == player4Number)// 14s
			{
				System.out.println("Players 1 and 4 Guessed correctly.You play again with the Guesser!");
				System.out.println();
				r.rP2 = 4;
				r.rP3 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4   -->   Player2 and Player3 Out of the Game!";

				guesserNumber = g.guessing();

				player1Number = P1.guessing();
				player4Number = P4.guessing();

				if (guesserNumber == player1Number && guesserNumber == player4Number)// 14s
				{
					System.out.println("All the guesses matched again.Players 1 and 4 won the game!");
					r.rP1 = 1;
					r.rP4 = 1;
					go.o2 = "Player1 vs Player4                         -->   Game tied in this round!";
				}

				else if (guesserNumber == player1Number) {
					System.out.println("yeh! Player1 won the Game");
					r.rP1 = 1;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player4                         -->   Player4 Out of the Game!";
				} else if (guesserNumber == player4Number) {
					System.out.println("yeh! Player4 won the Game");
					r.rP1 = 2;
					r.rP4 = 1;
					go.o2 = "Player1 vs Player4                         -->   Player1 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game");
					r.rP1 = 2;
					r.rP4 = 2;
					go.o2 = "Player1 vs Player4                         -->   Player1 and Player4 Out of the Game!";
				}
			}

			else {
				System.out.println("yeh! Player1 won the Game");
				r.rP1 = 1;
				r.rP2 = 4;
				r.rP3 = 4;
				r.rP4 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4   -->   Players 1,3,4 Out of the Game!";
			}

		}

		else if (guesserNumber == player2Number)// 2M
		{
			if (guesserNumber == player3Number && guesserNumber == player4Number)// 234
			{
				r.rP1 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Player1 Out of the Game!";
				System.out.println("Players 2,3,4 Guessed correctly.You play again with the Guesser!");
				System.out.println();

				guesserNumber = g.guessing();

				player2Number = P2.guessing();
				player3Number = P3.guessing();
				player4Number = P4.guessing();

				if (guesserNumber == player2Number && guesserNumber == player3Number && guesserNumber == player4Number)// 234
				{
					System.out.println("All the guesses matched again.Players 1,3,4 won the game!");
					r.rP2 = 1;
					r.rP3 = 1;
					r.rP4 = 1;
					go.o2 = "Player2 vs Player3 vs Player4              -->   Game tied in this round!";

				}

				else if (guesserNumber == player2Number && guesserNumber == player3Number)// 23s
				{
					r.rP4 = 3;
					go.o2 = "Player2 vs Player3 vs Player4             -->   Player4 Out of the Game!";

					System.out.println("Players 2 and 3 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					guesserNumber = g.guessing();

					player2Number = P2.guessing();
					player3Number = P3.guessing();

					if (guesserNumber == player2Number && guesserNumber == player3Number)// 23s
					{
						System.out.println("All the guesses matched again.Players 2 and 3 won the game!");

						r.rP2 = 1;
						r.rP3 = 1;
						go.o3 = "Player2 vs Player3                        -->   Game tied in this round!";
					}

					else if (guesserNumber == player2Number) {
						System.out.println("yeh! Player2 won the Game");
						r.rP2 = 1;
						r.rP3 = 2;
						go.o3 = "Player2 vs Player3                        -->   Player3 Out of the Game!";
					} else if (guesserNumber == player3Number) {
						System.out.println("yeh! Player3 won the Game");
						r.rP2 = 2;
						r.rP3 = 1;
						go.o3 = "Player2 vs Player3                        -->   Player2 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP2 = 2;
						r.rP3 = 2;
						go.o2 = "Player2 vs Player3                        -->   Player2 and Player3 Out of the Game!";
					}
				}

				else if (guesserNumber == player3Number && guesserNumber == player4Number)// 34s
				{
					r.rP2 = 3;
					go.o2 = "Player2 vs Player3 vs Player4             -->   Player2 Out of the Game!";
					System.out.println("Players 3 and 4 Guessed correctly.You play again with the Guesser!");
					System.out.println();

					guesserNumber = g.guessing();

					player3Number = P3.guessing();
					player4Number = P4.guessing();

					if (guesserNumber == player3Number && guesserNumber == player4Number)// 34s
					{
						System.out.println("All the guesses matched again.Players 3 and 4 won the game!");
						r.rP3 = 1;
						r.rP4 = 1;
						go.o3 = "Player3 vs Player4                        -->   Game tied in this round!";
					}

					else if (guesserNumber == player3Number) {
						System.out.println("yeh! Player3 won the Game");
						r.rP3 = 1;
						r.rP4 = 2;
						go.o3 = "Player3 vs Player4                        -->   Player4 Out of the Game!";
					} else if (guesserNumber == player4Number) {
						System.out.println("yeh! Player4 won the Game");
						r.rP3 = 2;
						r.rP4 = 1;
						go.o3 = "Player3 vs Player4                        -->   Player3 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP3 = 2;
						r.rP4 = 2;
						go.o3 = "Player3 vs Player4                        -->   Player3 and Player4 Out of the Game!";
					}
				}

				else if (guesserNumber == player2Number && guesserNumber == player4Number)// 24s
				{
					r.rP3 = 3;
					go.o2 = "Player2 vs Player3 vs Player4             -->   Player3 Out of the Game!";

					System.out.println("Players 2 and 4 Guessed correctly.You play again with the Guesser!");
					System.out.println();
					guesserNumber = g.guessing();

					player2Number = P2.guessing();
					player4Number = P4.guessing();

					if (guesserNumber == player2Number && guesserNumber == player4Number)// 24s
					{
						System.out.println("All the guesses matched again.Players 2 and 4 won the game!");
						r.rP2 = 1;
						r.rP4 = 1;
						go.o3 = "Player2 vs Player4                        -->   Game tied in this round!";
					}

					else if (guesserNumber == player2Number) {
						System.out.println("yeh! Player2 won the Game");
						r.rP2 = 1;
						r.rP4 = 2;
						go.o3 = "Player2 vs Player4                        -->   Player4 Out of the Game!";
					} else if (guesserNumber == player4Number) {
						System.out.println("yeh! Player4 won the Game");
						r.rP2 = 2;
						r.rP4 = 1;
						go.o3 = "Player2 vs Player4                        -->   Player2 Out of the Game!";
					} else {
						System.out.println("Game lost! No Matches.Play next game");
						r.rP2 = 2;
						r.rP4 = 2;
						go.o3 = "Player2 vs Player4                        -->   Player2 and Player4 Out of the Game!";
					}
				}

				else if (guesserNumber == player2Number)// 2
				{
					System.out.println("yeh! Player2 won the Game");
					r.rP2 = 1;
					r.rP3 = 2;
					r.rP4 = 2;
					go.o2 = "Player2 vs Player3 vs Player4             -->   Player3 and Player4 Out of the Game!";
				}

				else if (guesserNumber == player3Number)// 3
				{
					System.out.println("yeh! Player3 won the Game");
					r.rP2 = 2;
					r.rP3 = 1;
					r.rP4 = 2;
					go.o2 = "Player2 vs Player3 vs Player4             -->   Player2 and Player4 Out of the Game!";
				} else if (guesserNumber == player4Number)// 4
				{
					System.out.println("yeh! Player4 won the Game");
					r.rP2 = 2;
					r.rP3 = 2;
					r.rP4 = 1;
					go.o2 = "Player2 vs Player3 vs Player4             -->   Player2 and Player3 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game"); // N
					r.rP2 = 2;
					r.rP3 = 2;
					r.rP4 = 2;
					go.o2 = "Player2 vs Player3 vs Player4             -->   Players 2,3,4 Out of the Game!";
				}
			}

			else if (guesserNumber == player3Number) {
				r.rP1 = 4;
				r.rP4 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4   -->   Player1 and Player4 Out of the Game!";

				System.out.println("Players 2 and 3 Guessed correctly.You play again with the Guesser!");// 23
				System.out.println();
				guesserNumber = g.guessing();

				player2Number = P2.guessing();
				player3Number = P3.guessing();

				if (guesserNumber == player2Number && guesserNumber == player3Number)// 23s
				{
					System.out.println("All the guesses matched again.Players 2 and 3 won the game!");
					r.rP3 = 1;
					r.rP2 = 1;
					go.o2 = "Player2 vs Player3                         -->   Game tied in this round!";
				}

				else if (guesserNumber == player2Number) {
					System.out.println("yeh! Player2 won the Game");
					r.rP3 = 2;
					r.rP2 = 1;
					go.o2 = "Player2 vs Player3                         -->   Player3 Out of the Game!";
				} else if (guesserNumber == player3Number) {
					System.out.println("yeh! Player3 won the Game");
					r.rP3 = 1;
					r.rP2 = 2;
					go.o2 = "Player2 vs Player3                         -->   Player2 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game");
					r.rP3 = 2;
					r.rP2 = 2;
					go.o2 = "Player2 vs Player3                         -->   Player2 and Player3 Out of the Game!";

				}
			}

			else if (guesserNumber == player4Number)// 24s
			{

				r.rP1 = 4;
				r.rP3 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Player1 and Player3 Out of the Game!";

				System.out.println("Players 2 and 4 Guessed correctly.You play again with the Guesser!");
				System.out.println();

				guesserNumber = g.guessing();

				player2Number = P2.guessing();
				player4Number = P4.guessing();

				if (guesserNumber == player2Number && guesserNumber == player4Number)// 24s
				{
					System.out.println("All the guesses matched again.Players 2 and 4 won the game!");
					r.rP2 = 1;
					r.rP4 = 1;
					go.o2 = "Player2 vs Player4                        -->   Game tied in this round!";
				}

				else if (guesserNumber == player2Number) {
					System.out.println("yeh! Player2 won the Game");

					r.rP2 = 1;
					r.rP4 = 2;
					go.o2 = "Player2 vs Player4                        -->   Player4 Out of the Game!";
				} else if (guesserNumber == player4Number) {
					System.out.println("yeh! Player4 won the Game");
					r.rP2 = 2;
					r.rP4 = 1;
					go.o2 = "Player2 vs Player4                        -->   Player2 Out of the Game!";
				} else {
					System.out.println("Game lost! No Matches.Play next game");
					r.rP2 = 2;
					r.rP4 = 2;
					go.o2 = "Player2 vs Player4                        -->   Player2 and Player4 Out of the Game!";
				}
			}

			else {
				System.out.println("yeh! Player2 won the Game");
				r.rP1 = 4;
				r.rP2 = 1;
				r.rP3 = 4;
				r.rP4 = 4;
				go.o1 = "Player1 vs Player2 vs Player3 vs Player4   -->   Players 1,3,4 Out of the Game!";

			}
		}

		else if (guesserNumber == player3Number && guesserNumber == player4Number)// 34M
		{
			r.rP1 = 4;
			r.rP2 = 4;
			go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Player 1 and Player2 Out of the Game!";

			System.out.println("Players 3 and 4 Guessed correctly.You play again with the Guesser!");
			System.out.println();

			guesserNumber = g.guessing();

			player3Number = P3.guessing();
			player4Number = P4.guessing();

			if (guesserNumber == player3Number && guesserNumber == player4Number)// 34s
			{
				System.out.println("All the guesses matched again.Players 3 and 4 won the game!");
				r.rP3 = 1;
				r.rP4 = 1;
				go.o2 = "Player3 vs Player4                        -->   Game tied in this round!";

			}

			else if (guesserNumber == player3Number) {
				System.out.println("yeh! Player3 won the Game");
				r.rP3 = 1;
				r.rP4 = 2;
				go.o2 = "Player3 vs Player4                        -->   Player4 Out of the Game!";
			} else if (guesserNumber == player4Number) {
				System.out.println("yeh! Player4 won the Game");
				r.rP3 = 2;
				r.rP4 = 1;
				go.o2 = "Player3 vs Player4                        -->   Player3 Out of the Game!";
			} else {
				System.out.println("Game lost! No Matches.Play next game");
				r.rP3 = 2;
				r.rP4 = 2;
				go.o2 = "Player3 vs Player4                        -->   Player3 and Player4 Out of the Game!";

			}
		}

		else if (guesserNumber == player3Number)// 3M
		{
			System.out.println("yeh! Player3 won the Game");
			r.rP1 = 4;
			r.rP2 = 4;
			r.rP3 = 1;
			r.rP4 = 4;
			go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Players 1,2,4 Out of the Game!";
		}

		else if (guesserNumber == player4Number)// 4M
		{
			System.out.println("yeh! Player4 won the Game");
			r.rP1 = 4;
			r.rP2 = 4;
			r.rP3 = 4;
			r.rP4 = 1;
			go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Players 1,2,3 Out of the Game!";
		} else {
			System.out.println("Game lost! No Matches.Play next game");
			r.rP1 = 4;
			r.rP2 = 4;
			r.rP3 = 4;
			r.rP4 = 4;
			go.o1 = "Player1 vs Player2 vs Player3 vs Player4  -->   Players 1,2,3,4 Out of the Game!";
		}
		System.out.println("----------------------------------------------------------");
		System.out.println();
		r.ranking();
		System.out.println("----------------------------------------------------------");
		System.out.println();
		go.overview();
	}
}

public class GuesserGame {

	public static void main(String[] args) {

		System.out.println("             WELCOME TO GUESSER GAME!");
		System.out.println("             ========================");
		System.out.println();

		Umpire ump = new Umpire();
		ump.readingGuesserChoice();

		ump.readingPlayersChoice();
		ump.matching();
		System.out.println();
		System.out.println("************************** GAME END **************************");
	}

}
