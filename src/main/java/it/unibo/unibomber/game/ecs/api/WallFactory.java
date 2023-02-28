package it.unibo.unibomber.game.ecs.api;

import it.unibo.unibomber.game.ecs.impl.WallComponent;

public interface WallFactory {
    /**
     * A method that creates a indistructible wall
     * 
     * @return the indistructible wall created
     */
    WallComponent createIndistructWall();

    /**
     * A method that creates a distructible wall
     * 
     * @return the distructible wall created
     */
    WallComponent createDistructWall();

    /**
     * A method that creates a rising wall
     * 
     * @return the rising wall created
     */
    WallComponent createRisingWall();
}
