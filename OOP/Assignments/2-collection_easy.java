import java.util.Scanner;

public class main {

	private static String username;

	public main() {
		// TODO Auto-generated constructor stub
		
	}
	
	static void title()
	{
		System.out.println("BJ - SHARE");
		System.out.println("=====================================");
	}
	
	static void displayMenu()
	{
		System.out.println("+======================+");
		System.out.println("+Options							 					+");
		System.out.println("+======================+");
		System.out.println("+1. Start Sharing								+");
		System.out.println("+2. Update Participant					+");
		System.out.println("+3. Delete Participant					+");
		System.out.println("+4. Close App										+");
		System.out.println("+======================+");
	}
	
	static void startSharingMenu()
	{
		int number = 0, shareNumber = 0;
		username = null;
		try (Scanner scan = new Scanner(System.in)) {
			do
			{
				try {
					System.out.print("Input a number [0 - 100]: ");
					number = scan.nextInt(); scan.nextLine();
				} catch (Exception e) {
					System.out.println("Input must be numeric");
				}
			} while (number < 0 || number > 100);
			
			do
			{
				System.out.print("Could you give me your username [5 - 20 characters] ?");
				username = scan.nextLine(); scan.nextLine();
			} while (username.length() < 5 || username.length() > 20);
			
			do
			{
				System.out.print("You share number : ");
				shareNumber = scan.nextInt(); scan.nextLine();
			} while (shareNumber < 0 || shareNumber > 100);
			
			scan.close();
		}
		
	}
	
	static void updateParticipantMenu()
	{
		// coming soon;	
	}
	
	static void deleteParticipantMenu()
	{
		// coming soon;
	}
	
	static void viewResults()
	{
		System.out.println("Here's the completed share list");
		System.out.println("Remember, sharing is caring, happy sharing :D");
		System.out.println("+======================================+");
		System.out.println("+ Share List																					+");
		System.out.println("+======================================+");
		System.out.println("+ Username 					| Before 	| 					After				+");
		System.out.println("+======================================+");
		// the username of participants sorted in ascending order
		// the participants' share number shuffled and order reversed
		System.out.println("+======================================+");
	}
	
	static void mainMenu()
	{
		title();
		displayMenu();
		boolean valid = true;
		int menu;
		
		Scanner scan = new Scanner(System.in);
		
		while (valid)
		{
			do
			{
				System.out.print("Choice >> ");
				menu = scan.nextInt();
			} while (menu < 1 || menu > 4); scan.nextLine();
			
			scan.close();
		
			switch(menu)
			{
				case 1:
					startSharingMenu();
					break;
				case 2:
					updateParticipantMenu();
					break;
				case 3:
					deleteParticipantMenu();
					break;
				case 4:
					viewResults();
					valid = false;
					scan.nextLine();
					System.exit(0); // exit program successfully (similar to exit(0) in C)
					break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    		mainMenu();
	}

}
