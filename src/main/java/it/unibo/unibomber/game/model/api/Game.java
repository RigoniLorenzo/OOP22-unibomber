package it.unibo.unibomber.game.model.api;

import java.util.List;
import it.unibo.unibomber.game.ecs.api.Entity;

public interface Game {
    
    /**
     * @return the list of all entities in the current Game
     */
    List<Entity> getEntities();

    /**
     * @param <C> only extension of entity
     * @param entity the entity to be added to the Game
     */
    <C extends Entity> void addEntity(C entity);

    /**
     * @return if key is contaned into Map
     */
    boolean isContained(int keyCode);

    /**
     * @param keyCode the actual code of the keyboard key
     * @param isPressed whether it was pressed or released
     */
    void putCharacterPressed(int keyCode, boolean isPressed);

    /**
     * @param entity the entity to be removed
     */
    void removeEntity(Entity entity);


}
