package DaCode;

import org.newdawn.slick.state.*;

import java.io.IOException;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Random;

import java.util.logging.Level;

import java.util.logging.Logger;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;

import org.newdawn.slick.AppGameContainer;

import org.newdawn.slick.BasicGame;

import org.newdawn.slick.Font;

import org.newdawn.slick.GameContainer;

import org.newdawn.slick.Graphics;

import org.newdawn.slick.Image;

import org.newdawn.slick.Input;

import org.newdawn.slick.SlickException;

import org.newdawn.slick.SpriteSheet;

import org.newdawn.slick.TrueTypeFont;

import org.newdawn.slick.geom.Rectangle;

import org.newdawn.slick.geom.Shape;

import org.newdawn.slick.state.BasicGameState;

import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;

import org.newdawn.slick.tiled.TiledMap;
import org.w3c.dom.css.Rect;
import DaCode.Camera;
import DaCode.Item1;
import DaCode.Item2;
import DaCode.Item3;
import DaCode.Ninja;
import DaCode.Hero;

class blocked {

	public static boolean[][] blocked;

	public static boolean[][] getblocked() {

		return blocked;

	}

};






public class MainCode extends BasicGameState {
        public float StartAttackTime;
        public boolean AmIAttacking = false;
	public String Direction;
	public Item1 healthpotion, healthpotion1;
	public Item2 speedpotion, speedpotion1;
	public Item3 antidote;
        public Ninja A;
        public Ninja B;
        public Skeletons Skeleton1;
        public Skeletons Skeleton2;
        public static int PlayerHP;
        public static int EnemyHP;
        public static int PlayerCurrentHP;
        public static int EnemyCurrentHP;
        public static int PlayerDamageTaken;
        public static int EnemyDamageTaken;
        public static int Weapon;
        public static int Armor;
        public static int PlayerWeaponAtk;
        public static int PlayerArmorAC;
        public static int EnemyArmorAC;
        public static int EnemyAtk;
        public static int PlayerAtk;
        public static int EnemyBaseAC;
        public static int PlayerBaseAC;
        public static int EnemyAC;
        public static int PlayerAC;
        public static int PlayerBaseAtk = 0;
        public static int EnemyBaseAtk;
        public static int EnemyWeaponAtk;
        public static int Enemy;
        public static int longsword;
        public static int PlayerWeaponAC;
        public static int EnemyWeaponAC; 
        public static int WeaponAtk;
        public static String PlayerName;
        public static String PlayerArmorName;
        public static String PlayerWeaponName;
        public String EnemyName;
        public static String EnemyWeaponName;
        public static String EnemyArmorName; 
        public static String PlayerAction;
        public static String EnemyAction;
        public int XPearned;
        public int TotalXP;
        public int Level;
        public int GoldGained;
        public int GoldLost;
        public int TotalGold;
        public boolean isdead = false;
        public static Random EnemyAtkRandom = new Random();
        public static Random PlayerAtkRandom = new Random();
        public AttackOrb AtkOrbA;
        public static Hero hero;
        public static LongSword longsword1;
        public static LongSword longsword2;
        public Shape EnemyHitBox;
        public int TimeRun;
        public int WaveNumber;
        public int DeathGoldLost = WaveNumber*3 + 30 ;
        public Shape PlayerWeaponHitbox;
         public static void main(String[] arguments) {
             Inventory Backpack = new Inventory();
             Inventory Basic = new Inventory();
             Inventory TreasureChest = new Inventory();
             Inventory StoreStock = new Inventory();
            Item product = new Item();
            product.createItem("Boots", 325, 1);  
            product.createItem("Sword", 410, 3);  
            product.createItem("Ring", 110, 2);  
            product.createItem("Dagger", 240, 2);  
            product.createItem("Bow", 810, 1);

            product.displayItemList();

            Backpack.setMaxInventory(5);

        }
        
        
        
        public ArrayList<AttackOrb> AtkOrbList = new ArrayList();              
	public ArrayList<Item1> stuff = new ArrayList();
	public ArrayList<Item2> stuff1 = new ArrayList();	
	public ArrayList<Item3> stuffwin = new ArrayList();        
        public ArrayList<Ninja> ninja = new ArrayList();
        public ArrayList<Skeletons> skeleton = new ArrayList();


	private static TiledMap grassMap;
        
	private static AppGameContainer app;

	private static Camera camera;
	
	public static int counter = 0;
                

	private static final int SIZE = 64;

	private static final int SCREEN_WIDTH = 1000;

	private static final int SCREEN_HEIGHT = 750;

