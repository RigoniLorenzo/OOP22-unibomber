package it.unibo.unibomber.inputs.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import it.unibo.unibomber.game.controller.impl.WorldPanel;
import it.unibo.unibomber.game.view.gamestates.api.Gamestate;


public class KeyboardInputsImpl implements KeyListener{
	

	private WorldPanel worldPanel;

	public KeyboardInputsImpl(WorldPanel worldPanel) {
		this.worldPanel = worldPanel;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (Gamestate.state) {
			case MENU:
			worldPanel.getWorld().getMenu().keyPressed(e);
				break;
			case PLAY:
			worldPanel.getWorld().getPlay().keyPressed(e);
				break;
			default:
				break;
		}
	}

    @Override
    public void keyReleased(KeyEvent e) {
		switch (Gamestate.state) {
			case MENU:
			worldPanel.getWorld().getMenu().keyReleased(e);
				break;
			case PLAY:
			worldPanel.getWorld().getPlay().keyPressed(e);
				break;
			default:
				break;
		}
     }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
