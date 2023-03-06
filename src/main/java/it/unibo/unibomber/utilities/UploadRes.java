package it.unibo.unibomber.utilities;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class UploadRes {
	public static final String MENU_BUTTONS = "button_atlas.png";
	public static final String MENU_BACKGROUND = "menu_background.png";
	public static final String GRASS = "grass.png";
	public static final String PLAYER_SPRITES = "player_sprites.png";
	public static final String SHADOW = "shadow.png";
	public static final String INDESTRUCTRIBLE_WALL = "indestructible_wall.png";
	public static final String FIRE_UP = "fire_up.png";
	public static BufferedImage GetSpriteAtlas(String fileName) {
		BufferedImage img = null;
		InputStream is = UploadRes.class.getResourceAsStream(fileName);
		try {
			img = ImageIO.read(is);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return img;
	}
}
