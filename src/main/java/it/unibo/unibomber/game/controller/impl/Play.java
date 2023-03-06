package it.unibo.unibomber.game.controller.impl;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import it.unibo.unibomber.game.controller.api.GameLoop;
import it.unibo.unibomber.game.ecs.api.Component;
import it.unibo.unibomber.game.ecs.api.Entity;
import it.unibo.unibomber.game.ecs.api.PowerUpType;
import it.unibo.unibomber.game.ecs.api.Type;
import it.unibo.unibomber.game.ecs.impl.MovementComponent;
import it.unibo.unibomber.game.model.api.Game;
import it.unibo.unibomber.game.model.impl.EntityFactoryImpl;
import it.unibo.unibomber.game.model.impl.GameImpl;
import it.unibo.unibomber.utilities.Constants;
import it.unibo.unibomber.utilities.Pair;
import it.unibo.unibomber.utilities.UploadRes;
import static it.unibo.unibomber.utilities.Constants.Player.*;

public class Play extends StateImpl implements KeyListener,GameLoop{
    BufferedImage sprite;
    private Deque<Integer> key_queue;
	private BufferedImage grass;
	private BufferedImage power_up;
	private BufferedImage indestructible_wall;
	private int arenaWidth, arenaHeight;
	private Game game;
	private BufferedImage[][] animations;
	private int playerAction = STANDING;
	private int animationIndex = 0;
	private List<String> map = new ArrayList<String>();
    public Play(WorldImpl world) {
		super(world);
		game = new GameImpl(world);
		initClasses();
		loadBackground();
		loadAnimations();
		loadIndestructibleWall();
		//TODO load map at settings not in constructor
		loadMap();
	}

	private void initClasses() {
		//add Bomberman Entity
		
		game.addEntity(new EntityFactoryImpl(game).makePlayable(new Pair<Float,Float>(0f, 0f)));
		//game.addEntity(new EntityFactoryImpl(game).makeIndestructibleWall(new Pair<Float,Float>(10f, 10f)));
        key_queue = new LinkedList<>();
		power_up = UploadRes.GetSpriteAtlas(UploadRes.FIRE_UP);
	}

	private void loadAnimations() {
		sprite = UploadRes.GetSpriteAtlas(UploadRes.PLAYER_SPRITES);
		animations = new BufferedImage[13][24];
		for (int j = 0; j < animations.length; j++) {
			for (int i = 0; i < animations[j].length; i++) {
				animations[j][i] = sprite.getSubimage(0,0,23, 48);
			}
		}

	}

	private void loadMap() {
        BufferedReader bf;
		try {
			bf = new BufferedReader(new FileReader("./src/main/res/area1.map"));
			String line;
			try {
				line = bf.readLine();
				while (line != null) {
					map.add(line);
					line = bf.readLine();
				}
				bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}    
	}

	private void loadIndestructibleWall(){
		indestructible_wall = UploadRes.GetSpriteAtlas(UploadRes.INDESTRUCTRIBLE_WALL);
	}

	private void loadBackground() {
		grass = UploadRes.GetSpriteAtlas(UploadRes.GRASS);
	}

	@Override
	public void update() {
		var size=game.getEntities().size();
		for(int i = 0; i<size;i++){
			for(Component c : game.getEntities().get(i).getComponents()){
				c.update();
			}
		}
		updateAnimationFrame();
			key_queue.clear();
		
	}
	
	private void updateAnimationFrame() {
		animationIndex = game.getEntities().stream()
		.filter(x -> x.getType() == Type.PLAYABLE)
		.collect(Collectors.toList())
		.get(0)
		.getComponent(MovementComponent.class)
		.get()
		.getFrameInDirection();
	}
	@Override
    public void draw(Graphics g) {
	

		g.drawImage(power_up,
		 0,
		  0,
		   (int)(Constants.UI.Game.TILES_DEFAULT * Constants.UI.Game.SCALE),
		    (int)(Constants.UI.Game.TILES_DEFAULT * Constants.UI.Game.SCALE), 
		    null);

		    for(int i = 0; i<game.getEntities().size();i++){
		
			g.drawImage(UploadRes.GetSpriteAtlas(UploadRes.SHADOW),
			Math.round(game.getEntities().get(i).getPosition().getX()* Constants.UI.Game.TILES_DEFAULT),
			Math.round(game.getEntities().get(i).getPosition().getY()* Constants.UI.Game.TILES_DEFAULT),
			(int)(Constants.UI.Game.TILES_DEFAULT * Constants.UI.Game.SCALE), 
			(int)(Constants.UI.Game.TILES_DEFAULT * Constants.UI.Game.SCALE), 
			null);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

    @Override
    public void keyTyped(KeyEvent arg0) {     
	   key_queue.add(arg0.getKeyCode());

    }
    public Deque<Integer> getKeys(){
	return key_queue;
    }
}
