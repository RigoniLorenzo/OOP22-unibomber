package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.PowerUpFactory;
import it.unibo.unibomber.game.ecs.api.PowerUpType;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.utilities.Pair;

public class PowerUpFactoryImpl implements PowerUpFactory {

    @Override
    public Entity makeBombKickPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeBombKickPowerUp'");
    }

    @Override
    public Entity makeBombThrowPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeBombThrowPowerUp'");
    }

    @Override
    public Entity makeSpikedBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSpikedBombPowerUp'");
    }

    @Override
    public Entity makePowerfullBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePowerfullBombPowerUp'");
    }

    @Override
    public Entity makebouncyBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makebouncyBombPowerUp'");
    }

    @Override
    public Entity makelineBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makelineBombPowerUp'");
    }

    @Override
    public Entity makemineBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makemineBombPowerUp'");
    }

    @Override
    public Entity makeshieldPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeshieldPowerUp'");
    }

    @Override
    public Entity makeBasicPowerUp(Pair<Float, Float> pos, PowerUpType powerUpType) {
        return new EntityImpl(pos, Type.POWERUP)
            .addComponent(new PowerUpComponent(powerUpType))
            .addComponent(new DestroyComponent());
    }

}
