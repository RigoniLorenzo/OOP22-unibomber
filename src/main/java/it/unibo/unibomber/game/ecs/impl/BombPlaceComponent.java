package it.unibo.unibomber.game.ecs.impl;


/**
 * This component manage bomb placement
 */
public class BombPlaceComponent extends AbstractComponent {

     private boolean bombPlaced = false;

     @Override
     public void update() {
          if(this.bombPlaced){
               this.getEntity().getGame().addEntity(this.getEntity().getGame().getFactory().makeBomb(this.getEntity()));
               this.bombPlaced = false;
          }
     }

     public void bombPlace(){
          this.bombPlaced = true;
     }
 
}
