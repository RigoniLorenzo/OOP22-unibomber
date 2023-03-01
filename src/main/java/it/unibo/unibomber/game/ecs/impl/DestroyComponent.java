package it.unibo.unibomber.game.ecs.impl;

public class DestroyComponent extends AbstractComponent{

    private boolean isDestroyed = false;

    @Override
    public void update() {
        if (this.isDestroyed) {
            this.getEntity().getWorld().removeEntity(this.getEntity());
        }
    }
    
    public void destroy() {
        this.isDestroyed = true;
    }

}
