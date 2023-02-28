package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.Component;
import it.unibo.unibomber.game.ecs.api.WallFactory;

public class WallFactoryImpl implements WallFactory{

    @Override
    public Component createIndistructWall() {
        return new WallComponent(false, false);
    }

    @Override
    public Component createDistructWall() {
        return new WallComponent(true, false);
    }

    @Override
    public Component createRisingWall() {
        return new WallComponent(false, true);
    }
}
