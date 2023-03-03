package it.unibo.unibomber.game.view.api;

import java.awt.event.MouseEvent;


import it.unibo.unibomber.game.Unibomber;

public interface State {
    /**
     * Check if mouse is on Button
     * @param e
     * @param mb
     * @return
     */
    public boolean isIn(MouseEvent e, MenuButton mb);
    /**
     * get Game
     * @return
     */
    public Unibomber getGame();
}
