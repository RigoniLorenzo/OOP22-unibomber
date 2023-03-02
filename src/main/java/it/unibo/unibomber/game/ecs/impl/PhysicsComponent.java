package it.unibo.unibomber.game.ecs.impl;

import java.util.Optional;

import it.unibo.unibomber.utilities.Pair;

public class PhysicsComponent extends AbstractComponent {
    //TODO implement
    private static float globalSpeedMultiplier;
    private Pair<Float,Float> moveBy;

    public PhysicsComponent(){
    }
    @Override
    public void update() {
        this.getEntity().addPosition(moveBy);
        Optional<CollisionComponent> collisionComp = this.getEntity().getComponent(CollisionComponent.class);
        if(collisionComp.isPresent()){
            collisionComp.get().checkCollisions();
        }
    }

    public void moveBy(final Pair<Float,Float> moveBy){
        this.moveBy=new Pair<>( moveBy.getX()*this.getEntity().getSpeed(),
                                moveBy.getY()*this.getEntity().getSpeed());
    }
}
