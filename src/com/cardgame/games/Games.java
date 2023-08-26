package com.cardgame.games;

import com.cardgame.controller.GameController;
import com.cardgame.model.Deck;
import com.cardgame.view.GameSwingView;

public class Games {

    public static void main(String[] args) {
	
	GameSwingView gsv = new GameSwingView();
	gsv.createAndShowGUI();

	GameController gc = new GameController(new Deck(), gsv, new HighCardGameEvaluator());
	gc.run();
    }

}
