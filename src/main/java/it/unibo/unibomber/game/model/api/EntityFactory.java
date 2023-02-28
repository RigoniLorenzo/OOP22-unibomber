package it.unibo.unibomber.game.model.api;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.utilities.Pair;

public interface EntityFactory {
    /**
     * @param coordinates the initial position 
     * @return an instance of a Bomber
     */
    Entity makeBomber(Pair<Float,Float> position);
    /**
     * @param coordinates the initial position 
     * @return an instance of a Playable Bomber
     */
    public Entity makePlayable(Pair<Float,Float> position);
    /**
     * @param coordinates the initial position 
     * @return an instance of a non playable Bomber
     */
    public Entity makeBot(Pair<Float,Float> position);
    /**
     * @param position the initial position
     * @param placer the reference to the entity which placed the bomb
     *               in normal condition being the bomber
     * @return an instance of a non an instance of a non playable Bomb
     */
    public Entity makeBomb(Pair<Float,Float> position, Entity placer);
    /**
     * @param position the initial position
     * @return an instance of a non playable a Wall which can be destroyed
     */
    public Entity makeDestructibleWall(Pair<Float,Float> position);
    /**
     * @param position the initial position
     * @return an instance of a wall which cannot be destroyed
     */
    public Entity makeIndestructibleWall(Pair<Float,Float> position);
}