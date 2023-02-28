package it.unibo.unibomber.game.ecs.impl;

/**
 * This is the class for manage the Wall component
 */
public class WallComponent extends AbstractComponent{

    private final boolean isDistructible;
    private boolean isTransparent;

    public WallComponent(boolean isDistructible, boolean isTransparent) {
        this.isDistructible = isDistructible;
        this.isTransparent = isTransparent;
    }

    /**
     * A method to know if the wall is distructible or not
     * 
     * @return true if the wall is distructible, false otherwise
     */
    public boolean canDestroy() {
        return this.isDistructible;
    }

    /**
     * A method to know if the wall is trasparent or not
     * 
     * @return true if the wall is trasparent, false otherwise
     */
    public boolean isDistructible() {
        return this.isTransparent;
    }

    /**
     * A method to set the transparent of the wall
     */
    public void setTransparent() {
        this.isTransparent = false;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
