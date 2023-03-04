package it.unibo.unibomber.utilities;

public class Constants {
    public static class UI {
		public static class Buttons {
			public static final int WIDTH_DEFAULT = 140; //single button witdh
			public static final int HEIGHT_DEFAULT = 56; //single button height
			public static final int B_WIDTH = (int) (WIDTH_DEFAULT * Game.SCALE); //button width scale
			public static final int B_HEIGHT = (int) (HEIGHT_DEFAULT * Game.SCALE); //button height scale
		}
		public static class Game {
			public final static int TILES_DEFAULT = 32;
			public final static float SCALE = 2f;
			public final static int TILES_WIDTH = 26;
			public final static int TILES_HEIGHT = 14;
			public final static int TILES_SIZE = (int) (TILES_DEFAULT * SCALE);
			public final static int G_WIDTH = TILES_SIZE * TILES_WIDTH;
			public final static int G_HEIGHT = TILES_SIZE * TILES_HEIGHT;
		
		}
		public static class GameLoop {	
			public final static int FPS_SET = 120;
			public final static int UPS_SET = 200;
		}
	}
}
