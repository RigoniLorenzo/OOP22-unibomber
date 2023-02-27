package it.unibo.unibomber.game.model.api;

public interface WorldFactory {
    //TODO create the file mentioned below
    /**
     * @param keyCodes the key code which corresponds to the player inputs,
     *                 as per the specifics in the controlls file they are:
     *                 [0]left [1]up [2]right [3]down [4]place/pickup/throw Bomb
     *                 [5]activate Remote Controlled Bombs/Line Placement
     * @return an instance of a world where only one player controlls a character
     */
    World makeOnePlayerWorld(char[] keyCodes);

    /**
     * @param keyCodesPlayerOne the key code which corresponds to the first player inputs, see makeOnePlayerWorld
     * @param keyCodesPlayerTwo the key code which corresponds to the second player inputs, see makeOnePlayerWorld
     * @return an instance of a world where only one player controlls a character
     */
    World makeTwoPlayerWorld(char[] keyCodesPlayerOne,char[] keyCodesPlayerTwo);
}
