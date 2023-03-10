package it.unibo.unibomber.game.model.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.ecs.impl.MovementComponent;
import it.unibo.unibomber.game.model.api.Field;
import it.unibo.unibomber.game.model.api.Game;
import it.unibo.unibomber.utilities.Direction;
import it.unibo.unibomber.utilities.Pair;

public class FieldImpl implements Field{

    private final Map<Pair<Integer, Integer>, Pair<Type, Entity>> field = new HashMap<>();
    private final Game game;
    
    public FieldImpl(Game game) {
        this.game = game;
    }

    @Override
    public Map<Pair<Integer, Integer>, Pair<Type, Entity>> getField() {
        return new HashMap<>(this.field);
    }

    @Override
    public void updateField() {
        int row;
        int col;
        this.field.clear();
        var fieldEntities = this.game.getEntities().stream()
                            .filter(e -> e.getType() != Type.BOT && e.getType() != Type.PLAYABLE)
                            .collect(Collectors.toList());
        for (var entity : fieldEntities) {
            if (entity.getType() == Type.BOMB &&
               (entity.getComponent(MovementComponent.class).get().getDirection() == Direction.LEFT ||
                entity.getComponent(MovementComponent.class).get().getDirection() == Direction.UP)) {
                row = (int) Math.round(entity.getPosition().getX());
                col = (int) Math.round(entity.getPosition().getY());
            } else {
                row = Math.round(entity.getPosition().getX());
                col = Math.round(entity.getPosition().getY());
            }
            this.field.put(new Pair<Integer, Integer>(row, col),
                    new Pair<Type, Entity>(entity.getType(), entity));
        }
    }
    
}
