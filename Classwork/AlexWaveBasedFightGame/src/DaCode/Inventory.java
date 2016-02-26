/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaCode;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;


import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * @author LightMajor
 */
public class Inventory extends BasicGameState {
        private int MaxNumItems;
        private String InvDesc;
        private int NumberofItems;
        private String CurrentInv;
         public Inventory[] Basic;
         public Inventory[] Backpack;
         public Inventory[] TreasureChest;
         public Inventory[] StoreStock;
        private Item item;
        
        
         Inventory(){           

            
        if(CurrentInv.equals(Basic)){
    MaxNumItems = 4;
    InvDesc = "What you can carry with your hands";
    // NEED TO FINISH --->  NumberofItems = ?;  <-----  
        
    }
        else if(CurrentInv.equals(Backpack)){
    MaxNumItems = 25;
    InvDesc = "An old leather backpack used to store stuff on the go";
    // NEED TO FINISH --->  NumberofItems = ?;  <-----  
        
    }
        else if(CurrentInv.equals(TreasureChest)){
    MaxNumItems = 200;
    InvDesc = "A chest for storing your loot";
    // NEED TO FINISH --->  NumberofItems = ?;  <-----  
        
    }
       else if(CurrentInv.equals(StoreStock)){
    MaxNumItems = 200;
    InvDesc = "what the store has to offer";
    // NEED TO FINISH --->  NumberofItems = ?;  <-----  
        
    }
    }
        
        public void setMaxInventory(int MaxNumItems){
            this.MaxNumItems = MaxNumItems;
            Backpack = new Inventory[MaxNumItems];
            
        }
        public void AddItemtoInv(){
        // TO DO NOW   ----->  if(Maincode.player.intersects item)   <---------
            
        }

    public int getMaxNumItems() {
        return MaxNumItems;
    }

    public void setMaxNumItems(int MaxNumItems) {
        this.MaxNumItems = MaxNumItems;
    }

    public String getInvDesc() {
        return InvDesc;
    }

    public void setInvDesc(String InvDesc) {
        this.InvDesc = InvDesc;
    }

    public int getNumberofItems() {
        return NumberofItems;
    }

    public void setNumberofItems(int NumberofItems) {
        this.NumberofItems = NumberofItems;
    }

    public String getCurrentInv() {
        return CurrentInv;
    }

    public void setCurrentInv(String CurrentInv) {
        this.CurrentInv = CurrentInv;
    }

    public Inventory[] getBasic() {
        return Basic;
    }

    public void setBasic(Inventory[] Basic) {
        this.Basic = Basic;
    }

    public Inventory[] getBackpack() {
        return Backpack;
    }

    public void setBackpack(Inventory[] Backpack) {
        this.Backpack = Backpack;
    }

    public Inventory[] getTreasureChest() {
        return TreasureChest;
    }

    public void setTreasureChest(Inventory[] TreasureChest) {
        this.TreasureChest = TreasureChest;
    }

    public Inventory[] getStoreStock() {
        return StoreStock;
    }

    public void setStoreStock(Inventory[] StoreStock) {
        this.StoreStock = StoreStock;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public int getID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics grphcs) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   
    

