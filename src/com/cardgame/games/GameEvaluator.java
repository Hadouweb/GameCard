package com.cardgame.games;

import java.util.List;

import com.cardgame.model.Player;

public interface GameEvaluator {
    
    public Player evaluateWinner(List<Player> players);
    
}
