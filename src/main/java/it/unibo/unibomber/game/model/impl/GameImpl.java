package it.unibo.unibomber.game.model.impl;

import java.util.ArrayList;
import java.util.List;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.model.api.Game;

public class GameImpl implements Game {

    private List<Entity> entities = new ArrayList<>();
    private List<Integer> keysPressedQueue = new ArrayList<>();  

    @Override
    public List<Entity> getEntities() {
        return this.entities;
    }

    @Override
    public <C extends Entity> void addEntity(C entity) {
        entities.add(entity);
    }

    @Override
    public boolean isContained(int keyCode) {
        return keysPressedQueue.contains(keyCode);
    }

    @Override
    public void addkeyPressed(int keyCode) {
        keysPressedQueue.add(keyCode);
    }

    @Override
    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }

    @Override
    public void clearKeysPressed() {
        keysPressedQueue.clear();
    }  

    
    
}
