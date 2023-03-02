package it.unibo.unibomber.game;

import it.unibo.unibomber.game.model.api.Game;
import it.unibo.unibomber.game.model.api.GameFactory;
import it.unibo.unibomber.game.model.impl.GameFactoryImpl;
import it.unibo.unibomber.game.model.impl.GameImpl;
import processing.core.*;

public class Unibomber extends PApplet{
    private boolean setup = false;
    Game game = new GameImpl();
    
    public void settings() {
        size(400, 400);
    }

    public void setup() {
        this.setup = true;
        background(220);
        GameFactory gameFactory = new GameFactoryImpl();
        game = gameFactory.makeOnePlayerGame(null);
        if (this.setup) {}
    }

    public void draw() {
    
    }

    public void keyPressed() {
        if(game.isContained(keyCode)) {
            game.putCharacterPressed(keyCode, true);
        }
    }
      
    public void keyReleased() {
        if(game.isContained(keyCode)) {
            game.putCharacterPressed(keyCode, false);
        }
    }

    public void mouseClicked() {

    }

    public static void main(String[] passedArgs) {
        String[] processingArgs = {"Unibomber"};
        final Unibomber uniBomber = new Unibomber();
        PApplet.runSketch(processingArgs, uniBomber);
    }
}
