package it.unibo.unibomber.game.controller.impl;

import it.unibo.unibomber.game.controller.api.World;

public class WorldImpl implements World{
    
	private WorldWindow unibomberWindow;
	private WorldPanel unibomberPanel;

    public WorldImpl(){
        unibomberPanel = new WorldPanel();
		unibomberWindow = new WorldWindow(unibomberPanel);
		unibomberPanel.requestFocus();
    }
}
