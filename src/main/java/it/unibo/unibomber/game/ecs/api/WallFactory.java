package it.unibo.unibomber.game.ecs.api;

import it.unibo.unibomber.utilities.Pair;

public interface WallFactory {
    
    /**
     * A method that creates a indistructible wall
     * @param pos the position where the wall will be placed
     * @return the indistructible wall created
     */
    Entity createIndestructWall(Pair<Float, Float> pos);

    /**
     * A method that creates a distructible wall
     * @param pos the position where the wall will be placed
     * @return the distructible wall created
     */
    Entity createDestructWall(Pair<Float, Float> pos);

    /**
     * A method that creates a rising wall
     * @param pos the position where the wall will be placed
     * @return the rising wall created
     */
    Entity createRisingWall(Pair<Float, Float> pos);
}
