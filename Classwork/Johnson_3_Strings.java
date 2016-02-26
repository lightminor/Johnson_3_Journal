/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson_3_strings;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LightMajor
 */
public class Johnson_3_Strings {
    private static Object name;
    static String username;
    static int Realnumber;
    static int UserNumber;
    static Random TheOne = new Random();
    static Boolean TryAgain;
    static int Lives;
    static String UserAnswer;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        TryAgain = true;
        Realnumber = TheOne.nextInt(100);
        
        
        System.out.println("Hello, what is your name");
        Scanner userinputname = new Scanner(System.in);
        username = userinputname.nextLine();
        if (username.equals("Mr.Davis")) {
             System.out.println("La vida esta llena de dolor ");
        } else {
             System.out.println("Hello " + username + " and welcome to the world of chance ");
        }
             //userinputname.nextLine();
             
          while (TryAgain){
       playthegame();
   
        
        Lives = 5;
              while (Lives > 0){
             playthegame(); 
             Lives--;
        }
          }      
        }
     
          
    static void playthegame(){
        Scanner userinputnumbers = new Scanner (System.in);
         System.out.println("Please pick a number between 1 and 100");
        UserNumber = userinputnumbers.nextInt();
        if (username.equals("Mr.Davis")) {

          
         if (UserNumber == Realnumber){
           System.out.println("Why you do HAX  " + username );
            
         } else 
           System.out.println("HAHA beat you again " + username );
         }
        else {
            
            if (UserNumber == Realnumber){
                System.out.println("Good Job " + username + " You Win");
                System.out.println(" Would you like to try again? ");
               Scanner userinputplay = new Scanner(System.in);
                UserAnswer = userinputplay.nextLine();
                if (UserAnswer.equals("Yes")){
                  System.out.println(" YAY lets play ");
              }
                playthegame();
              if (UserAnswer.equals("No")){
                  TryAgain = false;
                  System.out.println(" Aww , well see ya ");
                  Lives = 5;
              }
            }
              
                 
                
            }
            System.out.println("Aww Nice try " + username);
            
            
            if (UserNumber > Realnumber){
                System.out.println("But that was too high ");
            }
            
            
            else if (UserNumber < Realnumber){
                System.out.println("But that was too low ");
            }
            
            if (Lives == 5){
                System.out.println("You have 4 lives left ");
            }
            
            if (Lives == 4){
                System.out.println("You have 3 lives left ");
            }
            
            if (Lives == 3){
                System.out.println("You have 2 lives left ");
            }
            
            if (Lives == 2){
                System.out.println("You only have 1 life left ");
                  System.out.println("Sorry But you lose ");
                System.out.println("Would you like to try again? ");
                Scanner userinputplay2 = new Scanner(System.in);
                UserAnswer = userinputplay2.nextLine();
                if (UserAnswer.equals("Yes")){
                  System.out.println(" YAY lets play ");
              }
              
              if (UserAnswer.equals("No")){
                  TryAgain = false;
                  System.out.println(" Aww , well see ya ");
                  Lives = 5;
              }
            }
             if (Lives == 1){
              
                
            }
            } 
            
            }
            
            
            
        
            
                 
   
    
    

