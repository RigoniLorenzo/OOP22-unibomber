package it.unibo.unibomber.game.view.impl;
import java.awt.image.BufferedImage;

import java.awt.Rectangle;

import static it.unibo.unibomber.utilities.Constants.UI.Buttons.*;

import it.unibo.unibomber.game.view.api.Gamestate;
import it.unibo.unibomber.game.view.api.MenuButton;
import it.unibo.unibomber.utilities.LoadSave;
import java.awt.Graphics;

public class MenuButtonImpl implements MenuButton{
    
    //row menu button sprite
    private int xPos,yPos,rowIndex,index;
    private int xOffsetCenter = B_WIDTH / 2;//middle of screen
    private BufferedImage[] imgs;
	private boolean mouseOver, mousePressed;
	private Rectangle bounds;
	private Gamestate state;

    public MenuButtonImpl(int xPos, int yPos, Gamestate state){
        this.xPos=xPos;
        this.yPos=yPos;
        rowIndex=0;
        this.state = state;
    }

    private void initBounds() {
		bounds = new Rectangle(xPos - xOffsetCenter, yPos, B_WIDTH, B_HEIGHT);
	}

    private void loadImgs() {
		imgs = new BufferedImage[3];
		BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.MENU_BUTTONS);
		for (int i = 0; i < imgs.length; i++)
			imgs[i] = temp.getSubimage(i * B_WIDTH_DEFAULT, rowIndex * B_HEIGHT_DEFAULT, B_WIDTH_DEFAULT, B_HEIGHT_DEFAULT);
	}

	@Override
    public void draw(Graphics g) {
		g.drawImage(imgs[index], xPos - xOffsetCenter, yPos, B_WIDTH, B_HEIGHT, null);
	}

	@Override
    public void update() {
		index = 0;
		if (mouseOver)
			index = 1;
		if (mousePressed)
			index = 2;
	}

	@Override
    public boolean isMouseOver() {
		return mouseOver;
	}

	@Override
	public void setMouseOver(boolean mouseOver) {
		this.mouseOver = mouseOver;
	}

	@Override
	public boolean isMousePressed() {
		return mousePressed;
	}

	@Override
	public void setMousePressed(boolean mousePressed) {
		this.mousePressed = mousePressed;
	}

	@Override
    public Rectangle getBounds() {
		return bounds;
	}

	@Override
	public void applyGamestate() {
		Gamestate.state = state;
	}

	@Override
	public void resetBools() {
		mouseOver = false;
		mousePressed = false;
	}

}
