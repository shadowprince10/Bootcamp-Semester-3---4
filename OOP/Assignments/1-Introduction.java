import java.util.Scanner;

public class main {

	private static Scanner scan;
	private static String firstNumberString;
	private static String secondNumberString;
	private static Character firstNumberChar;
	private static Character secondNumberChar;
	private static Float resultFloat;
	private static Integer firstSecondSum;
	private static Integer firstSecondSubtraction;
	private static Integer firstSecondMultiplication;
	private static Integer firstSecondDivision;
	private static Integer firstSecondModulo;
	private static String p1, p2;
	private static Boolean p1Bool, p2Bool;
	private static Boolean valid = true;

	public main() {
		// TODO Auto-generated constructor stub
	}
	
	public static void title()
	{
		System.out.println("  /$$$$$$$     /$$$$$                                     /$$$$$    /$$$$$$$  /$$$$$$$$                    /$$               /$$");          
        System.out.println("| $$__     $$   |__   $$                                  |__       $$ |  $$__  $$|__  $$__/                    |  $$                | $$");         
        System.out.println("| $$     \    $$         | $$                                          |     $$ | $$      \ $$      | $$      /$$$$$$    |  $$$$$$$     | $$      /$$$$$$");
        System.out.println("| $$$$$$$             | $$       /$$$$$$                  |     $$ | $$$$$$$/     | $$   |____     $$ |  $$__     $$ | $$   /$$__  $$");
        System.out.println("| $$__     $$ /$$  | $$      |______/       /$$  |      $$ | $$____/      | $$      /$$$$$$$ |  $$     \    $$ | $$|  $$$$$$$$");
        System.out.println("| $$  \       $$| $$  | $$                               | $$    |      $$ | $$                  | $$    /$$__    $$  |  $$      |    $$| $$| $$_____/");
        System.out.println("| $$$$$$$/|  $$$$$$/                            |     $$$$$$  /| $$                   | $$|      $$$$$$$|     $$$$$$$/| $$|    $$$$$$$");
        System.out.println("|_______/  \______/                             \______/ |__/                    |__/ \_______/|_______/    |__/ \_______/");
        
        for (int i = 0; i < 2; i++)
        {
        	System.out.println("");
        }
	}
	
	public static void pressEnter()
	{
		System.out.println("Press enter to proceed. .");
		scan.nextLine(); // similar to getchar() in C to catch one enter key from user
	}
	
	public static void displayMenu()
	{
		System.out.println("1. Start the Simulation!!");
		System.out.println("2. Close App");
	}
	
	public static void simulationMenu()
	{
		Integer firstNumber;
		Integer secondNumber;
		
		do
		{
			System.out.print("Input the first number [1 - 100](inclusive): ");
			firstNumber = scan.nextInt();
		} while (firstNumber < 1 || firstNumber > 100); scan.nextLine();
		
		do
		{
			System.out.print("Input the second number [1 - 100](inclusive): ");
			secondNumber = scan.nextInt();
		} while (secondNumber < 1 || secondNumber > 100); scan.nextLine();
		
		firstNumberString = firstNumber.toString();
		// convert the first number to string
		secondNumberString = secondNumber.toString();
		// convert the second number to string
		firstNumberChar = (char) (firstNumber + '0');
		// convert the third number string to character
		secondNumberChar = (char) (secondNumber + '0');
		// convert the second number string to character
		resultFloat = firstNumber.floatValue() / secondNumber.floatValue();
		// convert the result of division of first number and second number to float
		
		System.out.println("Table consisting of basic Java data types");
		System.out.println("+================================================================================================+");
		System.out.println("+    + (String type) 	| 		(Character Type)		 | 		* (Integer type) 	|		 / (Floating Type)		 |			input 1 == input 2 (Boolean Type) +");
		System.out.printf("+ %-4d + %-10d | %c %c | %5d | %5f | %10s", firstNumberString, secondNumberString, firstNumberChar, secondNumberChar, (firstNumber * secondNumber), resultFloat, (firstNumber == secondNumber));
		System.out.println("+================================================================================================+");
		pressEnter();
		
		firstSecondSum = firstNumber + secondNumber;
		firstSecondSubtraction = firstNumber - secondNumber;
		firstSecondMultiplication = firstNumber * secondNumber;
		firstSecondDivision = firstNumber / secondNumber;
		firstSecondModulo = firstNumber % secondNumber;
		System.out.println("Table consisting of basic arithmetic operation");
		System.out.println("+================================================================================================+");
		System.out.println("+Data Type		:		Integer																																																							  +");
		System.out.println("+================================================================================================+");
		System.out.println("+			+			|			-			|			*			|			/			|			%			|");
		System.out.println("+================================================================================================+");
		System.out.printf("+ %-3d | %-3d | %5d | %3d | %3d", firstSecondSum, firstSecondSubtraction, firstSecondMultiplication, firstSecondDivision, firstSecondModulo);
		System.out.println("+================================================================================================+");
		pressEnter();
		
		
		do {
			System.out.print("Give me value for p1 [true | false]: ");
			p1 = scan.nextLine();
		} while (p1 != "true" && p1 != "false"); scan.nextLine();
		
		do {
			System.out.print("Give me value for p2 [true | false]: ");
			p2 = scan.nextLine();
		} while (p2 != "true" && p2 != "false"); scan.nextLine();
		
		scan.close();
		
		p1Bool = Boolean.parseBoolean(p1); // convert string p1 to Boolean
		p2Bool = Boolean.parseBoolean(p2); // convert string p2 to Boolean
		
		System.out.println("+================================================================================================+");
		System.out.println("+Logical Table");
		System.out.println("+================================================================================================+");
		System.out.println("+ P1 = T  , P2 = F														+");
		System.out.println("+================================================================================================+");
		System.out.println("+			!P1			|				!P2				|				&&				|				||					+");
		System.out.printf("+ %-10s | %-10s | %10s | %10s |", !(p1Bool), !(p2Bool), (p1Bool && p2Bool), (p1Bool || p2Bool));
		System.out.println("+================================================================================================+");
		pressEnter();
	}
	
	public static void closeAppMenu()
	{
		System.out.println("Thank you for using the apps");
	}
	
	public static void mainMenu()
	{
		int menu;
		
		while (valid)
		{
			title();
			displayMenu();
			scan = new Scanner(System.in);
			do
			{
				System.out.print("Choice >> ");
				menu = scan.nextInt();
			} while (menu < 1 || menu > 2); scan.nextLine();
			
			scan.close();
		
			switch(menu)
			{
				case 1:
					simulationMenu();
					break;
				case 2:
					closeAppMenu();
					valid = false;
					scan.nextLine(); // similar to getchar() in C
					System.exit(0); // similar to exit(0) in C
					// System.exit(0): successfully exit out of Java Program
					// System.exit(nonzero value): unsuccessfully exit out of Java Program
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
 Resources:
 * https://www.homeandlearn.co.uk/java/java_formatted_strings.html#:~:text=printf(%20%22%25%2D15s%20%25,means%20fifteen%20characters%20left%2Djustified.
 * https://www.javatpoint.com/string-comparison-in-java
 * https://www.w3schools.com/java/ref_string_charat.asp
 * https://stackoverflow.com/questions/17984975/convert-int-to-char-in-java
 * https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html
 * https://www.tutorialspoint.com/java-program-to-convert-string-to-boolean#:~:text=To%20convert%20String%20to%20Boolean%2C%20use%20the%20parseBoolean()%20method,to%20the%20string%20%22true%22.
 */
