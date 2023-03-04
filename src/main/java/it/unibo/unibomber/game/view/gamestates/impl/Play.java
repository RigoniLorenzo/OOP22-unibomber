package it.unibo.unibomber.game.view.gamestates.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.util.Deque;
import java.util.LinkedList;
import java.awt.image.BufferedImage;

import it.unibo.unibomber.game.controller.impl.WorldImpl;
import it.unibo.unibomber.utilities.Constants;
import it.unibo.unibomber.utilities.UploadRes;

public class Play extends State implements KeyListener{
    
    private Deque<Integer> key_queue;
	private BufferedImage arena;
	private int menuWidth, menuHeight;

    public Play(WorldImpl world) {
		super(world);
		initClasses();
		loadBackground();
	}

	private void initClasses() {
        key_queue = new LinkedList<>();
	}

	private void loadBackground() {
		arena = UploadRes.GetSpriteAtlas(UploadRes.ARENA_1);
		menuWidth = (int) (Constants.UI.Game.G_WIDTH);
		menuHeight = (int) (Constants.UI.Game.G_HEIGHT);
	}

	public void update() {
        if(!key_queue.isEmpty()){
			//do here the code that use last keypressed
            System.out.print(key_queue.getFirst());
			key_queue.clear();
		}
	}

    public void draw(Graphics g) {
		g.drawImage(arena, 0, 0, menuWidth, menuHeight, null);
	}

	@Override
	public void keyPressed(KeyEvent e) {
        key_queue.add(e.getKeyCode());
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			break;
		case KeyEvent.VK_A:
			break;
        case KeyEvent.VK_S:
			break;
		case KeyEvent.VK_D:
			break;
		case KeyEvent.VK_SPACE:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                break;
            case KeyEvent.VK_A:
                break;
            case KeyEvent.VK_S:
                break;
            case KeyEvent.VK_D:
                break;
            case KeyEvent.VK_SPACE:
                break;
        }
	}

    @Override
    public void keyTyped(KeyEvent arg0) {
    }
}
