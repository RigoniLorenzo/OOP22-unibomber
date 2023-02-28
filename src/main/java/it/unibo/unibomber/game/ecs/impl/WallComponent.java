package it.unibo.unibomber.game.ecs.impl;

/**
 * This is the class for manage the wall component
 */
public class WallComponent extends AbstractComponent{

    private final boolean isDestructible;
    private boolean isTransparent;

    public WallComponent(boolean isDestructible, boolean isTransparent) {
        this.isDestructible = isDestructible;
        this.isTransparent = isTransparent;
    }

    /**
     * A method to know if the wall is distructible or not
     * 
     * @return true if the wall is distructible, false otherwise
     */
    public boolean canDestroy() {
        return this.isDestructible;
    }

    /**
     * A method to know if the wall is trasparent or not
     * 
     * @return true if the wall is trasparent, false otherwise
     */
    public boolean isTransparent() {
        return this.isTransparent;
    }

    /**
     * A method to set the transparent of the wall
     */
    public void setTransparent() {
        this.isTransparent = false;
    }

    @Override
    public void update() {}
}
