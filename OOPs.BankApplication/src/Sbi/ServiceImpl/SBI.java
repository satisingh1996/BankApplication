//package Sbi.ServiceImpl;
//
//import Sbi.Model.Account;
//import Sbi.Service.RBI;
//
//import java.util.Scanner;
//
//public class SBI implements RBI {
//    Account account = new Account();
//    Scanner sc = new Scanner(System.in);
//    int balanceAmount = 0, depositAmount, withdrawAmount;
//
//    public void OpenAccount() {
//
//        System.out.println("======Creating Account======");
//
//        System.out.print("\tEnter Your Name: ");
//        String names = sc.nextLine();
//
//        System.out.print("\tEnter Your Mobile Number: ");
//        int mobile = sc.nextInt();
//        if (mobile != 10) {
//            System.out.println("Please enter 10 digit Mobile Number");
//        } else {
//            System.out.print("\tEnter Your Mobile Number: ");
//            mobile = sc.nextInt();
//        }
//
//        System.out.print("\tEnter Your Email Id: ");
//        String email = sc.next();
//
//        System.out.print("\tEnter Your Gender: ");
//        String gender = sc.next();
//
//        System.out.print("\tEnter Your City: ");
//        String city = sc.next();
//
//        System.out.print("\tEnter Your Account Number: ");
//        int accountNo = sc.nextInt();
//        if (accountNo != 11) {
//            System.out.println("Please enter 11 digit Account Number");
//        } else {
//            System.out.print("\tEnter Your Account Number: ");
//            accountNo = sc.nextInt();
//        }
//
//        System.out.print("\tEnter Account Pin: ");
//        int pin = sc.nextInt();
//        if (pin != 4) {
//            System.out.println("Please enter 4 digit Pin");
//        } else {
//            System.out.print("\tEnter Account Pin: ");
//            pin = sc.nextInt();
//        }
//
//        System.out.println("\tBranch Names : ");
//        System.out.println("\t1. Pune");
//        System.out.println("\t2. Nashik");
//        System.out.println("\t3. Mumbai");
//        System.out.print("\tEnter Branch Number: ");
//        int branches = sc.nextInt();
//
//        switch (branches) {
//            case 1:
//                account.setBranch("Pune");
//                System.out.println("Your branch is " + account.getBranch());
//                break;
//
//            case 2:
//                account.setBranch("Nashik");
//                System.out.println("Your branch is " + account.getBranch());
//                break;
//
//            case 3:
//                account.setBranch("Mumbai");
//                System.out.println("Your branch is " + account.getBranch());
//                break;
//
//            default:
//                System.out.println("Invalid data please select the proper branch");
//                break;
//        }
//
//
//        System.out.print("\tEnter Pan Number: ");
//        String pan = sc.next();
//
//        account.setName(names);
//        account.setMobile(mobile);
//        account.setPan(pan);
//        account.setAccount(accountNo);
//        account.setPin(pin);
//        account.setCity(city);
//        account.setGender(gender);
//        account.setGmail(email);
//
//    }
//
//    @Override
//    public void DisplayDetails() {
//        System.out.println("\tName: " + account.getName() +
//                "\n\tMobile Number: " + account.getMobile() +
//                "\n\tGmail: " + account.getGmail() +
//                "\n\tGender: " + account.getGender() +
//                "\n\tCity: " + account.getCity() +
//                "\n\tAccount Number: " + account.getAccount() +
//                "\n\tAccount Pin: " + account.getPin() +
//                "\n\tBranch Name: " + account.getBranch() +
//                "\n\tPan Number: " + account.getPan()
//        );
//    }
//
//    @Override
//    public void UpdateProfile() {
//
//    }
//
//    public void DepositAmount() {
//        System.out.print("\tEnter Amount for Deposit: ");
//        depositAmount = sc.nextInt();
//
//        System.out.println("\tAmount deposited: " + depositAmount);
//        if (depositAmount > 0) {
//            balanceAmount = balanceAmount + depositAmount;
//        }
//    }
//
//    public void WithdrawAmount() {
//        System.out.print("\tEnter Amount for Withdraw: ");
//        withdrawAmount = sc.nextInt();
//
//        System.out.println("\tAmount withdrawal: " + withdrawAmount);
//        if (withdrawAmount > 0 && withdrawAmount < balanceAmount) {
//            balanceAmount = balanceAmount - withdrawAmount;
//        }
//
//    }
//
//    public void DisplayBalance() {
//
//        System.out.println("\tCurrent Balance is " + balanceAmount);
//
//    }
//}
//
