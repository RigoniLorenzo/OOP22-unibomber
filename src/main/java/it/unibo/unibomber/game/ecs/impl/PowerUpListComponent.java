package it.unibo.unibomber.game.ecs.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Optional;

import it.unibo.unibomber.game.ecs.api.Entity;
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
    public PowerUpListComponent(Entity giver) {
        Optional<PowerUpListComponent> giversList=giver.getComponent(PowerUpListComponent.class);
        if(giversList.isPresent()){
            this.bombNumber=giversList.get().getBombNumber();
            this.bombPower=giversList.get().getBombPower();
            this.powerUpList=giversList.get().getPowerUpList();
        }
        else {
            throw new MissingFormatArgumentException("Giver does not contain a PowerUpListComponent itSelf");
        }
    }

    private Map<PowerUpType, Integer> getPowerUpList() {
        return null;
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
