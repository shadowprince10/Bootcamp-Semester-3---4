import java.util.Scanner;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}
	
	static void pressEnter()
	{
		try (Scanner scan = new Scanner("System.in")) {
			System.out.println("Press enter to continue. .");
			scan.nextLine(); // similar to getchar() in C
		}
	}
	
	static void titleAndMenu()
	{
		System.out.println("Shoe Shop");
		System.out.println("========");
		System.out.println("1. View Shoes");
		System.out.println("2. Add Shoe");
		System.out.println("3. Delete Shoe");
		System.out.println("4. Exit");
	}
	
	static void viewShoesMenu()
	{
		
	}
	
	static void addShoeMenu()
	{
		String name;
		String category;
		int date;
		int month;
		int year;
		int price;
		
		Scanner scan = new Scanner("System.in");
		do
		{
			System.out.print("Input shoe's name[name ends with shoe, example: \"Fire shoe\"]");
			name = scan.nextLine(); scan.nextLine();
		} while (name.endsWith("shoe") == false);
		
		do
		{
			System.out.print("Input shoe's category[Sneaker | Running | Boot] (case sensitive): ");
			category = scan.nextLine(); scan.nextLine();
		} while (category.equals("Sneaker") == false && category.equals("Running") == false && category.equals("Boot") == false);
		
		do
		{
			System.out.print("Input shoe's release date[dd-mm-yyyy]: ");
			// scan date, month, year
		} while ((date < 1 || date > 30) || (month < 1 || month > 12) && (year < 2000 || year > 2020));
		
		// add shoe to the shoe list
		System.out.println("Shoe added!");
		pressEnter();
	}
	
	static void deleteShoeMenu()
	{
		
	}
	
	static void exitMenu()
	{
		System.out.println("Thank you for using this application!");
	}
	
	static void mainMenu()
	{
		titleAndMenu();
		boolean valid = true;
		int menu = 0;
		Scanner scan = new Scanner("System.in");
		
		while (valid)
		{
			do
			{
				try {
					System.out.print(">> ");
					menu = scan.nextInt(); scan.nextLine();
				} catch (Exception e) {
					System.out.println("The input should be numeric");
				}
			} while (menu < 1 || menu > 4);
			
			scan.close();
		
		
			switch(menu)
			{
				case 1:
					viewShoesMenu();
					break;
				case 2:
					addShoeMenu();
					break;
				case 3:
					deleteShoeMenu();
					break;
				case 4:
					exitMenu();
					valid = false;
					scan.nextLine();
					System.exit(0);
					break;
		}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainMenu();
	}

}

/* 
 RESOURCES:
 * https://stackoverflow.com/questions/3844595/how-can-i-make-java-print-quotes-like-hello#:~:text=print(%22%5C%22Hello%5C,r%22%20and%20%22%5Cn%22
 * https://stackoverflow.com/questions/26245468/what-does-scanner-close-do
 * https://beginnersbook.com/2013/12/java-string-endswith-method-example/#:~:text=Java%20String%20endsWith(String%20suffix,true%20else%20it%20returns%20false.
 * https://www.tutorialspoint.com/Case-sensitive-string-comparison-in-Java
 */
