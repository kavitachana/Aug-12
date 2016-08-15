package com.kavita.rockpaperscissors;

import java.util.Scanner;

import com.kavita.roshambo.Validation;

public class User extends Player {

	Scanner play = new Scanner(System.in);
	protected String userName = null;
	public String userChoice = null;
	public boolean stillPlaying = true;
	public boolean userFailed = false;
	public int oppNum = 0;

	public User(String playerName, int shootSelection) {
		super(playerName, shootSelection);
	}

	public User() {

	}

	public boolean playGame(int ite) {

		if (ite == 0) {		//limits name entry to the first round of play
			System.out.println("\nWelcome to Rock, Paper, Scissors, Lizard, Spock!\n");

			userName = this.setAndReturnPlayerName();
		} 
		
			do {

				System.out.println("Please select which opponent you want to roshambo with: \n" + "\t1. Alfred\n"
						+ "\t2. Betty\n" + "\t3. Charles\n" + "\t4. Danielle\n" + "\t5. Edgar\n" + "\t6. Fran\n" + "\t7. Gabe\n"
						+ "\t8. Heather\n" + "\t9. Igor\n" + "\t10. Jackie");

				userChoice = play.nextLine();
				userFailed = Validation.oppNumber(userChoice); 
			
				play.close();

			} while (userFailed);

			this.setOppNum(Integer.parseInt(userChoice)); // converts to int
			this.shoot();
		
			return stillPlaying;
			
	}

	@Override
	public String setAndReturnPlayerName() {

		System.out.println("Please enter your name: ");
		userName = play.nextLine();
		return userName;
	}

	@Override
	public int shoot() {

		do {
			System.out.println("Please select what you want to throw: \n" + "\t1. Rock\n" + "\t2. Paper\n"
					+ "\t3. Scissors\n" + "\t4. Lizard\n" + "\t5. Spock\n");

			userChoice = play.nextLine();
			userFailed = Validation.userThrow(userChoice);

		} while (userFailed);

		this.shootSelection = Integer.parseInt(userChoice);

		return shootSelection;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getOppNum() {
		return oppNum;
	}

	public void setOppNum(int oppNum) {
		this.oppNum = oppNum;
	}

} 
