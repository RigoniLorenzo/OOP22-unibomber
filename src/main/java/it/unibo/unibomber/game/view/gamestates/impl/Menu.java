package it.unibo.unibomber.game.view.gamestates.impl;

import it.unibo.unibomber.game.controller.impl.WorldImpl;
import it.unibo.unibomber.game.view.gamestates.api.Gamestate;
import it.unibo.unibomber.utilities.Constants;
import it.unibo.unibomber.utilities.UploadRes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class Menu extends State implements MouseListener, KeyListener{

    private MenuButton[] buttons = new MenuButton[3];
	private BufferedImage backgroundImage;
	private int menuX, menuY, menuWidth, menuHeight;
	public Menu(WorldImpl world) {
		super(world);
		loadButtons();
		loadBackground();
	}

    private void loadBackground() {
		backgroundImage = UploadRes.GetSpriteAtlas(UploadRes.MENU_BACKGROUND);
		menuWidth = (int) (backgroundImage.getWidth() * Constants.UI.Game.SCALE);
		menuHeight = (int) (backgroundImage.getHeight() * Constants.UI.Game.SCALE);
		menuX = Constants.UI.Game.G_WIDTH / 2 - menuWidth / 2;
		menuY = (int) (45 * Constants.UI.Game.SCALE);

	}

	private void loadButtons() {
		buttons[0] = new MenuButton(Constants.UI.Game.G_WIDTH / 2, (int) (150 * Constants.UI.Game.SCALE), 0, Gamestate.PLAY);
		buttons[1] = new MenuButton(Constants.UI.Game.G_WIDTH / 2, (int) (220 * Constants.UI.Game.SCALE), 1, Gamestate.OPTIONS);
		buttons[2] = new MenuButton(Constants.UI.Game.G_WIDTH / 2, (int) (290 * Constants.UI.Game.SCALE), 2, Gamestate.QUIT);
	}

	public void update() {
		for (MenuButton mb : buttons)
			mb.update();
	}

	public void draw(Graphics g) {

		g.drawImage(backgroundImage, menuX, menuY, menuWidth, menuHeight, null);

		for (MenuButton mb : buttons)
			mb.draw(g);
	}

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (MenuButton mb : buttons) {
			if (isMouseIn(e, mb)) {
				mb.setMousePressed(true);
			}
		}
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        for (MenuButton mb : buttons) {
			if (isMouseIn(e, mb)) {
				if (mb.isMousePressed())
					mb.applyGamestate();
				break;
			}
		}
		resetButtons();
    }

    private void resetButtons() {
		for (MenuButton mb : buttons) {
			mb.reset();
        }

	}

    public void mouseMoved(MouseEvent e) {
		for (MenuButton mb : buttons) {
			mb.setMouseOver(false);
        }

		for (MenuButton mb : buttons) {
			if (isMouseIn(e, mb)) {
				mb.setMouseOver(true);
				break;
			}
        }
	}

    @Override
    public void keyPressed(KeyEvent e) {
	}

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}
