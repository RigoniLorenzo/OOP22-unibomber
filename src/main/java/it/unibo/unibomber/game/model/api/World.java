package it.unibo.unibomber.game.model.api;

import java.util.List;
import java.util.Map;

import it.unibo.unibomber.game.ecs.api.Entity;

public interface World {
    
    /**
     * @return the list of all entities in the current world
     */
    List<Entity> getEntities();

    /**
     * @param <C> only extension of entity
     * @param entity the entity to be added to the World
     */
    <C extends Entity> void addEntity(C entity);

    /**
     * @return all keys currently pressed
     */
    boolean isBeingPressed(char keyCode);

    /**
     * @param keyCode the actual code of the keyboard key
     * @param isPressed whether it was pressed or released
     */
    void putCharacterPressed(char keyCode, boolean isPressed);
}
