package it.unibo.unibomber.game.model.api;

import java.util.ArrayList;
import java.util.List;

import it.unibo.unibomber.game.ecs.api.Entity;

public interface World {
     List<Entity> getEntities();
     void addEntity(Entity entity);
     void removeEntity(Entity entity);


}
