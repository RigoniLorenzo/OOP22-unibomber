package it.unibo.unibomber.game.view.api;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public interface StateHandler {
	public void update();

	/**
     * Draw the button after set the position where to draw it
	 * @param g
	 */
	public void draw(Graphics g);

	/**
     * Mouse Click
	 * @param e
	 */
	public void mouseClicked(MouseEvent e);
	/**
     * Mouse Press
	 * @param e
	 */
	public void mousePressed(MouseEvent e);

	/**
     * Mouse Releas
	 * @param e
	 */
	public void mouseReleased(MouseEvent e);

	/**
     * Mouse Move
	 * @param e
	 */
	public void mouseMoved(MouseEvent e);

	/**
     * Key Press
	 * @param e
	 */
	public void keyPressed(KeyEvent e);

	/**
     * Key Released
	 * @param e
	 */
	public void keyReleased(KeyEvent e);

}
