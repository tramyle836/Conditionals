import java.util.Scanner;
public class LoveStory
{

	public static void main(String[] args) 
	{
	Scanner userInput = new Scanner(System.in);

	System.out.println("Who is your favorite person?");

	System.out.println("Type his/hername:");

	System.out.println("(1) Ryan");

	System.out.println("(2) Me");

	System.out.println("(3) other");
	
	int choice = userInput.nextInt();
	
	if (choice == 1)
		{
		System.out.println("Wow he's such a nerd!");
		}
	else if (choice == 2)
		{
		System.out.println("Oh ya I would too!");
		}
	else 
		{
		System.out.println("Oh I don't know them but they sound nice!");
		}

	System.out.println("Do you love him/her?");
	
	System.out.println("Yes or No?:");

	System.out.println("(1) yes");

	System.out.println("(2) no");

	System.out.println("(3) other");
	

	int response = userInput.nextInt();
	
	if (response == 1)
		{
		System.out.println("Aw that is so sweet!");
		}
	else if (response == 2)
		{
		System.out.println("Oh that is creepy!");
		}
	else 
		{
		System.out.println("!");
		}
	

	}
}

