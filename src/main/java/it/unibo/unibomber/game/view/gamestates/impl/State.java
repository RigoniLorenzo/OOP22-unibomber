package it.unibo.unibomber.game.view.gamestates.impl;
import java.awt.event.MouseEvent;

import it.unibo.unibomber.game.Unibomber;
import it.unibo.unibomber.game.controller.impl.WorldImpl;

public class State {
    
	protected WorldImpl world;

	public State(WorldImpl world) {
		this.world = world;
	}

	public boolean isMouseIn(MouseEvent e, MenuButton mb) {
		return mb.getBounds().contains(e.getX(), e.getY());
	}
}
