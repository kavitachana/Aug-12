package com.kavita.roshambo;

public class BattleComparison {
	
	public void battleComp(int userThrow, int oppThrow) {

		String[][] results = new String[5][5];

		results[0][0] = "You threw Rock, your opponent threw Rock -- You Tied.";
		results[0][1] = "You threw Rock, your opponent threw Paper -- You Lose.";
		results[0][2] = "You threw Rock, your opponent threw Scissors -- You Win!";
		results[0][3] = "You threw Rock, your opponent threw Lizard -- You Win!";
		results[0][4] = "You threw Rock, your opponent threw Spock -- You Lose :(";
		results[1][0] = "You threw Paper, your opponent threw Rock -- You Win!";
		results[1][1] = "You threw Paper, your opponent threw Paper -- You Tied.";
		results[1][2] = "You threw Paper, your opponent threw Scissors -- You Lose :(";
		results[1][3] = "You threw Paper, your opponent threw Lizard -- You Lose :(";
		results[1][4] = "You threw Paper, your opponent threw Spock -- You Win!";
		results[2][0] = "You threw Scissors, your opponent threw Rock -- You Lose :(";
		results[2][1] = "You threw Scissors, your opponent threw Paper -- You Win!";
		results[2][2] = "You threw Scissors, your opponent threw Scissors -- You Tied.";
		results[2][3] = "You threw Scissors, your opponent threw Lizard -- You Win!";
		results[2][4] = "You threw Scissors, your opponent threw Spock -- You Lose :(";
		results[3][0] = "You threw Lizard, your opponent threw Rock -- You Lose :(";
		results[3][1] = "You threw Lizard, your opponent threw Paper -- You Win!";
		results[3][2] = "You threw Lizard, your opponent threw Scissors -- You Lose :(";
		results[3][3] = "You threw Lizard, your opponent threw Lizard -- You Tied.";
		results[3][4] = "You threw Lizard, your opponent threw Spock -- You Win!";
		results[4][0] = "You threw Spock, your opponent threw Rock -- You Win!";
		results[4][1] = "You threw Spock, your opponent threw Paper -- You Lose :(";
		results[4][2] = "You threw Spock, your opponent threw Scissors -- You Win!";
		results[4][3] = "You threw Spock, your opponent threw Lizard -- You Lose :(";
		results[4][4] = "You threw Spock, your opponent threw Spock -- You Tied.";

		System.out.println(results[userThrow - 1][oppThrow - 1] + "\n");

	}
}
