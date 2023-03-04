package it.unibo.unibomber.inputs.impl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import it.unibo.unibomber.game.controller.impl.WorldPanel;
import it.unibo.unibomber.game.view.gamestates.api.Gamestate;

public class MouseInputsImpl implements MouseListener{

	private WorldPanel worldPanel;

    public MouseInputsImpl(WorldPanel worldPanel) {
		this.worldPanel = worldPanel;
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		switch (Gamestate.state) {
			case MENU:
				worldPanel.getWorld().getMenu().mousePressed(e);
				break;
			case PLAY:
				break;
			default:
				break;
	
			}	
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		switch (Gamestate.state) {
			case MENU:
				worldPanel.getWorld().getMenu().mouseReleased(e);
				break;
			case PLAY:
				break;
			default:
				break;
	
			}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
