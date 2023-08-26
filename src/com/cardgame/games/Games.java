package com.cardgame.games;

import com.cardgame.controller.GameController;
import com.cardgame.model.Deck;
import com.cardgame.view.View;

public class Games {

    public static void main(String[] args) {
	GameController gc = new GameController(new Deck(), new View(), new HighCardGameEvaluator());
	gc.run();
    }

}