	public MainCode(int xSize, int ySize) {
            EnemyCurrentHP = EnemyHP - EnemyDamageTaken;
            PlayerDamageTaken = EnemyAtk - PlayerAC; 
            EnemyDamageTaken = PlayerAtk - EnemyAC;
            // NEED TO WORK ON
            PlayerAtk = PlayerBaseAtk + PlayerWeaponAtk;
            PlayerWeaponAtk = WeaponAtk + PlayerAtkRandom.nextInt();
            EnemyAtk = EnemyBaseAtk + EnemyWeaponAtk;
            PlayerAC = PlayerBaseAC + PlayerArmorAC; 
            EnemyAC = EnemyBaseAC + EnemyArmorAC;
            PlayerCurrentHP = PlayerHP - PlayerDamageTaken;
	}

	public void init(GameContainer gc, StateBasedGame sbg)
	throws SlickException {
		
		 gc.setTargetFrameRate(60);

		gc.setShowFPS(false);

		// *******************

		// Scenerey Stuff

		// ****************

		grassMap = new TiledMap("res/StartTown.tmx");

		System.out.println("Tile map is this wide: " + grassMap.getWidth());

		camera = new Camera(gc, grassMap);

		blocked.blocked = new boolean[grassMap.getWidth()][grassMap.getHeight()];

		// System.out.println("Map height:" + grassMap.getHeight());

		// System.out.println("Map width:" + grassMap.getWidth());

		// There can be more than 1 layer. You'll check whatever layer has the
		// obstacles.

		// You could also use this for planning traps, etc.

		// System.out.println("Number of tile layers: "
		// +grassMap.getLayerCount());

		System.out.println("The grassmap is " + grassMap.getWidth() + "by "
				+ grassMap.getHeight());

		for (int xAxis = 0; xAxis < grassMap.getWidth(); xAxis++) {

			for (int yAxis = 0; yAxis < grassMap.getHeight(); yAxis++) {

				// int tileID = grassMap.getTileId(xAxis, yAxis, 0);

				// Why was this changed?

				// It's a Different Layer.

				// You should read the TMX file. It's xml, i.e.,human-readable
				// for a reason

				int tileID = grassMap.getTileId(xAxis, yAxis, 1);

				String value = grassMap.getTileProperty(tileID,

				"blocked", "false");

				if ("true".equals(value)) {

					System.out.println("The tile at x " + xAxis + " andy axis "
							+ yAxis + " is blocked.");

					blocked.blocked[xAxis][yAxis] = true;

				}

			}

		}

		System.out.println("Array length" + blocked.blocked[0].length);

		healthpotion = new Item1(100, 100);
		healthpotion1 = new Item1(450, 400);
		stuff.add(healthpotion);
		stuff.add(healthpotion1);
		
		speedpotion = new Item2(100,150);
		speedpotion1 = new Item2(450,100);	
		stuff1.add(speedpotion);
		stuff1.add(speedpotion1);
		
		antidote = new Item3(3004,92);
		stuffwin.add(antidote);
                
                Skeleton1 = new Skeletons(32 , 32);
                Skeleton2 = new Skeletons(2000 , 2000);
                skeleton.add(Skeleton1);
                skeleton.add(Skeleton2);
                
                A = new Ninja(400 , 400);
                B = new Ninja(3200 , 400 );
                ninja.add(A);
                ninja.add(B);
                
                AtkOrbA =  new AttackOrb((int)Hero.x + 10,(int) Hero.y + 10);
                hero = new Hero();
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)

