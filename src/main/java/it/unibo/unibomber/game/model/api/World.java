package it.unibo.unibomber.game.model.api;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> d58487375f8b266db3aa4d2178a6a273c819eb01

import it.unibo.unibomber.game.ecs.api.Entity;

public interface World {
<<<<<<< HEAD
    
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
=======
     List<Entity> getEntities();
     void addEntity(Entity entity);
     void removeEntity(Entity entity);


>>>>>>> d58487375f8b266db3aa4d2178a6a273c819eb01
}
