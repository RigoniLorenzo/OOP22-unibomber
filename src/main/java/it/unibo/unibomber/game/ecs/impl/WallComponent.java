package it.unibo.unibomber.game.ecs.impl;

/**
 * This is the class for manage the Wall component
 */
public class WallComponent extends AbstractComponent{

    private final boolean isDistructible;
    private boolean isTrasparent;

    public WallComponent(boolean isDistructible, boolean isTrasparent) {
        this.isDistructible = isDistructible;
        this.isTrasparent = isTrasparent;
    }

    public boolean canDestroy() {
        return this.isDistructible;
    }

    public boolean isDistructible() {
        return this.isTrasparent;
    }

    public void setTrasparent() {
        this.isTrasparent = true;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
