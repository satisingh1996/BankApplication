package Controller;

import Sbi.ServiceImpl.HDFC;
import Sbi.ServiceImpl.SBI;

import java.util.Scanner;

public class AdminController {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        SBI sbi=new SBI();
        HDFC hdfc=new HDFC();

        int select;

        do
        {
            System.out.println();
            System.out.println("========Menu========");
            System.out.println("1. Open Account");
            System.out.println("2. Display Accound Balance");
            System.out.println("3. Display Account Details");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Withdraw Amount");
            System.out.println("6. Update Profile Details");
            System.out.println("7. Exit The Application");
            System.out.println("Select One Of The Above Menu");
            select=sc.nextInt();

            switch (select)
            {
                case 1:
//                    sbi.OpenAccount();
                    hdfc.OpenAccount();
                    break;

                case 2:
                    sbi.DisplayBalance();
                    break;

                case 3:
                    sbi.DisplayDetails();
                    break;

                case 4:
                    sbi.DepositAmount();
                    sbi.DisplayBalance();
                    break;

                case 5:
                    sbi.WithdrawAmount();
                    sbi.DisplayBalance();
                    break;

                case 6:
                    break;

                case 7:
                    System.out.println("Thank You for Visiting");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid data");
            }

        }
        while (select<8);

    }

}
