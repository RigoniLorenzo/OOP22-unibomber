package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.utilities.Pair;

public class PhysicsComponent extends AbstractComponent {

    private static float globalSpeedMultiplier;
    private Pair<Double,Double> position;


    public PhysicsComponent(Pair<Double,Double> position){
        this.position=position;
    }
    @Override
    public void update() {

    }

    public Pair<Double,Double> getPosition() {
        return this.position;
    }

    public void setSpeed(final Pair<Double,Double> position) {
        this.position = position;
    }
    
}
