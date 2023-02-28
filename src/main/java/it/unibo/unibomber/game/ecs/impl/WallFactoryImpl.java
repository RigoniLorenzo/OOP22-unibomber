package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.ecs.api.WallFactory;

public class WallFactoryImpl implements WallFactory{

    @Override
    public WallComponent createIndistructWall() {
        return new WallComponent(false, false);
    }

    @Override
    public WallComponent createDistructWall() {
        return new WallComponent(true, false);
    }

    @Override
    public WallComponent createRisingWall() {
        return new WallComponent(false, true);
    }
}
