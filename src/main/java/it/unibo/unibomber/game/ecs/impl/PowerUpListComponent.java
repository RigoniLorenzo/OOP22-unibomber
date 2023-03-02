package it.unibo.unibomber.game.ecs.impl;

import java.util.HashMap;
import java.util.Map;

import it.unibo.unibomber.game.ecs.api.PowerUpType;

public class PowerUpListComponent extends AbstractComponent {

    protected int bombNumber;
    protected int bombPower;
    protected Map<PowerUpType,Integer> powerUpList= new HashMap<>();

    public PowerUpListComponent(int bombNumber, int bombPower, Map<PowerUpType,Integer> powerUpList) {
        this.bombNumber = bombNumber;
        this.bombPower = bombPower;
        this.powerUpList = powerUpList;
    }

    @Override
    public void update() {

    }    

    public int getBombNumber(){
        return bombNumber;
    }

    public int getBombPower(){
        return bombPower;
    }
}
