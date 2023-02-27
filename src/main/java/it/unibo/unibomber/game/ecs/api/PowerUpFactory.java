package it.unibo.unibomber.game.ecs.api;

public interface PowerUpFactory {

    /**
     * @return an instance of BombKick PowerUp
     */
    public Component makeBombKickPowerUp();

    /**
     * @return an instance of Bomb Throw PowerUp
     */
    public Component makeBombThrowPowerUp();

    /**
     * @return an instance of Spiked Bomb PowerUp
     */
    public Component makeSpikedBombPowerUp();

    /**
     * @return an instance of Powerfull Bomb PowerUp
     */
    public Component makePowerfullBombPowerUp();

    /**
     * @return an instance of Bouncy Bomb PowerUp
     */
    public Component makebouncyBombPowerUp();

    /**
     * @return an instance of LineBomb PowerUp
     */
    public Component makelineBombPowerUp();

    /**
     * @return an instance of mineBombPowerUp PowerUp
     */
    public Component makemineBombPowerUp();

    /**
     * @return an instance of shield PowerUp
     */
    public Component makeshieldPowerUp();

    /**
     * @return an instance of a basic PowerUp
     */
    public Component makebasicPowerUp();
}
