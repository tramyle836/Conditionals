import java.util.Scanner;
public class Conditional
{

	public static void main(String[] args) 
	{
	Scanner userInput = new Scanner(System.in);

	System.out.println("What do you do after school normally?");

	System.out.println("Type the number next to your answer:");

	System.out.println("(1) homework");

	System.out.println("(2) hang out");

	System.out.println("(3) other");
	
int choice = userInput.nextInt();
	
	if (choice == 1)
		{
		System.out.println("Oh that is so boring!");
		}
	else if (choice == 2)
		{
		System.out.println("Oh that is so fun!");
		}
	else 
		{
		System.out.println("Wow, maybe that sounds fun but I like to do other things!");
		}
	}
}

