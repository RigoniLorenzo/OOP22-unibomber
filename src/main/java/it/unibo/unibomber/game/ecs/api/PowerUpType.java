package it.unibo.unibomber.game.ecs.api;

import java.util.List;
import java.util.Random;

public enum PowerUpType {


    BOMBUP(false),
    BOMBDOWN(false),
    FIREUP(false),
    FIREDOWN(false),
    FIREFULL(false),
    SPEEDUP(false),
    SPEEDDOWN(false),
    KICKBOMB(true),
    THROWBOMB(true);

    private boolean isComplex;
    private static final int CHANCE_COMPLEX=25;

    /**
     * @param isComplex to establish if powerUp is complex or not
     */
    private PowerUpType (Boolean isComplex){
        this.isComplex = isComplex;
    }

    public boolean isComplex(){
        return this.isComplex;
    }

    /**
     * A method that returns a random powerup that is CHANCE_COMPLEX% complex and (100-CHANCE_COMPLEX)% non-complex.
     * 
     * @return random powerUp 
     */
    public static PowerUpType getRandomPowerUp() {
        //TODO test if findAny is actually pseudo-random
        Random rnd = new Random();
        return List.of(PowerUpType.values()).stream()
                                            .filter(e -> rnd.nextInt(100) <=CHANCE_COMPLEX ? e.isComplex : !e.isComplex)
                                            .findAny().orElseThrow();
    }
}
