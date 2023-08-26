package com.cardgame.games;

import java.util.List;

import com.cardgame.model.Player;
import com.cardgame.model.PlayingCard;

public class LowCardGameEvaluator implements GameEvaluator {

    @Override
    public Player evaluateWinner(List<Player> players) {
	Player bestPlayer = null;
	int bestRank = Integer.MAX_VALUE;
	int bestSuit = Integer.MAX_VALUE;
	
	for (Player player : players) {
	    boolean newBestPlayer = false;
	    
	    if (bestPlayer == null) {
		newBestPlayer = true;
	    } else { 
		PlayingCard pc = player.getCard(0);
		int thisRank = pc.getRank().value();

		if (thisRank < bestRank) {
		    newBestPlayer = true;
		} else if (thisRank == bestRank) {
		    if (pc.getSuit().value() < bestSuit) {
			newBestPlayer = true;
		    }
		}
	    }
	    
	    if (newBestPlayer) {
		bestPlayer = player;
		PlayingCard pc = player.getCard(0);
		bestRank = pc.getRank().value();
		bestSuit = pc.getSuit().value();
	    }
	}
	return bestPlayer;
    }

}
