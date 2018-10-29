/*****************************
 *  John Carfaro
 *  CSC_243
 *  Project 1
 *  October 27, 2018
 *  totalSaving.java
 *  Retirement Fund Calculator
 *  total time = 3 hours
 *
 *****************************/


import java.util.InputMismatchException;
import java.util.Scanner;
public class totalSaving {

	
	public static void main(String[] args) {
		 // TODO 
		char choice;	
		double intRate = 0.05;
		int annualSavings = 0;
		int yearsToRetirement = 0;
		// Create scanner object
		Scanner input = new Scanner(System.in);
		try {

			do{// Ask user for annual savings
			try {System.out.print("Please Enter annual savings: ");
			// Get that number
			
			int annualSaving = input.nextInt();
			//annualSavings = annualSaving;
			annualSavingWithException(annualSaving);}
			
			catch(InputMismatchException e2) {
				System.err.println("Error: intput must be greater than 1 ");
				System.err.println("Program failed.");
				System.exit(0);
			}
			// Ask user for years until retirement
			try {
			System.out.print("Please Enter years until retirement: ");
			// Get that number
			int yearsToRetire = input.nextInt(); 
			//yearsToRetirement = yearsToRetire;
			yearToRetireWithException(yearsToRetire);}
			
			catch(InputMismatchException e3) {
				System.err.println("Error: input must be between 0 and 120 ");
				System.err.println("Program failed.");
				System.exit(0);
			}
			// Calculate total savings
			int totSavings = annualSavings * yearsToRetirement; 
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
	    catch(InputMismatchException e1) {
			System.err.println("Error: choice input must be Y/N. ");
			System.err.println("Program failed.");
			System.exit(0);
	    }
	}
	public static int annualSavingWithException(int annualSaving)
	{
		if(annualSaving < 1)
			throw new InputMismatchException("Must save more than $1.00 per year.");
		
		return(annualSaving);
	}
	public static int yearToRetireWithException(int yearsToRetire)
	{
		if(yearsToRetire < 0 || yearsToRetire > 120)
			throw new InputMismatchException("Must retire in greater than 0 and less than 120 years.");
			
		return(yearsToRetire);
	}
}
