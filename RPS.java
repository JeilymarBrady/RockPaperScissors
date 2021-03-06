/*
Name:  Jeilymar Brady
Assignment:   4
Title: Rock, Paper, Scissors
Course: CSCE144 
Section: 1 - Hauser
Lab Section: 2 - Hauser
Semester: Spring 2014 
Instructor: Hauser
Date: 6 March 2014
Sources consulted:   
Known Bugs: none
Program Description: 
Creativity: 
Instructions: javac RPS.java then java RPS then follow onscreen instructions
*/

import java.util.Scanner;

public class RPS
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); 
		
		
		//identifier declarations
		String name ;			//first name
		String lower ;
		String upper ;
		String properName ;
		
		String cipher ;
		
		int vowelCount = 0 ;		//vowel count
		int consonantCount = 0 ;	//consonant count
		String backwards = "" ;		//name backwards
		String lower1 ;
		String upper1 ;
		
		String playerChoice ;		//player choice
		int compChoice ;
		int playerWins = 0;		//player wins
		int compWins = 0 ;		//comp wins
		int ties = 0 ;			//ties
		
		
		//display a greeting - prompt for user's first name
		System.out.println("Welcome to Rock, Paper, Scissors!") ;
		System.out.print("Please enter your firstname: ") ;
		name = keyboard.nextLine() ;
		lower = name.toLowerCase() ;
		upper = name.toUpperCase() ;
		properName = upper.charAt(0) + lower.substring(1) ;

		for ( int k = 0; k < name.length(); k++) {
			if ( name.charAt(k) == 'a' || name.charAt(k) == 'e' || name.charAt(k) == 'i' || name.charAt(k) == 'o' || name.charAt(k) == 'u' )  
				vowelCount++ ;
		}
				
		consonantCount = name.length() - vowelCount ;
			
				
		//name backwards
		for ( int i = 0; i < name.length(); i++ ) {
			backwards  = name.charAt(i) + backwards ;
		}
		
		lower1 = backwards.toLowerCase() ;
		upper1 = backwards.toUpperCase() ;
		backwards = upper1.charAt(0) + lower1.substring(1) ;
		
		
		//show analysis
		System.out.println( "\n" + properName + ", your name has " + vowelCount + " vowels and " + consonantCount + " consonants in it. " ) ; 
		
		
		//isPalindrome?
		if ( lower.equalsIgnoreCase(lower1) ) {
			System.out.print( "Your name is a palindrome. " ) ;
		} else 
			System.out.print( "Your name is not a palindrome. " ) ;
		System.out.println("Spelled backwards, your name is " + backwards + ".\n" ) ;
		
		
		//game rules
		System.out.println( "\nOkay, " + properName + ", here are the rules to the game:\n" ) ;
		System.out.println( "(1) Both of us will choose one of the following: rock, paper, or scissors.\n" ) ;
		System.out.println( "(2) The winner is chosen based on the algorithm below:\n" ) ;
		System.out.println( "\tRock breaks Scissors - Rock wins\n\tScissors cuts Paper - Scissors wins\n\tPaper wraps Rock - Paper wins\n" ) ;
		System.out.println( "(3) If there is a tie, that round is played again\n" ) ;
		System.out.println( "(4) The game will continue until one player wins twice\n" ) ;
		System.out.println( "Let's Get Started!\n" ) ;
		
		
		//game time! Rock-Paper-Scissors
		while ( playerWins < 2 && compWins < 2 ) {
			System.out.println( "Current Scores: Your wins = " + playerWins + " My wins = " + compWins + " Ties = " + ties ) ;
			System.out.println( "Enter your choice: " ) ;
			playerChoice = keyboard.nextLine() ;
			
			while (! ( playerChoice.equalsIgnoreCase("rock") || playerChoice.equalsIgnoreCase("paper") || playerChoice.equalsIgnoreCase("scissors") ) ) {
				System.out.print("Invalid choice, please try again. ") ;
				playerChoice = keyboard.nextLine() ;
			
			}
			
			compChoice = (int) (Math.random()*3) ;
				if ( playerChoice.equalsIgnoreCase( "rock" ) ) {
					if ( compChoice == 0 ) {
						System.out.println("My choice was rock. We tied.\n") ;
						ties++ ;
					} else if 
						( compChoice == 2 ) {
						System.out.println("My choice was paper. I won!\n") ;
						compWins++ ;
					} else {
						System.out.println("My choice was scissors. You won!\n") ;
						playerWins++ ;
					}
				} else if ( playerChoice.equalsIgnoreCase( "scissors" ) ) {
					if ( compChoice == 1 ) {
						System.out.println("My choice was scissors. We tied.\n") ;
						ties++ ;
					} else if 
						( compChoice == 0 ) {
						System.out.println("My choice was rock. I won!\n") ;
						compWins++ ;
					} else {
						System.out.println("My choice was paper. You won!\n") ;
						playerWins++ ;
					}
				} else 
					if ( compChoice == 2 ) {
						System.out.println("My choice was paper. We tied.\n") ;
						ties++ ;
					} else if 
						( compChoice == 1 ) {
						System.out.println("My choice was scissors. I won!") ;
						compWins++ ;
					} else {
						System.out.println("My choice was rock. You won!\n") ;
						playerWins++ ;
					}
						
			
				}		
		
		
		//final results
		
		if (  playerWins == 2 || compWins == 2 ) {
		System.out.println( "FINAL SCORES: Your wins = " + playerWins + " My wins = " + compWins + " Ties = " + ties ) ;
		
			if ( playerWins == 2 ) {
				System.out.println( "You won!" ) ;
			} else 
				System.out.println( "I won!" ) ;
			
		}
		
		
			
			
		
		
	}
}
		

