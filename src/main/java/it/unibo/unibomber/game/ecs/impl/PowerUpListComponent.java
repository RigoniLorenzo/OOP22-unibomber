package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.PowerUpType;

public class PowerUpListComponent extends AbstractComponent {

    private int bombNumber;
    private int bombPower;

    public PowerUpListComponent(int bombNumber, int bombPower) {
        this.bombNumber = bombNumber;
        this.bombPower = bombPower;
    }

    @Override
    public void update() {

    }

    /**
     * @return actual bomb number of player
     */
    public int getBombNumber() {
        return this.bombNumber;
    }

    /**
     * @return actual bomb power of player
     */
    public int getBombPower() {
        return this.bombPower;
    }

    /**
     * @param powerUp that modify parameter of player
     */
    public void setPowerUps(PowerUpType powerUpType) {
        switch(powerUpType){
            case FIREUP: if(this.bombPower < 8) this.bombPower+=1; break;
            case FIREDOWN: if(this.bombPower > 1) this.bombPower-=1; break;
            case FIREFULL: this.bombPower=8; break;
            case BOMBUP: if(this.bombNumber < 8) this.bombNumber+=1; break;
            case BOMBDOWN: if(this.bombNumber > 1) this.bombNumber-=1; break;
            default : break;
        }
    }

    
}
