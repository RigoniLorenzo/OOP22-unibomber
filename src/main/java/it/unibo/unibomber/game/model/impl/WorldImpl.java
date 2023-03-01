package it.unibo.unibomber.game.model.impl;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.HashMap;
import java.util.List;
import java.util.Map;
=======
import java.util.List;
>>>>>>> d58487375f8b266db3aa4d2178a6a273c819eb01

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.model.api.World;

public class WorldImpl implements World {

<<<<<<< HEAD
    private List<Entity> entities = new ArrayList<>();
    private Map<Character,Boolean> keysPressed = new HashMap<>();  

    @Override
    public List<Entity> getEntities() {
        return this.entities;
    }

    @Override
    public <C extends Entity> void addEntity(C entity) {
        entities.add(entity);
    }

    @Override
    public boolean isBeingPressed(char keyCode) {
        return keysPressed.containsKey(keyCode);
    }

    @Override
    public void putCharacterPressed(char keyCode, boolean isPressed) {
        keysPressed.put(keyCode, isPressed);
    }


    
    
=======
     List<Entity> entities = new ArrayList<>();
     @Override
     public List<Entity> getEntities() {
          return new ArrayList<>(entities);
     }

     @Override
     public void addEntity(Entity entity) {
          entities.add(entity);
     }

     
 

     @Override
     public void removeEntity(Entity entity) {
          entities.remove(entity);
     }    
>>>>>>> d58487375f8b266db3aa4d2178a6a273c819eb01
}
