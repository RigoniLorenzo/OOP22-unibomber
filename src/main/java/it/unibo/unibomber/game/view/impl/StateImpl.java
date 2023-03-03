package it.unibo.unibomber.game.view.impl;
import java.awt.event.MouseEvent;

import it.unibo.unibomber.game.Unibomber;
import it.unibo.unibomber.game.view.api.MenuButton;
import it.unibo.unibomber.game.view.api.State;

public class StateImpl implements State{

	protected Unibomber game;

	public StateImpl(Unibomber game) {
		this.game = game;
	}
	
	@Override
	public Unibomber getGame() {
		return game;
	}

	@Override
	public boolean isIn(MouseEvent e, MenuButton mb) {		
		return mb.getBounds().contains(e.getX(), e.getY());

	}
}
