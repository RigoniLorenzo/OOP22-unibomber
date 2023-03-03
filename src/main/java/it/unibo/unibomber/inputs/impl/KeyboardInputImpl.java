package it.unibo.unibomber.inputs.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class KeyboardInputImpl implements KeyListener{
	
	private Deque<Integer> keysPressedQueue = new LinkedList<>();  

	@Override
	public void keyPressed(KeyEvent e) {
		if(keysPressedQueue.size() > 30){
			keysPressedQueue.clear();
		}
		keysPressedQueue.addFirst(e.getKeyCode());
		switch (e.getKeyCode()) {
		case KeyEvent.VK_W:
			break;
		case KeyEvent.VK_A:
			break;
		case KeyEvent.VK_S:
			break;
		case KeyEvent.VK_D:
			break;
		}
	}
	
    @Override
    public void keyReleased(KeyEvent e) {
		System.out.println(keysPressedQueue);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
	public Integer getLastKeypressed(){
		return keysPressedQueue.getFirst();
	}
}
