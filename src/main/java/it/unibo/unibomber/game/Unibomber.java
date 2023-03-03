package it.unibo.unibomber.game;

import it.unibo.unibomber.game.model.api.Game;
import it.unibo.unibomber.game.model.api.GameFactory;
import it.unibo.unibomber.game.model.impl.GameFactoryImpl;
import it.unibo.unibomber.game.model.impl.GameImpl;
import it.unibo.unibomber.game.view.impl.Menu;
import processing.core.*;

public class Unibomber extends PApplet{
    private boolean setup = false;
    Game game = new GameImpl();
    
	private Menu menu;

    public final static int TILES_DEFAULT_SIZE = 32;
	public final static float SCALE = 2f;
	public final static int TILES_IN_WIDTH = 26;
	public final static int TILES_IN_HEIGHT = 14;
	public final static int TILES_SIZE = (int) (TILES_DEFAULT_SIZE * SCALE);
	public final static int GAME_WIDTH = TILES_SIZE * TILES_IN_WIDTH;
	public final static int GAME_HEIGHT = TILES_SIZE * TILES_IN_HEIGHT;
    
    public void settings() {
        size(GAME_WIDTH, GAME_HEIGHT);
        //menu = new Menu(this);
    }

    public void setup() {
        this.setup = true;
        GameFactory gameFactory = new GameFactoryImpl();
        game = gameFactory.makeOnePlayerGame(null);
        if (this.setup) {}
    }

    public void draw() {
        //menu.update();
    }

    public void keyPressed() {
            game.addkeyPressed(keyCode);
    }
      
    public void keyReleased() {
    }

    public void mouseClicked() {

    }

    public static void main(String[] passedArgs) {
        String[] processingArgs = {"Unibomber"};
        final Unibomber uniBomber = new Unibomber();
        PApplet.runSketch(processingArgs, uniBomber);
    }
}
