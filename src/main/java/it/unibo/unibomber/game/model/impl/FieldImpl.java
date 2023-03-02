package it.unibo.unibomber.game.model.impl;

import java.util.Set;

import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.model.api.Field;
import it.unibo.unibomber.utilities.Pair;

public class FieldImpl implements Field{

    private Pair<Type, Entity>[][] field;
    private final int numRows;
    private final int numCols;
    
    public FieldImpl(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
    }

    @Override
    public Pair<Type, Entity>[][] getField() {
        final Pair<Type, Entity>[][] copyField = this.field;
        return copyField;
    }

    @Override
    public void updateField(final Set<Entity> entities) {
        int row;
        int col;
        this.field = new Pair[this.numRows][this.numCols];
        for (var entity : entities) {
            //TODO: aggiungere controllo se entity è una bomba
            row = Math.round(entity.getPosition().getX());
            col = Math.round(entity.getPosition().getY());
            this.field[row][col] = new Pair<Type,Entity>(entity.getType(), entity);
        }
    }
    
}
