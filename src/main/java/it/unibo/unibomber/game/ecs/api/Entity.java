package it.unibo.unibomber.game.ecs.api;

import java.util.Optional;
import java.util.Set;

import it.unibo.unibomber.game.model.api.World;
import it.unibo.unibomber.utilities.Pair;

public interface Entity {

    /**
     * @return list of components of the entity
     */
    Set<Component> getComponents();

    /**
     * @param <C>            type of the component requested
     * @param componentClass the class of the requested component
     * @return An optional containing the requested Component, an optional otherwise
     */
    <C extends Component> Optional<C> getComponent(Class<C> componentClass);

    /**
     * @return the position of the entity on the field
     */
    Pair<Float, Float> getPosition();

    /**
     * @param component the component to be added
     * @return the entity with the component added
     */
    Entity addComponent(Component component);

    /**
     * @param position the new position of the entity
     */
    void setPosition(Pair<Float, Float> position);

    /**
     * @return the type of the entity
     */
    Type getType();

    /**
     * @return the world in which the entity is placed
     */
    World getWorld();

    /**
     * @return speed of entity
     */
    float getSpeed();

    /**
     * increase or decrease speed of entity
     */
    void addSpeed(PowerUpType powerUpType);
}