	throws SlickException {

		camera.centerOn((int) hero.x, (int) hero.y);

		camera.drawMap();

		camera.translateGraphics();
                
                AtkOrbA = new AttackOrb((int) hero.x, (int) hero.y);
                
                
                
          //     Hero.sprite.draw((int) hero.x, (int) hero.y);
                        

		// it helps to add status reports to see what's going on

		// but it gets old quickly

		// System.out.println("Current X: " +player.x + " \n Current Y: "+ y);
                if(AmIAttacking == false){
                        if (hero.sprite == hero.up){
                        hero.up.draw((int) hero.x, (int) hero.y);
                        }
                        else if (hero.sprite == hero.left){
                        hero.left.draw((int) hero.x, (int) hero.y);
                    }
                        else if (hero.sprite == hero.right){
                        hero.right.draw((int) hero.x, (int) hero.y);
                    }
                        else if(hero.sprite == hero.down){
                        hero.down.draw((int) hero.x, (int) hero.y);
                    }
                        else if(hero.sprite == hero.wait){
                        hero.wait.draw((int) hero.x, (int) hero.y);
                        }
                    }
                
                   else if (AmIAttacking == true){
                        if (hero.sprite == hero.up){
                        hero.attackup.draw((int) hero.x, (int) hero.y);
                        }
                        else if (hero.sprite == hero.left){
                        hero.attackleft.draw((int) hero.x, (int) hero.y);
                    }
                        else if (hero.sprite == hero.right){
                        hero.attackright.draw((int) hero.x, (int) hero.y);
                    }
                        else if(hero.sprite == hero.down){
                        hero.attackdown.draw((int) hero.x, (int) hero.y);
                    
                    }
                   }
                    
                    // else if 
                       // attack.draw
                    
                    
                    hero.rect.setLocation(hero.getplayershitboxX(),
				hero.getplayershitboxY());
//              Player.sprite.draw((int) Player.x, (int) Player.y);
                    
                    g.draw(LongSword.WeaponrectUP);
                    
		//g.drawString("x: " + (int)player.x + "y: " +(int)player.y , player.x, player.y - 10);

		g.drawString("Health: " + hero.PlayerCurrentHP/1000, camera.cameraX + 10,
				camera.cameraY + 10);
		
		g.drawString("speed: " + (int)(hero.speed *10), camera.cameraX + 10,
				camera.cameraY + 25);

		//g.draw(player.rect);

		g.drawString("time passed: " +counter/1000, camera.cameraX +600,camera.cameraY );
		// moveenemies();
                A.currentImage.draw(A.x , A.y);
                B.currentImage.draw(B.x , B.y);

                
                
                if(AtkOrbA.isIsVisible()){
                    if(AtkOrbA.getAtkOrbTimeExist()>0){
                        AtkOrbA.setX(AtkOrbA.getX() +5);
                        AtkOrbA.setY(AtkOrbA.getY() +5);
                        AtkOrbA.AttackOrbHitBox.setX(AtkOrbA.getX());
                        AtkOrbA.AttackOrbHitBox.setY(AtkOrbA.getY());
                        AtkOrbA.Countdown();
                    }
                    AtkOrbA.attackorbimage.draw(AtkOrbA.getX(), AtkOrbA.getY());
                }                
                
                for (Item1 i : stuff) {
			if (i.isvisible) {
				i.currentImage.draw(i.x, i.y);
				// draw the hitbox
				//g.draw(i.hitbox);

			}
		}
		
		
		for (Item2 h : stuff1) {
			if (h.isvisible) {
				h.currentImage.draw(h.x, h.y);
				// draw the hitbox
				//g.draw(h.hitbox);

			}
		}
		
		for (Item3 w: stuffwin) {
			if (w.isvisible) {
				w.currentImage.draw(w.x, w.y);
				// draw the hitbox
				//g.draw(w.hitbox);

			}
		}
		//for (Ninja w: ninja) {
		//	if (w.isvisible) {
		//		w.currentImage.draw(w.x, w.y);
				// draw the hitbox
		//		g.draw(w.hitbox);

		//	}
	//	}
             //   		for (Skeletons w: skeleton) {
		//	if (w.isvisible) {
		//		w.currentanime.draw(w.Bx, w.By);
				// draw the hitbox
				//g.draw(w.hitbox);
// }}
//                if(AtkOrbA){
//                    
//                }
//                
//                
//                
//                
       
                
			}
		
	

	public void update(GameContainer gc, StateBasedGame sbg, int delta)

