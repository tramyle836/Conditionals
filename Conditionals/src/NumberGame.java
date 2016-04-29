import java.util.Scanner;
public class NumberGame
{
	static Scanner userInput = new Scanner(System.in);
	static int guess, ranNumber, randomNumber;
	static String name, number;  
	public static void main(String[] args) 
		{
		generateRandomNumber();
		greetPlayer();
		askForUserGuess();
		evaluateGuess();
		}
	public static void greetPlayer()
		{
		System.out.println("Hello there, what is your name?");
		String name = userInput.nextLine(); 
		}
	public static void generateRandomNumber()
		{
		int randomNumber = (int)(Math.random()*25)+1;
		}
	public static void askForUserGuess()
		{
		System.out.println("Hello" + name +"Guess a number between 1-25?");
		int guess = userInput.nextInt();
		}
	public static void evaluateGuess()
	{
		int randomNumber = (int)(Math.random()*25)+1;
		
		{	
		if (guess > randomNumber) 
		{
			System.out.println("No, too high!");	
		}
		else if (guess < randomNumber)
		{
			System.out.println("No, too low!");
		}
		else 
		{
			System.out.println("Winner!");
		}

		System.out.println("Keep guessing!");
		
		guess = userInput.nextInt();
	
		}
		System.out.println("You got it right!");
		}
}

