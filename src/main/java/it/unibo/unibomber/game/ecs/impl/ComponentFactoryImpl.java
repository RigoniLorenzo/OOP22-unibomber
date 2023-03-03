package it.unibo.unibomber.game.ecs.impl;

import java.util.Map;

import it.unibo.unibomber.game.ecs.api.Component;
import it.unibo.unibomber.game.ecs.api.ComponentFactory;
import it.unibo.unibomber.game.ecs.api.PowerUpType;

public class ComponentFactoryImpl implements ComponentFactory{

    @Override
    public Component makePowerUpHandler(int bombNumber, int bombPower, Map<PowerUpType,Integer> powerUpList) {
        return new PowerUpListComponent(bombNumber, bombPower, powerUpList);
    }
    
    
}
