package it.unibo.unibomber.game.ecs.api;

import java.util.List;
import java.util.Random;
import java.util.stream.*;

public enum PowerUpType {

    BOMB(false),
    POWER(false),
    SPEEDUP(false),
    SPEEDDOWN(false),
    KICKBOMB(true),
    THROWBOMB(true);

    private boolean isComplex;

    /**
     * @param isComplex to establish if powerUp is complex or not
     */
    private PowerUpType (Boolean isComplex){
        this.isComplex = isComplex;
    }

    /**
     * A method that returns a random powerup that is 25% complex and 75% non-complex.
     * 
     * @return random powerUp 
     */
    public static PowerUpType getRandomPowerUp() {
        Random rnd = new Random();
        return List.of(PowerUpType.values()).stream()
                                            .filter(e -> rnd.nextInt(4) == 0 ? e.isComplex : !e.isComplex)
                                            .collect(Collectors.collectingAndThen(
                                                Collectors.toList(),
                                                list -> list.get(rnd.nextInt(list.size()))
                                            ));
    }
}
