package com.kavita.rockpaperscissors;

public abstract class Player {

	public String playerName = null;
	public int shootSelection = 0;
	

	public Player(String playerName, int shootSelection) {
		this.playerName = playerName;
		this.shootSelection = shootSelection;
	}

	public Player() {

	}

	public abstract String setAndReturnPlayerName();

	public abstract int shoot();

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String setPlayerName) {
		this.playerName = setPlayerName;
	}

	public int getShootSelection() {
		return shootSelection;
	}

	public void setShootSelection(int shootSelection) {
		this.shootSelection = shootSelection;
	}

}
