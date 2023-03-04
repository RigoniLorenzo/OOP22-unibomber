package it.unibo.unibomber.game.view.gamestates.impl;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import it.unibo.unibomber.game.view.gamestates.api.Gamestate;
import it.unibo.unibomber.utilities.UploadRes;
import static it.unibo.unibomber.utilities.Constants.UI.Buttons.*;
public class MenuButton {
    private int x, Y, rowIndex, index;
	private int x_button_position = B_WIDTH / 2;
	private Gamestate game_state;
	private BufferedImage[] buffer_images;
	private boolean mouseOver, mousePressed;
	private Rectangle bounds;

	public MenuButton(int x, int Y, int rowIndex, Gamestate game_state) {
		this.x = x;
		this.Y = Y;
		this.rowIndex = rowIndex;
		this.game_state = game_state;
		loadbuffer_images();
		bounds = new Rectangle(x - x_button_position, Y, B_WIDTH, B_HEIGHT);
	}

	private void loadbuffer_images() {
		buffer_images = new BufferedImage[3];
		BufferedImage temp = UploadRes.GetSpriteAtlas(UploadRes.MENU_BUTTONS);
		for (int i = 0; i < buffer_images.length; i++)
			buffer_images[i] = temp.getSubimage(i * WIDTH_DEFAULT, rowIndex * HEIGHT_DEFAULT, WIDTH_DEFAULT, HEIGHT_DEFAULT);
	}

	public void draw(Graphics g) {
		g.drawImage(buffer_images[index], x - x_button_position, Y, B_WIDTH, B_HEIGHT, null);
	}

	public void update() {
		index = 0;
		if (mouseOver)
			index = 1;
		if (mousePressed)
			index = 2;
	}

	public boolean isMouseOver() {
		return mouseOver;
	}

	public void setMouseOver(boolean mouseOver) {
		this.mouseOver = mouseOver;
	}

	public boolean isMousePressed() {
		return mousePressed;
	}

	public void setMousePressed(boolean mousePressed) {
		this.mousePressed = mousePressed;
	}

	public Rectangle getBounds() {
		return bounds;
	}

	public void applyGamestate() {
		Gamestate.state = game_state;
	}

	public void reset() {
		mouseOver = false;
		mousePressed = false;
	}
}
