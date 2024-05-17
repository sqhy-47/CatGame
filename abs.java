import java.util.Scanner;
import java.util.Random;
public class abs {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        // cat1.attack(cat2); // using sample atk method to show how the target thing would work
        Cat1 cat1 = new Cat1(null, null, 100, 80);
        botcat botcat = new botcat();
        
        // ask for name
        System.out.println("Welcome to the world of CaR Master! You are about to enter into a FIGHT. Please enter the name your cat:");
        String catname1 = scnr.nextLine();
        cat1.setName(catname1);

        System.out.println("Nice to meet you " + cat1.getName() + ". Your opponent is: " + "Mr. " + botcat.getName());

    
        System.out.println("Before you get into the fight, would you like to know any of Mr. Xiaohei's attributes?"); 
        String choice = scnr.nextLine();
        if(choice.equals("yes")){
            while(true){
            System.out.println("Would you like to know Xiaohei's strength or health");
            String stats = scnr.nextLine();
            if(stats.equals("strength")) {
                System.out.println(botcat.getName() + "'s strength is " + botcat.getStrength());
            } 
            else if (stats.equals("health")){
                System.out.println(botcat.getHealth());
            }
            else
                break; 
            }
        }
        System.out.println("Ok! Let's start, you have two skills: paws(damage 10) and cuteness(damage 50)"); 
        // rounds keep going until a cat dies
        while(cat1.getHealth() > 0 || botcat.getHealth() > 0) {
            System.out.println("How will you attack " + botcat.getName() + "? paws or cuteness?");
            String playerMove = scnr.nextLine();
            if (playerMove.equals("paws")){
                botcat.damagebypaw();
            }
            if(playerMove.equals("cuteness")){
                botcat.damagebycuteness();
            }
            // bot makes their moves
            // int randomNum = min + (int)(Math.random() * ((max – min) + 1));
            int botChoice = 1 + (int)(Math.random()) * ( ((2 - 1) + 1));
            if (botChoice == 1) {
                cat1.damagebypaw();
            }
            else if (botChoice == 2) {
                cat1.damagebycuteness();
            }
            if(cat1.getHealth() <= 0 || botcat.getHealth() <= 0) {
                break;
            }
        }      
        }
        }
        
    

        

        // while(!choice.equals("surrender")) {
        //     System.out.println("please choose the action for the cat to take with the number: ");
            
        //     System.out.println("1 - damage by paws");
        //     System.out.println("2 - damage by cuteness");
        //     System.out.println("3 - surrender");
        // }
        // }
        

