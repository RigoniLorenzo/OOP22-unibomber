package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.ecs.api.WallFactory;
import it.unibo.unibomber.utilities.Pair;

/**
 * This is the factory for creates the 3 types of walls
 */
public class WallFactoryImpl implements WallFactory{

    @Override
    public Entity createIndestructWall(Pair<Float, Float> pos) {
        return new EntityImpl(pos, Type.INDESTRUCTIBLE_WALL);
    }

    @Override
    public Entity createDestructWall(Pair<Float, Float> pos) {
        return new EntityImpl(pos, Type.DESTRUCTIBLE_WALL)
            .addComponent(new DestroyComponent());
    }

    @Override
    public Entity createRisingWall(Pair<Float, Float> pos) {
        return new EntityImpl(pos, Type.RISING_WALL)
            .addComponent(new RisingComponent());
    }
}
