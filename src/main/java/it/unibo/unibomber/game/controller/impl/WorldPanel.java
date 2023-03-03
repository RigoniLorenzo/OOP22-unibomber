package it.unibo.unibomber.game.controller.impl;

import javax.swing.JPanel;

import it.unibo.unibomber.inputs.impl.MouseInputsImpl;
import it.unibo.unibomber.inputs.impl.KeyboardInputImpl;

public class WorldPanel extends JPanel {

    public WorldPanel(){
		addKeyListener(new KeyboardInputImpl());
		addMouseListener(new MouseInputsImpl());
    }
}
