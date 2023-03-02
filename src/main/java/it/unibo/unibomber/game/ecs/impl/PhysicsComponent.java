package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.utilities.Pair;

public class PhysicsComponent extends AbstractComponent {

    private static float globalSpeedMultiplier;


    public PhysicsComponent(){
    }
    @Override
    public void update() {
        this.getEntity().getGame();
        var a= this.getEntity().getPosition();
    }
    
}
