package com.cardgame.games;

import java.util.List;

import com.cardgame.model.IPlayer;

public interface GameEvaluator {
    
    public IPlayer evaluateWinner(List<IPlayer> players);
    
}
