package Controller;

import Exceptions.WrongSelectionException;
import Sbi.ServiceImpl.HDFC;
//import Sbi.ServiceImpl.SBI;

import java.util.Scanner;

public class AdminController {
    public static void main(String args[]) throws WrongSelectionException {
        Scanner sc = new Scanner(System.in);
//        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();

        int select;

        try {
            boolean b = true;
            while (b) {
                System.out.println();
                System.out.println("========Menu========");
                System.out.println("1. Open Account");
                System.out.println("2. Display Account Details");
                System.out.println("3. Deposit Amount");
                System.out.println("4. Withdraw Amount");
                System.out.println("5. Display Account Balance");
                System.out.println("6. Update Profile Details");
                System.out.println("7. Exit The Application");
                System.out.println("Select One Of The Above Menu");
                select = sc.nextInt();


                switch (select) {
                    case 1:
//                    sbi.OpenAccount();
                        hdfc.OpenAccount();
                        break;

                    case 2:
//                    sbi.DisplayDetails();
                        hdfc.DisplayDetails();
                        break;

                    case 3:
//                    sbi.DepositAmount();
//                    sbi.DisplayBalance();
                        hdfc.DepositAmount();
                        break;

                    case 4:
//                    sbi.WithdrawAmount();
//                    sbi.DisplayBalance();
                        hdfc.WithdrawAmount();
                        break;

                    case 5:
//                    sbi.DisplayBalance();
                        hdfc.DisplayBalance();
                        break;

                    case 6:
                        hdfc.UpdateProfile();
                        break;

                    case 7:
                        System.out.println("Thank You for Visiting");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid data");

                }


            }
        } catch (Exception e) {
            e.printStackTrace();
//            throw new WrongSelectionException("Please select option from 1 to 7");

        }

    }
}
