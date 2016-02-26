/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaCode;

import org.newdawn.slick.Animation;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
/**
 *
 * @author LightMajor
 */
public class Hero {
        public boolean AmIAtkLongsword = false; 
        public boolean AmIAtkBow = false;
    
    
    public static Animation sprite, up, down, left, right, wait , attackup , attackdown , attackright, attackleft;
    
            Hero() throws SlickException{
		SpriteSheet runningSS = new SpriteSheet(
				"res/download (2)",64, 64, 0);

		// System.out.println("Horizontal count: "
		// +runningSS.getHorizontalCount());

		// System.out.println("Vertical count: " +runningSS.getVerticalCount());

                
		up = new Animation();

                sprite = up;
                
		up.setAutoUpdate(true);

		up.addFrame(runningSS.getSprite(0, 8), 330);

		up.addFrame(runningSS.getSprite(1, 8), 330);

		up.addFrame(runningSS.getSprite(2, 8), 330);

		up.addFrame(runningSS.getSprite(3, 8), 330);

		up.addFrame(runningSS.getSprite(4, 8), 330);

		up.addFrame(runningSS.getSprite(5, 8), 330);

		up.addFrame(runningSS.getSprite(6, 8), 330);

		up.addFrame(runningSS.getSprite(7, 8), 330);

		up.addFrame(runningSS.getSprite(8, 8), 330);

                
		down = new Animation();

                sprite = down;
                
		down.setAutoUpdate(false);

		down.addFrame(runningSS.getSprite(0, 10), 330);

		down.addFrame(runningSS.getSprite(1, 10), 330);

		down.addFrame(runningSS.getSprite(2, 10), 330);

		down.addFrame(runningSS.getSprite(3, 10), 330);

		down.addFrame(runningSS.getSprite(4, 10), 330);

		down.addFrame(runningSS.getSprite(5, 10), 330);

		down.addFrame(runningSS.getSprite(6, 10), 330);

		down.addFrame(runningSS.getSprite(7, 10), 330);

		down.addFrame(runningSS.getSprite(8, 10), 330);

                
		left = new Animation();
                
                sprite = left;
                
		left.setAutoUpdate(false);

		left.addFrame(runningSS.getSprite(0, 9), 330);

		left.addFrame(runningSS.getSprite(1, 9), 330);

		left.addFrame(runningSS.getSprite(2, 9), 330);

		left.addFrame(runningSS.getSprite(3, 9), 330);

		left.addFrame(runningSS.getSprite(4, 9), 330);

		left.addFrame(runningSS.getSprite(5, 9), 330);

		left.addFrame(runningSS.getSprite(6, 9), 330);

		left.addFrame(runningSS.getSprite(7, 9), 330);

		left.addFrame(runningSS.getSprite(8, 9), 330);

                
		right = new Animation();

                sprite = right;
                
		right.setAutoUpdate(false);

		right.addFrame(runningSS.getSprite(0, 11), 330);

		right.addFrame(runningSS.getSprite(1, 11), 330);

		right.addFrame(runningSS.getSprite(2, 11), 330);

		right.addFrame(runningSS.getSprite(3, 11), 330);

		right.addFrame(runningSS.getSprite(4, 11), 330);

		right.addFrame(runningSS.getSprite(5, 11), 330);

		right.addFrame(runningSS.getSprite(6, 11), 330);

		right.addFrame(runningSS.getSprite(7, 11), 330);

		right.addFrame(runningSS.getSprite(8, 11), 330);

               
                       
		wait = new Animation();

                sprite = wait;
                
		wait.setAutoUpdate(true);

		wait.addFrame(runningSS.getSprite(0, 14), 300);

		wait.addFrame(runningSS.getSprite(1, 14), 300);

		wait.addFrame(runningSS.getSprite(2, 14), 300);

		wait.addFrame(runningSS.getSprite(3, 14), 300);
                
                
                attackup = new Animation();
                               
                attackup.setAutoUpdate(true);
                
		attackup.addFrame(runningSS.getSprite(1, 22), 75);

		attackup.addFrame(runningSS.getSprite(4, 22), 75);

		attackup.addFrame(runningSS.getSprite(7, 22), 75);

		attackup.addFrame(runningSS.getSprite(10, 22), 75);
                
                attackup.addFrame(runningSS.getSprite(13, 22), 75);
                
                attackup.addFrame(runningSS.getSprite(16, 22), 75);
                
               
                
                
                attackleft = new Animation();
                
                attackleft.setAutoUpdate(true);
                

		attackleft.addFrame(runningSS.getSprite(1, 25), 75);

		attackleft.addFrame(runningSS.getSprite(4, 25), 75);

		attackleft.addFrame(runningSS.getSprite(7, 25), 75);

		attackleft.addFrame(runningSS.getSprite(10, 25), 75);
                
                attackleft.addFrame(runningSS.getSprite(13, 25), 75);
                
                attackleft.addFrame(runningSS.getSprite(16, 25), 75);
                
                
                attackright = new Animation();
                
                attackright.setAutoUpdate(true);
                
                
		attackright.addFrame(runningSS.getSprite(1, 31), 75);

		attackright.addFrame(runningSS.getSprite(4, 31), 75);

		attackright.addFrame(runningSS.getSprite(7, 31), 75);

		attackright.addFrame(runningSS.getSprite(10, 31), 75);
                
                attackright.addFrame(runningSS.getSprite(13, 31), 75);
                
                attackright.addFrame(runningSS.getSprite(16, 31), 75);
                
                
                attackdown = new Animation();
                
                attackdown.setAutoUpdate(true);
                

		attackdown.addFrame(runningSS.getSprite(1, 28), 75);

		attackdown.addFrame(runningSS.getSprite(4, 28), 75);

		attackdown.addFrame(runningSS.getSprite(7, 28), 75);

		attackdown.addFrame(runningSS.getSprite(10, 28), 75);
                
                attackdown.addFrame(runningSS.getSprite(13, 28), 75);
                
                attackdown.addFrame(runningSS.getSprite(16, 28), 75);

            }
	public static float x = 96f;

	public static float y = 228f;
        
        public static String WeaponName;

	public static int PlayerCurrentHP = 1000;
        
        public static int PlayerBaseAC = 1000;
        
        public static int PlayerBaseAtk = 1000;
        
        public static String PlayerWeaponName;
        
        public static int PlayerWeaponAtk = 1000;
        
        public static int PlayerWeaponAC;
       
	public static float speed = .4f;

	public static float PlayerhitboxX = x + 8f;

	public static float PlayerhitboxY = y + 8f;

        
        
        
	public static int startX, startY, width = 30, height = 42;

	public static Shape rect = new Rectangle(getplayershitboxX(),
			getplayershitboxY(), width, height);
        
      

	public static float pdelta;

	public static Animation playeranime;
        
    public static void setpdelta(float somenum) {

		pdelta = somenum;

	}

    public static float getpdelta() {

		return pdelta;

	}

	public static float getplayersX() {

		return x;

	}

	public static float getplayersY() {

		return y;

	}

	public static float getplayershitboxX() {

		return x + 18f;

	}

	public static float getplayershitboxY() {

		return y + 18f;

	}
       

	public static void setplayershitboxX() {

		PlayerhitboxX = getplayershitboxX();

	}

	public static void setplayershitboxY() {

		PlayerhitboxY = getplayershitboxY();

	}

}
    

