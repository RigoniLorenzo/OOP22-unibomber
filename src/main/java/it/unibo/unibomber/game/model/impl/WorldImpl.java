package it.unibo.unibomber.game.model.impl;

import java.util.ArrayList;
import java.util.List;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.model.api.World;

public class WorldImpl implements World {

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
}
