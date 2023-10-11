
/* NAME: Alean Rodriguez
   DATE: 01/25/2022 (Date the program was created/last modified)
   ASSIGNMENT #2
   PROGRAM: assign2
   Description: This programs purpose to present sales for 5 employees
   and shows the calculation of the bonus amount for each employee. The 
   program will ask the user to enter the employee name, YTD Sales amount,
   and the Bonus Rate. The Dialog Box is used to ask for the user input and
   the results are displayed on the console.
*/

// This imports the usage of the scanner that will read the user input.
import java.util.Scanner;

public class assign2 {

	public static void main(String[] args) {
		
		//This will declare the employee name variables, YTD Sales variables, and the Bonus Rate variables. It will also declare the Bonus Amount variable.
		
		
		String employee1;
		
		String employee2;
		
		String employee3;
		
		String employee4;
		
		String employee5;
		
		
		double YTD1;
		
		double YTD2;
		
		double YTD3;
		
		double YTD4;
		
		double YTD5;
		
		
		double BonusR1;
		
		double BonusR2;
		
		double BonusR3;
		
		double BonusR4;
		
		double BonusR5;
		
		
		double BonusA1;
		
		double BonusA2;
		
		double BonusA3;
		
		double BonusA4;
		
		double BonusA5;
		
		
		// In the following statements below, I am creating a scanner that will read the users input while also prompting the user to input the 5 employee names.
		
		System.out.println("Enter the 5 Employee names");
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		employee1 = scanner.nextLine();
		
		employee2 = scanner.nextLine();
		
		employee3 = scanner.nextLine();
		
		employee4 = scanner.nextLine();
		
		employee5 = scanner.nextLine();
		
		
		//Below are the statements that prompt the user to input the 5 YTD Sales.
		
		System.out.println("Enter the 5 YTD Sales");
		
		YTD1 = scanner.nextDouble();
		scanner.nextLine();
		
		YTD2 = scanner.nextDouble();
		scanner.nextLine();
		
		YTD3 = scanner.nextDouble();
		scanner.nextLine();
		
		YTD4 = scanner.nextDouble();
		scanner.nextLine();
		
		YTD5 = scanner.nextDouble();
		scanner.nextLine();
		
		//Below are the statements that prompt the user to input 5 Bonus Rate values. It makes it such they do not need to input the % sign nor write it in a decimal format.
		
		System.out.println("Input Bonus Rate (%) (IE: 2 = 2%)");
		
		BonusR1 = scanner.nextDouble();
		scanner.nextLine();
		
		BonusR2 = scanner.nextDouble();
		scanner.nextLine();
		
		BonusR3 = scanner.nextDouble();
		scanner.nextLine();
		
		BonusR4 = scanner.nextDouble();
		scanner.nextLine();
		
		BonusR5 = scanner.nextDouble();
		scanner.nextLine();
		
		
		//Below are the calculations that determine the value of the BonusAmount. They are each divided by 100 to makeup for not inputing a decimal format when inputting.
		
		BonusA1 = YTD1 * BonusR1/100;
		
		BonusA2 = YTD2 * BonusR2/100;
		
		BonusA3 = YTD3 * BonusR3/100;
		
		BonusA4 = YTD4 * BonusR4/100;
		
		BonusA5 = YTD5 * BonusR5/100;
		
		
		
		
		/*Below are the statements that output the final result. It has included the correct symbols for each of the variables as shown in the given example. It also include the indentation as well.
		*/
		System.out.println(String.format("%-15s%-10s%-10s%-10s", "Employee Name", "YTD Sales", "Bonus Rate", "Bonus Amount")); 
		
		System.out.println(String.format("%-15s%-10.2f%-10.0f%%%-%-10.2f",  employee1, YTD1, BonusR1, BonusA1));
		
		System.out.println(String.format("%-15s%-10.2f%-10.0f%-10.2f",  employee2, YTD2, BonusR2, BonusA2));
		
		System.out.println(String.format("%-15s%-10.2f%-10.0f%-10.2f",  employee3, YTD3, BonusR3, BonusA3));
		
		System.out.println(String.format("%-15s%-10.2f%-10.0f%-10.2f",  employee4, YTD4, BonusR4, BonusA4));
		
		System.out.println(String.format("%-15s%-10.2f%-10.0f%-10.2f",  employee5, YTD5, BonusR5, BonusA5));
		
		
		

		
	

	
	
	
	
	
	
	
	
	
	
	
	
	

		
	}
}
