import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class bsGameFinal
{
   public static void main(String[] args)
   {
         System.out.println("Let's play Battleship! ");
         game();         
   }
   public static void game()
   {
      try{
            
            computer();
            System.out.println(); 
            player();
         }catch(InputMismatchException e)
            {
                  System.out.println("Please enter a valid input:");
                  game();
            }catch(NumberFormatException e)
             {
                  System.out.println("Please enter a valid input:");
                  game();
             }
   }
   public static void player()
   {
      char[][] player = new char[10][10];
      
      for(int c = 0; c < player.length; c++)
      {
         for(int r = 0; r < player[0].length; r++)
         {
               player[c][r] = '#';
         }
      }
      System.out.println("Computer's turn");
      printGrid(player);
        
        Shipplayer (player, 1);
        Shipplayer (player, 2);
        Shipplayer (player, 1);
        Shipplayer (player, 2);
        Shipplayer (player, 2);
        Shipplayer (player, 3);
        Shipplayer (player, 3);
        
       
       System.out.println(); 
      System.out.println("Player's board");
      printGrid(player); 
   }

  public static void Shipplayer(char[][] arr, int size)
   {
   
      if(Math.random() < 1.0)
      {
         int col = (int)(Math.random() * size) ;
         int row = (int)(Math.random() * size);
         
         
         for(int i = 0; i <= size; i++)
         {
            arr[row][col + i] = 'S';
         }
      }
      else
      {
         int col = (int)(Math.random() * size);
         
         int row = (int)(Math.random() * size);
         
         for(int i = 0; i <=size; i++)
         {
            arr[row + 1][col] = 'S';
            
         }   
      }
   }
   public static void printGrid(char[][] arr)
   {
      for(int i = 0; i < arr.length; i++)
      {
         for(int j = 0; j < arr[0].length; j++)
         {
            System.out.print(arr[i][j] + "\t");
         }
         System.out.println();
      }
   }
   public static void computer()
   {
   
      Scanner kbd = new Scanner(System.in);

      char[][] computer = new char[10][10];
      
      for(int c = 0; c < computer.length; c++)
      {
         for(int r = 0; r < computer[0].length; r++)
         {
               computer[c][r] = '#';
         }
      }
      System.out.println("Player's turn");
      
      printGrid(computer);
      
      System.out.print("Enter x coordinate between 0 - 9: ");
      int x, y;

   try{   
       
        x = kbd.nextInt();
      while(x > 9 || x < 0)
      {
         
         System.out.print("Enter x coordinates again between 0 - 9: ");
         x = kbd.nextInt();
      }
      
       System.out.print("Enter y coordinate between 0 - 9: ");
       y = kbd.nextInt();
        
      while(y > 9 || y < 0)
      {
         System.out.print("Enter y coordinates again between 0 - 9: ");
         y = kbd.nextInt();
      }
   }catch(InputMismatchException e){
           kbd.nextInt();
      }
        Shipcomputer(computer, 1);
        Shipcomputer(computer, 2);
        Shipcomputer(computer, 1);
        Shipcomputer(computer, 2);
        Shipcomputer(computer, 2);
        Shipcomputer(computer, 3);
        Shipcomputer(computer, 3);
        System.out.println("");
        
      System.out.println("Computer's board");
      printGrid(computer);
   
   }
   public static void Shipcomputer(char[][] arr, int size)
   {
   
      if(Math.random() < 0.5)
      {
         int col = (int)(Math.random() * size) ;
         int row = (int)(Math.random() * size);
         
         
         for(int i = 0; i <= size; i++)
         {
            arr[row][col + i] = 'S';
         }
      }
      else
      {
         int col = (int)(Math.random() * size);
         
         int row = (int)(Math.random() * size);
         
         for(int i = 0; i <=size; i++)
         {
            arr[row + 1][col] = 'S';
            
         }   
      }
      
   }
}
