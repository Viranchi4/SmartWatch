package com.problem1;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player> {

	@Override
	public int compare(Player player1, Player player2) {
		// TODO Auto-generated method stub
		int nameCompare = player1.name.compareTo(player2.name);
		int skillCompare = player1.skill.compareTo(player2.skill);
		return (skillCompare==0)?nameCompare:skillCompare;
	}

	
}
