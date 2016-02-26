/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaCode;

/**
 *
 * @author LightMajor
 */
public class Item {
    //Maximum Items allowed
        private int maxItems = 5;
        public int ItemID;
        Item[] itemDB = new Item[maxItems];

        //Item related
        private int id;
        String name;
        int price;
        int quantity;

        Item(){
            id = 0;
        }

        private Item(String name, int price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        private void idAutoIncrement(){    
            id = id + 1;
        }

        private void setItemID(){
            itemDB[id].id = id;
        }

        void createItem(String name, int price, int quantity){
           if (id < maxItems){        
                itemDB[id] = new Item(name, price, quantity);
                setItemID();
                idAutoIncrement();
           } else {
               System.out.println("You have riched the maximum item limit.");
           }
        }

        void queryItem(int id){
            System.out.println(itemDB[id].id + " " + itemDB[id].name + " " +
                    itemDB[id].price + " " + itemDB[id].quantity);
        }

        void displayItemList(){
            System.out.println("ID " + "Name " + "Price " + "Quantity ");
            for (int i = 0; i < id; i++){
                System.out.println(itemDB[i].id + " " + itemDB[i].name + " " +
                        itemDB[i].price + " " + itemDB[i].quantity);
            }
        }
     }
}
    