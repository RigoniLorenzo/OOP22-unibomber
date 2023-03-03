package it.unibo.unibomber.game.ecs.impl;

import it.unibo.unibomber.game.model.impl.EntityFactoryImpl;

/**
 * This component manage bomb placement
 */
public class BombPlaceComponent extends AbstractComponent {

     private boolean bombPlaced = false;

     @Override
     public void update() {
          if(this.bombPlaced){
               this.getEntity().getGame().addEntity(new EntityFactoryImpl().makeBomb(this.getEntity()));
               this.bombPlaced = false;
          }
     }

     public void bombPlace(){
          this.bombPlaced = true;
     }
 
}
