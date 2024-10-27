package org.example;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Initialize variables
        int installmentNumber;
        double loanAmount = 1000;
        double interestRate = 0;
        double monthlyInstallment;

        // Get the input from user
        System.out.println("Input Installment number: ");
        installmentNumber = userInput.nextInt();

        System.out.println("Input loan amount: ");
        loanAmount = userInput.nextInt();

        // Count installment number and interest rate
        if ((installmentNumber >= 6) && (installmentNumber <=12)){
            interestRate = 0.025;
        } else if ((installmentNumber >= 13) && (installmentNumber <=24)){
            interestRate = 0.05;
        } else if ((installmentNumber >= 25) && (installmentNumber <=48)){
            interestRate = 0.1;
        }

        // Count montly installment rate and print it to standard output
        monthlyInstallment = (loanAmount / installmentNumber) + (loanAmount/installmentNumber) * interestRate;
        System.out.println(monthlyInstallment);
    }
}
