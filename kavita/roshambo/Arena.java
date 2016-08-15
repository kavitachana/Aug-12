package com.kavita.roshambo;

import java.util.Scanner;

import com.kavita.rockpaperscissors.Opponent;
import com.kavita.rockpaperscissors.User;

public class Arena {

	static Scanner sc = new Scanner(System.in);
	
	static boolean stillPlaying = true;
	static User user = new User();
	static Opponent opponent = new Opponent();
	static BattleComparison results = new BattleComparison();

	public static void main(String[] args) {

		int i = 0;
		
		while (stillPlaying) {

			user.playGame(i);
			i++;
			opponent.selectOpp(user.getOppNum());

			System.out.print("Battle result for " + user.getUserName() + " vs " + opponent.getSelectedOppName() + ": ");
			results.battleComp(user.getShootSelection(), opponent.getShootSelection());

			System.out.println("Would you like to play again? Y or N");

			String playAgain = sc.nextLine();
			restart(playAgain);
			
			sc.close();
		}
	}
			private static boolean restart(String playAgain) {

				switch (playAgain.toUpperCase()) {

				case "Y":
					break;

				case "N":
					System.out.println("Thanks for playing!");
					stillPlaying = false;
					break;
				}

				return stillPlaying;
			}

		

	}


