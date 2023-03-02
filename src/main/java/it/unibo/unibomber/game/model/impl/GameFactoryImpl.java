package it.unibo.unibomber.game.model.impl;

import java.util.Map;

import it.unibo.unibomber.game.model.api.Game;
import it.unibo.unibomber.game.model.api.GameFactory;

public class GameFactoryImpl implements GameFactory {

    @Override
    public Game makeOnePlayerGame(Map<Integer,Boolean> keyCodes) {
        Game game = new GameImpl();
        game.putCharacterPressed(87,false);
        game.putCharacterPressed(65, false);
        game.putCharacterPressed(83, false);
        game.putCharacterPressed(68, false);
        game.putCharacterPressed(27, false);
        game.putCharacterPressed(32, false);
        game.putCharacterPressed(37, false);
        game.putCharacterPressed(39, false);
        return game;
    }

    @Override
    public Game makeTwoPlayerGame(char[] keyCodesPlayerOne, char[] keyCodesPlayerTwo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeTwoPlayerGame'");
    }
}
