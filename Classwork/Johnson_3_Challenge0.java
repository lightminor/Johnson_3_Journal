/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson_3_challenge0;

/**
 *
 * @author LightMajor
 */
public class Johnson_3_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for(int i = 0; i < 500; i++){
             Davis(i);
             System.out.println();
             
             Claughton(i);
             System.out.println();   
             
             Vidal(i);           
             System.out.println();
         }
        // TODO code application logic here
    }
    static String Davis(int somenumber){
        String returnStatement = "";
        if(somenumber % 22 == 0){
           returnStatement = "ninja";
        } else if(somenumber % 2 == 0) {
            returnStatement = "Davis";
        }
        return returnStatement;
    }
    
        static String Claughton(int somenumber){
        String returnStatement = "";
        if(somenumber % 22 == 0){
           returnStatement = "Herr Direktor";
        } else if(somenumber % 2 == 0) {
            returnStatement = "Claughton";
        }
        return returnStatement;
        }
        
        static String Vidal(int somenumber){
        String returnStatement = "";
        if(somenumber % 22 == 0){
           returnStatement = "Animate This";
        } else if(somenumber % 2 == 0) {
            returnStatement = "Vidal";
        }
        return returnStatement;
    }
        
        
        static String TeamBuilding(int somenumber){
            String returnStatement = "";
            if (somenumber % 2 == 0 && somenumber % 3 == 0 && somenumber % 5 == 0){
                returnStatement = "Team Building";
        }
          return returnStatement;
        }
        static String Chisme(int somenumber){
            String returnStatement = "";
            if (somenumber % 2 == 0 && somenumber % 3 == 0){
                returnStatement = "Chisme";
        }
          return returnStatement;
        }
        static String Oldschool(int somenumber){
            String returnStatement = "";
            if (somenumber % 3 == 0 && somenumber % 5 == 0){
                returnStatement = "Old School";
        }
          return returnStatement;
        }
            


}

