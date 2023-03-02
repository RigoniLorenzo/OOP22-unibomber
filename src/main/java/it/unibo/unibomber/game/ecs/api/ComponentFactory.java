package it.unibo.unibomber.game.ecs.api;

import java.util.Map;

public interface ComponentFactory {
    
    Component makePowerUpHandler(int bombNumber, int bombPower, Map<PowerUpType,Integer> powerUpList);
}