	throws SlickException {
		
                
            
		counter += delta;

		Input input = gc.getInput();

		float fdelta = delta * hero.speed;

		hero.setpdelta(fdelta);

		double rightlimit = (grassMap.getWidth() * SIZE) - (SIZE * 0.75);

		// System.out.println("Right limit: " + rightlimit);

		float projectedright = hero.x + fdelta + SIZE;

		boolean cangoright = projectedright < rightlimit;

                if (input.isMousePressed(Input.MOUSE_LEFT_BUTTON)){
                    AmIAttacking = true;
                   StartAttackTime = counter;
                    if (hero.sprite == hero.up){
                        if (AmIAttacking){
                            if(PlayerWeaponName.equals("Longsword")){
                                hero.AmIAtkLongsword = true;
                               hero.sprite.update(delta);
                            }
                    
                  
                    //sprite = attackup; 
                    //g.draw(WeaponrectUP);
                    
                    
                    // AmIAttacking = false;
                        }
                        
                    }
                
                
                 else if (hero.sprite == hero.left) {
                       if (AmIAttacking){
                    
                   // sprite = attackleft;
                    
                    hero.sprite.update(delta);
                }
               }
                 else if ( hero.sprite == hero.right) {
                    if (AmIAttacking){
                    
                     
                 //  sprite = attackright;
                    
                    hero.sprite.update(delta);
                }
                 }
                else if (hero.sprite == hero.down) {
                      if (AmIAttacking){
                    
                    //sprite = attackdown;
                    
                    hero.sprite.update(delta);
                }
                }
                }
		if (input.isKeyDown(Input.KEY_UP)) {

			hero.sprite = hero.up;

			float fdsc = (float) (fdelta - (SIZE * .15));

			if (!(isBlocked(hero.x, hero.y - fdelta) || isBlocked((float) (hero.x + SIZE + 1.5), hero.y - fdelta))) {

				hero.sprite.update(delta);

				// The lower the delta the slower the sprite will animate.

				hero.y -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_DOWN)) {

			hero.sprite = hero.down;

			if (!isBlocked(hero.x, hero.y + SIZE + fdelta)

			|| !isBlocked(hero.x + SIZE - 1, hero.y + SIZE + fdelta)) {

				hero.sprite.update(delta);

				hero.y += fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_LEFT)) {

			hero.sprite = hero.left;

			if (!(isBlocked(hero.x - fdelta, hero.y) || isBlocked(hero.x

			- fdelta, hero.y + SIZE - 1))) {

				hero.sprite.update(delta);

				hero.x -= fdelta;

			}

		} else if (input.isKeyDown(Input.KEY_RIGHT)) {

			hero.sprite = hero.right;

			// the boolean-kludge-implementation

			if (cangoright
					&& (!(isBlocked(hero.x + SIZE + fdelta,

					hero.y) || isBlocked(hero.x + SIZE + fdelta, hero.y
							+ SIZE - 1)))) {

				hero.sprite.update(delta);

				hero.x += fdelta;
                                
                                
               

			} // else { System.out.println("Right limit reached: " +
				// rightlimit);}

		}
                
                else if (input.isKeyDown(Input.KEY_SPACE)){
                    AtkOrbA.setPostionX((int) hero.x);
                    AtkOrbA.setPostionY((int) hero.y);
                    AtkOrbA.setPostionX(AtkOrbA.getPostionX());
                    AtkOrbA.setPostionY(AtkOrbA.getPostionY());
                    AtkOrbA.setIsVisible(!AtkOrbA.isIsVisible());
                    
                    
                }
                
		
           //     if(AtkOrbA.isIsVisible()){
             //       AtkOrbA.attackorbimage.draw();
       //         }
                
                
                for (Skeletons e : skeleton){
                    if(AtkOrbA.AttackOrbHitBox.intersects(e.rect)){
                        e.isvisible = false;
                    }
                }
                
                
		for (Ninja n : ninja) {

			if (hero.rect.intersects(n.hitbox)) {
				System.out.println("yay");
				if (n.isvisible) {

					hero.PlayerCurrentHP += 10000;
					n.isvisible = false;
				}

			}
		}
                
                for (Item1 i : stuff) {

			if (hero.rect.intersects(i.hitbox)) {
				//System.out.println("yay");
				if (i.isvisible) {

					hero.PlayerCurrentHP += 10000;
					i.isvisible = false;
				}

			}
		}
		
		for (Item2 h : stuff1) {

			if (hero.rect.intersects(h.hitbox)) {
				//System.out.println("yay");
				if (h.isvisible) {

					hero.speed += .1f;
					h.isvisible = false;
				}

			}
		}
		
		for (Item3 w : stuffwin) {

			if (hero.rect.intersects(w.hitbox)) {
				//System.out.println("yay");
				if (w.isvisible) {
					w.isvisible = false;
					makevisible();
					sbg.enterState(3, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
					
				}

			}
		}
                 if (AtkOrbA.isIsVisible()) {
            if (AtkOrbA.getAtkOrbTimeExist() > 0) {
                if (AtkOrbA.getDirection() == 0) {
                    AtkOrbA.setX((int) hero.x);
                    AtkOrbA.setY(AtkOrbA.getY() - 5);
                } else if (AtkOrbA.getDirection() == 2) {
                    AtkOrbA.setX((int) hero.x);
                    AtkOrbA.setY(AtkOrbA.getY() + 5);
                } else if (AtkOrbA.getDirection() == 3) {
                    AtkOrbA.setX(AtkOrbA.getX() - 5);
                    AtkOrbA.setY(AtkOrbA.getY());
                } else if (AtkOrbA.getDirection() == 1) {
                    AtkOrbA.setX(AtkOrbA.getX() + 5);
                    AtkOrbA.setY(AtkOrbA.getY());
                }
                AtkOrbA.AttackOrbHitBox.setX(AtkOrbA.getX());
                AtkOrbA.AttackOrbHitBox.setY(AtkOrbA.getY());
                AtkOrbA.Countdown();
            } else {
                AtkOrbA.setIsVisible(false);
            }
        }
            
		 
		hero.PlayerCurrentHP -= counter/1000;
		if(hero.PlayerCurrentHP <= 0){
			makevisible();
			sbg.enterState(2, new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
		}
                if (counter >= StartAttackTime + 500){
                    AmIAttacking = false;
                }
                

	}

	public int getID() {

		return 1;

	}

	public void makevisible(){
		for (Item2 h : stuff1) {
			
		h.isvisible = true;}
		
		for (Item1 i : stuff) {
			
			i.isvisible = true;}
		}
	
	private boolean isBlocked(float tx, float ty) {

		int xBlock = (int) tx / SIZE;

		int yBlock = (int) ty / SIZE;

		return blocked.blocked[xBlock][yBlock];

		// this could make a better kludge

	}
        
        
       
        
        public void CalculateDamage(){
             counter++;
             TotalGold = GoldGained + TotalGold;
             TotalXP = XPearned + TotalXP;
            

           if(hero.WeaponName.contains("Longsword") ){
            
                 if(hero.sprite.equals (hero.up)){
                         
               if(LongSword.WeaponrectUP.intersects(Skeletons.rect)){
                EnemyName = "Skeleton";
                PlayerAction = "Physical";
                EnemyHP = Skeletons.SkeletonHP;
                EnemyCurrentHP = Skeletons.SkeletonCurrentHP;
                EnemyDamageTaken = Skeletons.SkeletonDamageTaken;
                if (PlayerAtk > EnemyAC){
                   if(EnemyCurrentHP  == EnemyHP){    
                    EnemyCurrentHP = EnemyHP - EnemyDamageTaken;
                   }
                
                    else if(EnemyCurrentHP > EnemyHP){
                        EnemyCurrentHP = EnemyCurrentHP - EnemyDamageTaken;
                    }
                }
                else if (PlayerAtk <= EnemyAC){
               System.out.println("Miss");         
                        }
              System.out.println(" You Dealt " + EnemyDamageTaken + " Damage ");
                              

               }
                 }
           }
        }
        
        public void BattleRewardsandPunishments(){
           
          if (EnemyCurrentHP <= 0){
             if(EnemyName.equals("Skeleton")){
                    XPearned = Skeletons.SkeletonXPworth;
                    GoldGained = Skeletons.SkeletonGoldworth;
             }
                System.out.println(" You have Gained " + GoldGained  + " and " + XPearned);
                              }
               else if(PlayerCurrentHP <= 0){
                    if(EnemyName.equals("Skeleton")){
                            GoldLost = DeathGoldLost;
                        
                        
                    System.out.println("You have been defeated by " + EnemyName  );
                    System.out.println(" You lost " + GoldLost );
                        }
                    }
            

                 
           
}
        public void AfterCalculateDamage(){
         if(counter == 1){
         LongSword.WeaponBoxLocationUPX = LongSword.WeaponhitboxXUP;
         LongSword.WeaponBoxLocationUPY = LongSword.WeaponhitboxYUP;        
         LongSword.WeaponBoxLocationLEFTX = LongSword.WeaponhitboxXLEFT;        
         LongSword.WeaponBoxLocationLEFTY = LongSword.WeaponhitboxYLEFT;        
         LongSword.WeaponBoxLocationRIGHTX = LongSword.WeaponhitboxXRIGHT;        
         LongSword.WeaponBoxLocationRIGHTY = LongSword.WeaponhitboxYRIGHT;       
         LongSword.WeaponBoxLocationDOWNX = LongSword.WeaponhitboxXDOWN;
         LongSword.WeaponBoxLocationDOWNY = LongSword.WeaponhitboxYDOWN;
             counter = 0;
             
         }
        }   
                     
          
             public void OrbMovement(){
  
        if(Hero.sprite == Hero.up){
	AtkOrbA.y = AtkOrbA.y + 5;
	TimeRun++;
     if(TimeRun >= 10){
	AtkOrbA.x = 20000;
	AtkOrbA.y = 20000;
}
            
            
        }
   
    }    
        
           
        
           
        
           
        
           



}

  


      //  void swingy (float thetime){
        //    while (thetime <= thetime + 500){
          //      sprite = attackup; 
           
            


