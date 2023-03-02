package it.unibo.unibomber.game.ecs.impl;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import it.unibo.unibomber.game.ecs.api.Component;
import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.PowerUpType;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.model.api.World;
import it.unibo.unibomber.utilities.Pair;

public class EntityImpl implements Entity{

    private final Type type;
    private final Set<Component> components = new HashSet<>();
    private World world;
    private Pair<Float,Float> position;
    private float speed = 1;

    public EntityImpl(final Pair<Float,Float> position, final Type type) {
        this.position = position;
        this.type = type;
    }

    @Override
    public Set<Component> getComponents() {
        return new HashSet<>(this.components);
    }

    @Override
    public <C extends Component> Optional<C> getComponent(Class<C> componentClass) {
        return this.components.stream()
                            .filter(componentClass::isInstance)
                            .map(componentClass::cast)
                            .findAny();
    }

    @Override
    public Pair<Float, Float> getPosition() {
        return this.position;    
    }

    @Override
    public void setPosition(Pair<Float, Float> position) {
        this.position=position;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public World getWorld() {
        return this.world;
    }

    @Override
    public Entity addComponent(Component component) {
        this.components.add(component);
        return this;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public void addSpeed(PowerUpType powerUpType) {
        switch(powerUpType){
            case SPEEDUP: if(this.speed < 2) this.speed+=0.20; break;
            case SPEEDDOWN: if(this.speed > 1) this.speed-=0.20; break;
            default : break;
        }
    }   

}
