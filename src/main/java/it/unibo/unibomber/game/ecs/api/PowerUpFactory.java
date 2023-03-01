package it.unibo.unibomber.game.ecs.api;

import it.unibo.unibomber.utilities.Pair;


public interface PowerUpFactory {

    /**
     * @return an instance of BombKick PowerUp
     */
    Entity makeBombKickPowerUp();

    /**
     * @return an instance of Bomb Throw PowerUp
     */
    Entity makeBombThrowPowerUp();

    /**
     * @return an instance of Spiked Bomb PowerUp
     */
    Entity makeSpikedBombPowerUp();

    /**
     * @return an instance of Powerfull Bomb PowerUp
     */
    Entity makePowerfullBombPowerUp();

    /**
     * @return an instance of Bouncy Bomb PowerUp
     */
    Entity makebouncyBombPowerUp();

    /**
     * @return an instance of LineBomb PowerUp
     */
    Entity makelineBombPowerUp();

    /**
     * @return an instance of mineBombPowerUp PowerUp
     */
    Entity makemineBombPowerUp();

    /**
     * @return an instance of shield PowerUp
     */
    Entity makeshieldPowerUp();

    /**
     * @return an instance of a basic PowerUp
     */
    Entity makeBasicPowerUp(Pair<Float, Float> pos, PowerUpType powerUpType);
}
