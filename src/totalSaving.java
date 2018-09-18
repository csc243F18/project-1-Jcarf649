/*****************************
 * 
 *
 *
 *
 *
 *
 *
 *****************************/

import java.util.Scanner;
public class totalSaving {

	
	public static void main(String[] args) {
		 // TODO 
		char choice;	
		double intRate = 0.05;
		// Create scanner object
		Scanner input = new Scanner(System.in);
		do{// Ask user for annual savings
		System.out.print("Please Enter annual savings: ");
		// Get that number
		int annualSaving = input.nextInt();
		// Ask user for years until retirement
		System.out.print("Please Enter years until retirement: ");
		// Get that number
		int yearsToRetire = input.nextInt();
		// Calculate total savings
		int totSavings = annualSaving * yearsToRetire; 
		// Calculate interest 
		double totalInterest = totSavings * intRate;
		// Calculate total fund
		double totalRetirement = totSavings + totalInterest;
		// Return total retirement fund value to user.
		System.out.println("------------------------------------------");
		System.out.println("Calculated Compound Interst is $" + (int)(totalInterest) + ".00");
		System.out.println("Calculated Total Savings is $" + (int)(totSavings) + ".00");
		System.out.println("Calculated Retirement Fund is $" + (int)(totalRetirement) + ".00");
		System.out.println("------------------------------------------");
		System.out.println("Would you like to do another calculation? (Y/N): ");
		System.out.print("Enter Y for yes or N for no: ");
        choice = input.next().charAt(0);
        
		}
		while ((choice == 'y') || (choice == 'Y'));
		if ((choice == 'N')||(choice == 'n')) {
			input.close();
			System.exit(0);
		}
		
	}
}
