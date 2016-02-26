/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaCode;

import java.util.Random;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import static DaCode.Hero.PlayerhitboxX;

/**
 *
 * @author LightMajor
 */
public class LongSword {
    public static String PlayerWeaponName = "longsword";
    public int WeaponAtk = 10;
    public int PlayerWeaponAC = 2;
    public Random PlayerAtkRandom = new Random(10);
    public static float x = MainCode.hero.x;
    public static float y = MainCode.hero.y;
    public int LongswordEnchantDamage = 0;
    

     
    
        static float WeaponhitboxXUP = MainCode.hero.PlayerhitboxX;
        
        static float WeaponhitboxYUP = MainCode.hero.PlayerhitboxY + 32;
        
        static float WeaponhitboxXLEFT = MainCode.hero.PlayerhitboxX - 32;
        
        static float WeaponhitboxYLEFT = MainCode.hero.PlayerhitboxY;
        
        static float WeaponhitboxYRIGHT = MainCode.hero.PlayerhitboxY;
        
        static float WeaponhitboxXRIGHT = MainCode.hero.PlayerhitboxX + 32;
        
        static float WeaponhitboxXDOWN = MainCode.hero.PlayerhitboxX;
       
        static float WeaponhitboxYDOWN = MainCode.hero.PlayerhitboxY - 32;
        
        
        
        
    
        static float WeaponBoxLocationUPX = WeaponhitboxXUP;
        
        static float WeaponBoxLocationUPY = WeaponhitboxYUP;
        
        static float WeaponBoxLocationLEFTX = WeaponhitboxXLEFT;
        
        static float WeaponBoxLocationLEFTY = WeaponhitboxYLEFT;
        
        static float WeaponBoxLocationRIGHTX = WeaponhitboxXRIGHT;
        
        static float WeaponBoxLocationRIGHTY = WeaponhitboxYRIGHT;
        
        static float WeaponBoxLocationDOWNX = WeaponhitboxXDOWN;
       
        static float WeaponBoxLocationDOWNY = WeaponhitboxYDOWN;
        
        
        public static float longswordwidth = 32;
                
        public static float longswordheight = 32;
                
          public static Shape WeaponrectUP = new Rectangle(WeaponBoxLocationUPX,WeaponBoxLocationUPY, 32 , 32);
          
          public static Shape WeaponrectLEFT = new Rectangle(WeaponBoxLocationLEFTX,WeaponBoxLocationLEFTY, 32 , 32);
           
          public static Shape WeaponrectRIGHT = new Rectangle(WeaponBoxLocationRIGHTX,WeaponBoxLocationRIGHTY, 32 , 32);
            
          public static Shape WeaponrectDOWN = new Rectangle(WeaponBoxLocationDOWNX,WeaponBoxLocationDOWNY, 32 , 32);

          
           public static float getWeaponhitboxXUP(){
            return WeaponhitboxXUP;
        }
            public static float getWeaponhitboxYUP(){
            return WeaponhitboxYUP;
        }
              public static float getWeaponhitboxXLEFT(){
            return WeaponhitboxXLEFT;
        }
            public static float getWeaponhitboxYLEFT(){
            return WeaponhitboxYLEFT;
        }
              public static float getWeaponhitboxXRIGHT(){
            return WeaponhitboxXRIGHT;
        }
            public static float getWeaponhitboxYRIGHT(){
            return WeaponhitboxYRIGHT;
        }
              public static float getWeaponhitboxXDOWN(){
            return WeaponhitboxXDOWN;
        }
            public static float getWeaponhitboxYDOWN(){
            return WeaponhitboxYDOWN;
        }
         
     
}
