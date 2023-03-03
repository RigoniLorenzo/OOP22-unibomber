package it.unibo.unibomber.game.model.impl;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.PowerUpType;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.ecs.impl.AIComponent;
import it.unibo.unibomber.game.ecs.impl.CollisionComponent;
import it.unibo.unibomber.game.ecs.impl.DestroyComponent;
import it.unibo.unibomber.game.ecs.impl.EntityImpl;
import it.unibo.unibomber.game.ecs.impl.ExplodeComponent;
import it.unibo.unibomber.game.ecs.impl.InputComponent;
import it.unibo.unibomber.game.ecs.impl.PhysicsComponent;
import it.unibo.unibomber.game.ecs.impl.BombPlaceComponent;
import it.unibo.unibomber.game.ecs.impl.PowerUpComponent;
import it.unibo.unibomber.game.ecs.impl.PowerUpListComponent;
import it.unibo.unibomber.game.model.api.EntityFactory;
import it.unibo.unibomber.utilities.Pair;

public class EntityFactoryImpl implements EntityFactory{

    //TODO everything

    @Override
    public Entity makePowerUp(Pair<Float, Float> pos, PowerUpType powerUpType) {
        return new EntityImpl(pos, Type.POWERUP)
            .addComponent(new PowerUpComponent(powerUpType))
            .addComponent(new DestroyComponent());
    }

    @Override
    public Entity makeBomber(Pair<Float, Float> position, Type type) {
        return new EntityImpl(position,type)
            .addComponent(new PhysicsComponent())
            .addComponent(new CollisionComponent(false))
            .addComponent(new BombPlaceComponent())
            .addComponent(new DestroyComponent());
    }

    @Override
    public Entity makePlayable(Pair<Float, Float> position) {
            return makeBomber(position, Type.PLAYABLE)
                   .addComponent(new InputComponent());

    }

    @Override
    public Entity makeBot(Pair<Float, Float> position, int AI_difficulty) {
        return makeBomber(position, Type.PLAYABLE)
              .addComponent(new AIComponent());
    }

    @Override
    public Entity makeBomb(Entity placer) {
        return new EntityImpl(placer.getPosition(), Type.BOMB)
                   .addComponent(new PhysicsComponent())
                   .addComponent(new CollisionComponent(true))
                   .addComponent(new ExplodeComponent())
                   .addComponent(new PowerUpListComponent(placer))
                   .addComponent(new DestroyComponent());
    }

    @Override
    public Entity makeDestructibleWall(Pair<Float, Float> position) {
        return new EntityImpl(position, Type.DESTRUCTIBLE_WALL)
                   .addComponent(new ExplodeComponent())
                   .addComponent(new DestroyComponent());
    }

    @Override
    public Entity makeIndestructibleWall(Pair<Float, Float> position) {
        return new EntityImpl(position, Type.INDESTRUCTIBLE_WALL);
    }
    
}
