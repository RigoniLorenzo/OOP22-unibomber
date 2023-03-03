package it.unibo.unibomber.game.view.impl;


import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import it.unibo.unibomber.game.Unibomber;
import it.unibo.unibomber.game.view.api.Gamestate;
import it.unibo.unibomber.game.view.api.MenuButton;
import it.unibo.unibomber.game.view.api.StateHandler;
import it.unibo.unibomber.utilities.LoadSave;

public class Menu extends StateImpl implements StateHandler {

	private MenuButton[] buttons = new MenuButtonImpl[3];
	private BufferedImage backgroundImg;
	private int menuX, menuY, menuWidth, menuHeight;

	public Menu(Unibomber game) {
		super(game);
		loadButtons();
		loadBackground();

	}

	private void loadBackground() {
		backgroundImg = LoadSave.GetSpriteAtlas(LoadSave.MENU_BACKGROUND);
		menuWidth = (int) (backgroundImg.getWidth() * Unibomber.SCALE);
		menuHeight = (int) (backgroundImg.getHeight() * Unibomber.SCALE);
		menuX = Unibomber.GAME_WIDTH / 2 - menuWidth / 2;
		menuY = (int) (45 * Unibomber.SCALE);

	}

	private void loadButtons() {
		buttons[0] = new MenuButtonImpl(Unibomber.GAME_WIDTH / 2, (int) (150 * Unibomber.SCALE),Gamestate.PLAYING);
    }
	@Override
	public void update() {
		for (MenuButton mb : buttons)
			mb.update();
	}

	@Override
	public void draw(Graphics g) {

		g.drawImage(backgroundImg, menuX, menuY, menuWidth, menuHeight, null);

		for (MenuButton mb : buttons)
			mb.draw(g);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		for (MenuButton mb : buttons) {
			if (isIn(e, mb)) {
				mb.setMousePressed(true);
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		for (MenuButton mb : buttons) {
			if (isIn(e, mb)) {
				if (mb.isMousePressed())
					mb.applyGamestate();
				break;
			}
		}

		resetButtons();

	}

	private void resetButtons() {
		for (MenuButton mb : buttons)
			mb.resetBools();

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		for (MenuButton mb : buttons)
			mb.setMouseOver(false);

		for (MenuButton mb : buttons)
			if (isIn(e, mb)) {
				mb.setMouseOver(true);
				break;
			}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
			Gamestate.state = Gamestate.PLAYING;

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}