package it.unibo.unibomber.game.controller.impl;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Dimension;
import it.unibo.unibomber.inputs.impl.MouseInputsImpl;
import it.unibo.unibomber.inputs.impl.KeyboardInputsImpl;
import static it.unibo.unibomber.utilities.Constants.UI.Game.G_WIDTH;
import static it.unibo.unibomber.utilities.Constants.UI.Game.G_HEIGHT;

public class WorldPanel extends JPanel {

  private WorldImpl world;

    public WorldPanel(WorldImpl world){
      this.world=world;
      setSize();
      addKeyListener(new KeyboardInputsImpl(this));
      addMouseListener(new MouseInputsImpl(this));
    }

    private void setSize(){
      setPreferredSize(new Dimension(G_WIDTH,G_HEIGHT));
    }

    public void updateWorld() {

    }

    public void paintComponent(Graphics g){
      super.paintComponent(g);   
      world.draw(g);
    }
    /**
     * @return world
     */
    public WorldImpl getWorld () {
      return world;
    }
}
