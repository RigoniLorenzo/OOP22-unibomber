package it.unibo.unibomber.game.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.model.api.Game;

public class GameImpl implements Game {

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

    @Override
    public void removeEntity(Entity entity) {
        entities.remove(entity);
    }  

    
    
}
