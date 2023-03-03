package it.unibo.unibomber.game.view.api;

import java.awt.Rectangle;
import java.awt.Graphics;

public interface MenuButton {
    /**
     * draw image int g Graphics
     * @param g
     */
    public void draw(Graphics g);
    /**
     * update mouse state
     */
    public void update();
    /**
     * get mouse over
     * @return
     */
    public boolean isMouseOver();
    /**
     * set mouse over
     * @param mouseOver
     */
    public void setMouseOver(boolean mouseOver);
    /**
     * get mouse pressed
     * @return
     */
    public boolean isMousePressed();
    /**
     * set mouse pressed
     * @param mousePressed
     */
    public void setMousePressed(boolean mousePressed);
    /**
     * get hitbox of button
     * @return
     */
    public Rectangle getBounds();
    /**
     * set of game state
     */
    public void applyGamestate();
    /**
     * reset mouse state
     */
    public void resetBools();
}
