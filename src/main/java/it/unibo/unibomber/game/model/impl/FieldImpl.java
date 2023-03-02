package it.unibo.unibomber.game.model.impl;

import java.util.Set;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.model.api.Field;
import it.unibo.unibomber.utilities.Pair;

public class FieldImpl implements Field{

    private Pair<Type, Entity>[][] field;
    
    public FieldImpl(final int numRows, final int numCols, final Set<Entity> entities) {
        /*this.field = new Pair<Type, Entity>[numRows][numCols];
        for (var entity : entities) {
            
        }*/
    }

    @Override
    public Pair<Type, Entity>[][] getField() {
        final Pair<Type, Entity>[][] copyField = this.field;
        return copyField;
    }
    
}
