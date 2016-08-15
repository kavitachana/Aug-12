package com.kavita.rockpaperscissors;

public class Opponent extends Player {

	String[] oppNames = { "Alfred", "Betty", "Charles", "Danielle", "Edgar", "Fran", "Gabe", "Heather", "Igor",
			"Jackie" };
	protected String selectedOppName = null;
	protected int oppShootNum = 0;

	public Opponent(String playerName, int shootSelection) {
		super(playerName, shootSelection);
	}

	public Opponent() {

	}

	public void selectOpp(int oppSelection) {

		selectedOppName = oppNames[oppSelection - 1];
		this.shoot();

	}

	@Override
	public String setAndReturnPlayerName() {

		return selectedOppName;
	}

	@Override
	public int shoot() {

		int oppThrow = (int) (Math.random() * ((5 - 1) + 1)) + 1;
		this.shootSelection = (oppThrow);

		return oppThrow;

	}

	public String getSelectedOppName() {
		return selectedOppName;
	}

	public void setSelectedOppName(String selectedOppName) {
		this.selectedOppName = selectedOppName;
	}

	public int getOppShootNum() {
		return oppShootNum;
	}

	public void setOppShootNum(int oppShootNum) {
		this.oppShootNum = oppShootNum;
	}

}
