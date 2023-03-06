package it.unibo.unibomber.game.model.impl;

import it.unibo.unibomber.game.controller.api.World;
import it.unibo.unibomber.game.controller.impl.WorldImpl;
import it.unibo.unibomber.game.model.api.Game;
import it.unibo.unibomber.game.model.api.GameFactory;

public class GameFactoryImpl implements GameFactory {

    @Override
    public Game makeOnePlayerGame() {
        Game game = new GameImpl(new WorldImpl());
        return game;
    }

    @Override
    public Game makeTwoPlayerGame() {
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
