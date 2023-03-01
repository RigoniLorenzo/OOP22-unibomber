package it.unibo.unibomber.game.ecs.impl;

/**
 * This component manage the destroy of the entity
 */
public class DestroyComponent extends AbstractComponent{

    private boolean isDestroyed = false;
    private int destroyDuration = 4;

    @Override
    public void update() {
        if (this.isDestroyed) {
            if (this.destroyDuration == 0) {
                this.getEntity().getWorld().removeEntity(this.getEntity());
            } else {
                this.destroyDuration--;
            }
        }
    }
    
    public void destroy() {
        this.isDestroyed = true;
    }

}
