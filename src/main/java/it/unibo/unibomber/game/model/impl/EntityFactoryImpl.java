package it.unibo.unibomber.game.model.impl;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.ecs.impl.EntityImpl;
import it.unibo.unibomber.game.model.api.EntityFactory;
import it.unibo.unibomber.utilities.Pair;

public class EntityFactoryImpl implements EntityFactory{

    @Override
    public Entity makeBomber(Pair<Float, Float> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePlayable'");
    }

    @Override
    public Entity makePlayable(Pair<Float, Float> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePlayable'");
    }

    @Override
    public Entity makeBot(Pair<Float, Float> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeBot'");
    }

    @Override
    public Entity makeBomb(Pair<Float, Float> position, Entity placer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeBomb'");
    }

    @Override
    public Entity makeDestructibleWall(Pair<Float, Float> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeDestructibleWall'");
    }

    @Override
    public Entity makeIndestructibleWall(Pair<Float, Float> position) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeIndestructibleWall'");
    }
    
}