package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.PowerUpType;

public class PlayerBasicPowerUpComponent extends AbstractComponent {

    private double speed;
    private int bombNumber;
    private int bombPower;

    public PlayerBasicPowerUpComponent(double speed, int bombNumber, int bombPower) {
        this.speed = speed;
        this.bombNumber = bombNumber;
        this.bombPower = bombPower;
    }

    @Override
    public void update() {

    }

    /**
     * @return actual speed of player
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @return actual bomb number of player
     */
    public int getBombNumber() {
        return bombNumber;
    }

    /**
     * @return actual bomb power of player
     */
    public int getBombPower() {
        return bombPower;
    }

    /**
     * @param powerUp that modify parameter of player
     */
    public void setPowerUps(PowerUpType powerUp) {
        // TODO Add controll
        switch(powerUp){
            case POWER: bombPower+=1; break;
            case SPEEDUP: speed+=0.5; break;
            case SPEEDDOWN: speed-=0.5; break;
            case BOMB: bombNumber+=1; break;
            default : System.out.println("Error");
        }
    }
    
}
