import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter wage: ");
        int wage = scnr.nextInt();

        System.out.println("Enter amount of hours worked: ");
        int hours = scnr.nextInt();

        System.out.println("Enter amount of days worked: ");

        int days = scnr.nextInt();

        System.out.println("Enter savings account total before check: ");
        double savingsTotal = scnr.nextDouble();

        System.out.println("Enter checking total before check: ");
        double checkingTotal = scnr.nextDouble();

        double paycheckTotal =(wage * hours * days * 2);
        double finalPay;

        System.out.println("Enter desired tax deduction from check, average is about 15 percent.");
        double taxAmount = scnr.nextDouble();
        finalPay = (paycheckTotal * taxAmount);

        double finalChecking = finalPay + checkingTotal;


        System.out.println("This is your final pay for the week: " + finalPay);

        System.out.print("Would you like to add funds to savings?, If so, type  'yes' or 'no: ");

       String funds = scnr.nextLine();

       if (funds.equals("yes"))
        {
            System.out.println("Okay, what amount in percent would you like to send to your savings? ");
            double savingPercent = scnr.nextDouble();
            //still calculate new savings with savings percent added from check
             savingPercent = savingPercent * finalPay;

             savingsTotal = savingsTotal + savingPercent;
             System.out.println("Savings final total: " + savingsTotal);
             System.out.println("Checking final total: " + finalChecking);

        }


       else
       {
           System.out.println("Okay, your final total with the paycheck in your checking is: " + finalChecking);
           System.out.println("Final total in savings is: " + savingsTotal);
       }


    }
}