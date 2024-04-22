/**
 * This program tells the user what the minimum amount of quarters, dimes, nickels, and pennies are needed for a random number of cents that are between 1 and 99.
 *
 * Kylie Heiland
 * 
 * Project02
 * 
 * 2/1/2022
 */
import java.util.Scanner;
import java.util.Random; //So a random change between 1 and 99 is generated.

public class KylieHeilandProject02
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //Greets user
        System.out.println("Hello! Welcome to the program!");
        
        
        //User inputs change amount
        System.out.print("Enter a number of cents that are between 1 and 99: ");
        int change = input.nextInt();
        //System.out.println("You chose: " + change + " cents."); 
        
        
        //Program randomly chooses a number between 1 and 99, inclusive
        //int change = (int)(Math.random()* 99) + 1;
        
        //Copies the amount of change inputted from the user
        int amount = change;
        
        //Determines how many quarters go into the cents inputted from the user
        int quarters = amount / 25;
        amount = amount % 25;
        
        //Determines how many dimes go into the remaining cents inputted from the user
        
        int dimes = amount / 10;
        amount = amount % 10;
        
        //Determines how many nickels go into the remaining cents inputted from the user
        int nickels = amount / 5;
        amount = amount % 5;
        
        //Determines how many pennies go into the remaining cents inputted from the user
        int pennies = amount / 1;
        amount = amount % 1;
        
        //Outputs the minimum amount of change needed 
        System.out.println("Since you chose " + change + " cents, that will be:");
        System.out.print(quarters + " quarters, ");
        System.out.print(dimes + " dimes, ");
        System.out.print(nickels + " nickels,");
        System.out.println(" and " + pennies + " pennies!");
        
    }

}

/* RANDOM GENERATED OUTPUT:
Hello! Welcome to the program!
Since you chose 37 cents, that will be:
1 quarters, 1 dimes, 0 nickels, and 2 pennies!

USER GENERATED OUTPUT:
Hello! Welcome to the program!
Enter a number of cents that are between 1 and 99: 59
Since you chose 59 cents, that will be:
2 quarters, 0 dimes, 1 nickels, and 4 pennies!
 */
