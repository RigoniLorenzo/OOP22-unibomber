package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.PowerUpType;

public class PowerUpComponent extends AbstractComponent {

    private PowerUpType powerUpType;

    public PowerUpComponent(PowerUpType powerUpType) {
        this.powerUpType = powerUpType;
    }

    public PowerUpType getPowerUp(){
        return this.powerUpType;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
