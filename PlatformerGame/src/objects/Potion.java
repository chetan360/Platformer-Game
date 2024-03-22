package objects;

import main.Game;

public class Potion extends GameObject {
	
	private float howerOffset;
	private int maxHowerOffset, howerDir = 1;

	public Potion(int x, int y, int objType) {
		super(x, y, objType);
		doAnimation = true;
		initHitbox(7, 14);
		xDrawOffset = (int) (3 * Game.SCALE);
		yDrawOffset = (int) (2 * Game.SCALE);
		
		maxHowerOffset = (int) (10 * Game.SCALE);
	}

	public void update() {
		updateAnimationTick();
		updateHover();
	}
	
	public void updateHover() {
		howerOffset += (0.075f * Game.SCALE * howerDir);
		
		if(howerOffset >= maxHowerOffset)
			howerDir = -1;
		else if(howerOffset < 0)
			howerDir = 1;
		
		hitbox.y = y + howerOffset;
	}
}
