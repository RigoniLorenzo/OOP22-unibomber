package it.unibo.unibomber.game;

import processing.core.*;

public class Unibomber extends PApplet{
    private boolean setup = false;

    public void settings() {
        size(400, 400);
    }

    public void setup() {
        this.setup = true;
        background(220);
        if (this.setup) {}
    }

    public void draw() {

    }

    /**
     * 
     */
    public static void main(String[] passedArgs) {
        String[] processingArgs = {"Unibomber"};
        final Unibomber uniBomber = new Unibomber();
        PApplet.runSketch(processingArgs, uniBomber);
    }
}
