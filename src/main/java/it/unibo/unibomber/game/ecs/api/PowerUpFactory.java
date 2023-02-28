package it.unibo.unibomber.game.ecs.api;

public interface PowerUpFactory {

    /**
     * @return an instance of BombKick PowerUp
     */
    Component makeBombKickPowerUp();

    /**
     * @return an instance of Bomb Throw PowerUp
     */
    Component makeBombThrowPowerUp();

    /**
     * @return an instance of Spiked Bomb PowerUp
     */
    Component makeSpikedBombPowerUp();

    /**
     * @return an instance of Powerfull Bomb PowerUp
     */
    Component makePowerfullBombPowerUp();

    /**
     * @return an instance of Bouncy Bomb PowerUp
     */
    Component makebouncyBombPowerUp();

    /**
     * @return an instance of LineBomb PowerUp
     */
    Component makelineBombPowerUp();

    /**
     * @return an instance of mineBombPowerUp PowerUp
     */
    Component makemineBombPowerUp();

    /**
     * @return an instance of shield PowerUp
     */
    Component makeshieldPowerUp();

    /**
     * @return an instance of a basic PowerUp
     */
    Component makeBasicPowerUp();
}
