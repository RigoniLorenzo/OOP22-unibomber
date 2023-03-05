package it.unibo.unibomber.game.ecs.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Optional;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.PowerUpType;

public class PowerUpListComponent extends AbstractComponent {

    protected int bombNumber;
    protected int bombPower;
    protected List<PowerUpType> powerUpList= new ArrayList<>();


    public PowerUpListComponent(int bombNumber, int bombPower, List<PowerUpType> powerUpList) {
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

    public List<PowerUpType> getPowerUpList() {
        return powerUpList;
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
