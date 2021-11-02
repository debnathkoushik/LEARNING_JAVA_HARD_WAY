// Problem Statement-:  There are two banks – Bank A and Bank B.
// Their interest rates vary. You have received offers from both banks in terms of the annual rate of interest, tenure, and variations of the rate of interest over the entire tenure.
// You have to choose the offer which costs you least interest and reject the other. Do the computation and make a wise choice.
// The loan repayment happens at a monthly frequency and Equated Monthly Installment (EMI) is calculated using the formula given below :

// EMI = loanAmount * monthlyInterestRate / ( 1 – 1 / (1 + monthlyInterestRate)^(numberOfYears * 12))


package Bank;

import java.util.Scanner;
import java.lang.Math;

public class BankDriver
{
    
    public static void main(String args[])
    {
    
        BankDriver bank_driver = new BankDriver();

        System.out.println("For Bank A\n");
        Bank bank_A = bank_driver.inputData();
        
        System.out.println("\n");

        System.out.println("For Bank B\n");
        Bank bank_B = bank_driver.inputData();

        double bank_A_final_emi = bank_driver.bankEMI(bank_A);
        double bank_B_final_emi = bank_driver.bankEMI(bank_B);

        if (bank_A_final_emi > bank_B_final_emi)
        {
            System.out.println("\nResult : Bank B");
        }

        else
        {
            System.out.println("\nResult : Bank A");
        }
        
    }


    Bank inputData()
    {
        Bank bank = new Bank();

        Scanner InputFromUser = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        bank.principal_amount = InputFromUser.nextDouble();

        System.out.print("Enter tenure (in years): ");
        bank.tenure = InputFromUser.nextDouble();
        
        if (bank.tenure > 0)
        {
            System.out.print("Enter interest rate for 1st year: ");
            bank.interest_rate_1 = InputFromUser.nextDouble();

            if (bank.tenure > 1)
            {
                System.out.print("Enter interest rate for 2nd year: ");
                bank.interest_rate_2 = InputFromUser.nextDouble();

                if (bank.tenure > 2)
                {
                    System.out.print("Enter interest rate for 3rd year onward: ");
                    bank.interest_rate_3 = InputFromUser.nextDouble();
                }
            }
        }

        return bank;

    }


    double bankEMI(Bank bank)
    {
        double emi = 0;

        if (bank.tenure > 0)
        {
            emi = ( bank.principal_amount * bank.interest_rate_1 / ( 1 - 1 / ( 1 + bank.interest_rate_1 ) * Math.pow( 1,12 )) );
            
            if (bank.tenure > 1)
            {
                emi += ( bank.principal_amount * bank.interest_rate_2 / ( 1 - 1 / ( 1 + bank.interest_rate_2 ) * Math.pow( 1,12 )) );

                if (bank.tenure > 3)
                {
                    emi += ( bank.principal_amount * bank.interest_rate_3 / ( 1 - 1 / ( 1 + bank.interest_rate_3 ) * Math.pow( (bank.tenure - 2), 12 )) );
                }

                else
                {
                    emi += ( bank.principal_amount * bank.interest_rate_3 / ( 1 - 1 / ( 1 + bank.interest_rate_3 ) * Math.pow( 1, 12 )) );
                }
            }
        }

        else
        {
            System.out.println("Years cannot be less than or equal to zero!");
        }

        return emi;
    } 

} 