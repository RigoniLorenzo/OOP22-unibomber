package it.unibo.unibomber.game.model.impl;

import java.util.Map;

import it.unibo.unibomber.game.model.api.Game;
import it.unibo.unibomber.game.model.api.GameFactory;

public class GameFactoryImpl implements GameFactory {

    @Override
    public Game makeOnePlayerGame() {
        Game game = new GameImpl();
        return game;
    }

    @Override
    public Game makeTwoPlayerGame(char[] keyCodesPlayerOne, char[] keyCodesPlayerTwo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeTwoPlayerGame'");
    }
    //TODO put in player
    /*
        game.addkeyPressed(87);
        game.addkeyPressed(65);
        game.addkeyPressed(68);
        game.addkeyPressed(27);
        game.addkeyPressed(32);
        game.addkeyPressed(37);
        game.addkeyPressed(39);
     */
}
