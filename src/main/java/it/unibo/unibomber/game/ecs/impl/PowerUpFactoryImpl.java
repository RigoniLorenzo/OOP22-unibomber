package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.Component;
import it.unibo.unibomber.game.ecs.api.PowerUpFactory;

public class PowerUpFactoryImpl implements PowerUpFactory {

    @Override
    public Component makeBombKickPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeBombKickPowerUp'");
    }

    @Override
    public Component makeBombThrowPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeBombThrowPowerUp'");
    }

    @Override
    public Component makeSpikedBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeSpikedBombPowerUp'");
    }

    @Override
    public Component makePowerfullBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePowerfullBombPowerUp'");
    }

    @Override
    public Component makebouncyBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makebouncyBombPowerUp'");
    }

    @Override
    public Component makelineBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makelineBombPowerUp'");
    }

    @Override
    public Component makemineBombPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makemineBombPowerUp'");
    }

    @Override
    public Component makeshieldPowerUp() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeshieldPowerUp'");
    }

    @Override
    public PlayerBasicPowerUpComponent makebasicPowerUp() {
        return new PlayerBasicPowerUpComponent(1, 1, 1);
    }
    
}
