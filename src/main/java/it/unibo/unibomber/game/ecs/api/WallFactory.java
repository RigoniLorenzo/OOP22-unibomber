package it.unibo.unibomber.game.ecs.api;

public interface WallFactory {
    /**
     * A method that creates a indistructible wall
     * 
     * @return the indistructible wall created
     */
    Component createIndistructWall();

    /**
     * A method that creates a distructible wall
     * 
     * @return the distructible wall created
     */
    Component createDistructWall();

    /**
     * A method that creates a rising wall
     * 
     * @return the rising wall created
     */
    Component createRisingWall();
}
