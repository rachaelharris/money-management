/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board;

import java.util.Random;
import java.util.Scanner;

public class Board {
    
public static int smoney = 500;
public static int savings;
public static int mspent;
public static int current;
public static int total_moves;
public static int blocks[] = new int[17]; 
public static Scanner sc = new Scanner(System.in);  // Create a Scanner object


   
 public static void main(String[] args) {

        System.out.println("Welcome to the Money Management GAME!");
        System.out.println("RULES:");
        System.out.println("Each player starts with $500, if you manage to spend all your money before reaching the finish you lose");
        System.out.println("The game is 2 player. The goal is to get from Start to Finish with the most money possible.\nThere are 15 numbered blocks (1-15), plus Start (0) and Finish.");
        System.out.println("Certain blocks are marked as \"SPEND\"(3,7,11,13). When the player lands on one of these blocks, one of the following may happen:");
        System.out.println("• Groceries $100\n• Bills $200 \n• Back to Start\n•    Surprise win (move to Finish)");
        System.out.println("The player begins the game at 'START (position 0) and \"rolls the die\" (6 sided) and moves the number of blocks indicated.");
        System.out.println("The player wins when they move past the last block to the Finish area.");
        


        // if the block is money spent, it will have value 1, otherwise it is 0 by default
        blocks[3] = 1;
        blocks[7] = 1;
        blocks[11] = 1;
        blocks[13] = 1;
        // print the board map
        print_board_map();
        //start the game.
        reset_game();
        MoneyTracker(0,false);


        }

   //helper function to print the board map.
   static void print_board_map(){
       System.out.println("\nYou are at Start. Here is a map of the board:");
       for(int i=0;i<17;i++){
           System.out.print("\nBlock "+i+": ");
           if(i==0){
               System.out.print("START");
            }
           else if(blocks[i]==1){
               System.out.print("SPEND!");
           }
           else if(i==blocks.length-1){
               System.out.print("FINISH\n");
           }
       }
   }
 
 
    // helper function to reset the global variables when we start a new game
    static void reset_game(){
        current = 0 ;
        //in starting of game,total moves are -1,because when we call
        // go_ahead() function for the first time, it will increment the total_moves value by 1. 
        total_moves = -1;
    }
    
    //helper function to handle the case of Win.
    static void surprise_win(){
        System.out.println("Congratulations! You've reached the finish line! YOU SPENT "+mspent+"in "+total_moves+" moves.\nWant to try to beat this [Y] or [N]?");
        char input = sc.next().charAt(0);   // Read user input
        if(input=='y'|| input=='Y'){
            //if user want to play again, reset the game and play it again.
            reset_game();
            print_board_map();
            MoneyTracker(0,false);
        }
        //if user do not want to play the game anymore.
        else{
            System.out.println("Thanks For Playing! BYE!!");
            System.exit(0);
        }
    }


   //helper function to generate random interger in a given range
    static int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
    
    public static void MoneyTracker(int value, boolean isMoneySpent){
    
            current += value;
        if(isMoneySpent == false){
            
            total_moves+=1;
        }
        if(current<16){
        System.out.println("You are now at block "+current);}
        //when we reached to finish.
        else{
            System.out.println("You Finished.");
        }
        
        //if we are at final block or at beyond the finish block. we won the game
        if(current>=16){
           surprise_win();
        }
        // if current block is a money spent block
        else if(blocks[current]==1){
            System.out.print("SPEND!!");
            //generate a random number between 1 to 4
            int shmoney = getRandomNumberInRange(1,4);
            if(shmoney==1){
                // spend 100
                System.out.println("You have to eat right Groceries $100");
                MoneyTracker(smoney - 100,true);
                mspent = 100;
            }
            else if(shmoney==2){
                //spend 200
                System.out.println("Bills need to be paid $200.");
                MoneyTracker(smoney - 200,true);
                mspent = 200;

            }
            else if(shmoney==3){
                //go back to start.
                System.out.println("Back to start");
                MoneyTracker(current*(-1),true);
            }
            else if(smoney < 0){
            System.out.println("Thanks For Playing! BYE!!");
            System.exit(0);
            }
            else{
                //surprice win function call
                System.out.println(" You won a Surprise win.!!");
                surprise_win();
            }

        }
        //if current block is normal block, go to next move
        else{
           //repeat the game chance again.
           System.out.print("\nHit enter to Roll the Dice.");
           sc.nextLine();
           value = getRandomNumberInRange(1,6);
           System.out.println("You rolled a "+value);
           //we are calling go_ahead from a normal bloack,hence we will pass second argument as false.
           MoneyTracker(value,false);
        }

    }
        
        
    
    

    

    

       
}
    
    

