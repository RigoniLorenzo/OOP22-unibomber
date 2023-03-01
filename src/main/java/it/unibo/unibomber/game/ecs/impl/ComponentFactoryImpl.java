package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.Component;
import it.unibo.unibomber.game.ecs.api.ComponentFactory;

public class ComponentFactoryImpl implements ComponentFactory{

    @Override
    public Component makePowerUpHandler() {
        return new PowerUpListComponent(1, 1);
    }
    
}
