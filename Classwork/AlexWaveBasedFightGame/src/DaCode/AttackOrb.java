/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaCode;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author LightMajor
 */
public class AttackOrb {



    private static int postion;
    int x, y;
    
    private int AtkOrbTimeExist;

    private int postionX;
    private int postionY;
    boolean isVisible;
    public Image attackorbimage;
    public Shape AttackOrbHitBox;
    private int direction;

    public AttackOrb(int a, int b) throws SlickException {
        this.x = a;
        this.y = b;
        this.isVisible = false;
        this.attackorbimage = new Image("res/Power_Orbs/Ninja_9.jpg");
        this.AttackOrbHitBox = new Rectangle(a, b, 32, 32);
        this.AtkOrbTimeExist = 0;
    }
        public void Countdown(){
         this.AtkOrbTimeExist--;
        }
        /**
         * Getters and Setters are a common concept in Java. A desgin guideline
         * in java and object-oriented programming in general, is to
         * encapsulate/Isolate values as much as possible
         *
         * Getters - are methods used to query the value of instane variables
         *
         * Setters - are methods that set values for instance variables
         * orb1.setLocation(Player.x, Player.y);
         */

        

    

    public int getPostionX() {
        return postionX;
    }

    public void setPostionX(int postionX) {
        this.postionX = postionX;
    }

    public int getPostionY() {
        return postionY;
    }

    public void setPostionY(int postionY) {
        this.postionY = postionY;
    }

    public boolean isIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Image getAttackorbimage() {
        return attackorbimage;
    }

    public void setAttackorbimage(Image attackorbimage) {
        this.attackorbimage = attackorbimage;
    }

    public Shape getAttackOrbHitBox() {
        return AttackOrbHitBox;
    }

    public void setAttackOrbHitBox(Shape AttackOrbHitBox) {
        this.AttackOrbHitBox = AttackOrbHitBox;
    }

    public static int getPostion() {
        return postion;
    }

    public static void setPostion(int aPostion) {
        postion = aPostion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAtkOrbTimeExist() {
        return AtkOrbTimeExist;
    }

    public void setAtkOrbTimeExist(int AtkOrbTimeExist) {
        this.AtkOrbTimeExist = AtkOrbTimeExist;
    }
     public void setDirection(int i){
        this.direction = i;
    }
    public int getDirection(){
        return this.direction;
    }
}
