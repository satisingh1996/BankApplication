package Sbi.ServiceImpl;

import Sbi.Model.Account;
import Sbi.Service.RBI;

import java.util.Scanner;
import java.util.regex.*;

public class HDFC implements RBI {
    Account account1 = new Account();
    Scanner sc = new Scanner(System.in);

    @Override
    public void OpenAccount() {

        System.out.println("============Account creating============");

        String name = getValidName();
        account1.setName(name);

        String email = getValidEmail();
        account1.setGmail(email);

        int gender = getValidGender();

        String city = getValidCity();
        account1.setCity(city);

        String pan = getValidPan();
        account1.setPan(pan);

        int branch = getValidBranch();

        String pin = getValidPin();
        account1.setPin(pin);

        String account = getValidAccount();
        account1.setAccount(account);

        String mobile = getValidMobile();
        account1.setMobile(mobile);

    }

    private int getValidBranch() {
        System.out.println("Select Your Branch name");
        System.out.println("1. Pune");
        System.out.println("2. Mumbai");
        System.out.println("3. Bangalore");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                account1.setBranch("Pune");
                System.out.println("Your branch name is " + account1.getBranch());
                break;
            case 2:
                account1.setBranch("Mumbai");
                System.out.println("Your branch name is " + account1.getBranch());
                break;
            case 3:
                account1.setBranch("Bangalore");
                System.out.println("Your branch name is " + account1.getBranch());
                break;
            default:
                System.out.println("Please select any one of them");
                return getValidBranch();
        }
        return select;
    }

    private String getValidPan() {
        System.out.println("Enter your Pan Card Number");
        String pan = sc.next();
        String regex = "^[A-Z]{5}\\d{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pan);

        if (pan.length() == 10 && matcher.matches()) {
            return pan;
        } else {
            System.out.println("Pan number should be 10 digit in alphanumeric");
            return getValidPan();
        }

    }

    private String getValidCity() {
        System.out.println("Enter your City");
        String city = sc.next();
        if (city.length() > 2 && city.length() < 10) {
            return city;
        } else {
            System.out.println("Character should be more than 2 or less than 10 digit");
            return getValidCity();
        }
    }

    private int getValidGender() {
        System.out.println("Select your Gender");
        System.out.println("1. Male");
        System.out.println("2. Female");
        int gender = sc.nextInt();

        switch (gender) {
            case 1:
                account1.setGender("Male");
                System.out.println("Your Gender is " + account1.getGender());
                break;
            case 2:
                account1.setGender("Female");
                System.out.println("Your Gender is " + account1.getGender());
                break;
            default:
                System.out.println("Please select any one of them");
                return getValidGender();
        }
        return gender;
    }

    private String getValidPin() {
        System.out.println("Enter your ATM Pin");
        String pin = sc.next();
        String atmPin = pin.replaceAll("[^0-9]", "");

        if (atmPin.length() == 4) {
            return atmPin;
        } else {
            System.out.println("Please enter 4 digit pin");
            return getValidPin();
        }
    }

    private String getValidAccount() {
        System.out.println("Enter your Account Number");
        String account = sc.next();
        String accountNumber = account.replaceAll("[^0-9]", "");

        if (accountNumber.length() == 11) {
            return accountNumber;
        } else {
            System.out.println("Please enter 11 digit account number");
            return getValidAccount();
        }
    }

    private String getValidEmail() {
        System.out.println("Enter your Gmail");
        String email = sc.next();

        if (email.endsWith("@gmail.com") || email.endsWith("@yahoo.com")) {
            return email;
        } else {
            System.out.println("Please enter @gmail.com or @yahoo.com at the end of email");
            return getValidEmail();
        }

    }

    private String getValidMobile() {
        System.out.println("Enter your mobile number");
        String mobile = sc.next();
        String mobileNumber = mobile.replaceAll("[^0-9]", "");

        if (mobileNumber.length() == 10 && (mobileNumber.startsWith("7") ||
                mobileNumber.startsWith("8") || mobileNumber.startsWith("9"))) {
            return mobileNumber;
        } else {
            System.out.println("Please enter 10 digit mobile number & it will starts with 7,8,9");
            return getValidMobile();
        }

    }

    private String getValidName() {

        System.out.println("Enter your name");
        String name = sc.next();

        if (name.length() > 2 && name.length() < 20) {
            return name;

        } else {
            System.out.println("Please enter at least 3 character name and less than 20 character");
            return getValidName();
        }
    }

    int balance = 0, deposit, withdraw;

    @Override
    public void DisplayBalance() {
        System.out.println("Your Current Balance is " + balance);

    }

    @Override
    public void DisplayDetails() {

        System.out.println("\n\tName:\t" + account1.getName() +
                "\n\tMobile:\t" + account1.getMobile() +
                "\n\tGmail:\t" + account1.getGmail() +
                "\n\tGender:\t" + account1.getGender() +
                "\n\tCity:\t" + account1.getCity() +
                "\n\tPan Card:\t" + account1.getPan() +
                "\n\tBranch:\t" + account1.getBranch() +
                "\n\tAccount Number:\t" + account1.getAccount() +
                "\n\tATM Pin:\t" + account1.getPin()
        );

    }

    @Override
    public void DepositAmount() {
        deposit = getValidDeposit();


    }

    private int getValidDeposit() {
        System.out.println("Enter Amount for Deposit ");
        deposit = sc.nextInt();
        if (deposit > 0) {
            balance = balance + deposit;
            System.out.println("Deposited amount is " + deposit);
            System.out.println("Current Balance is " + balance);
            return deposit;
        } else {
            System.out.println("Please deposit amount more than 0");
            return getValidDeposit();
        }
    }

    @Override
    public void WithdrawAmount() {
        withdraw = getValidWithdraw();

    }

    private int getValidWithdraw() {
        System.out.println("Enter Amount for Withdraw");
        withdraw = sc.nextInt();
        if (withdraw > 0 && withdraw <= balance) {
            balance = balance - withdraw;
            System.out.println("Withdrawal amount is " + withdraw);
            System.out.println("Current Balance is " + balance);
            return withdraw;
        } else {
            System.out.println("Please withdraw amount more than 0 and less than balance amount");
            return getValidWithdraw();
        }

    }

    @Override
    public void UpdateProfile() {

        System.out.println("Profile Updation");
        System.out.println("1. Change Name");
        System.out.println("2. Change Mobile");
        System.out.println("3. Change Gmail");
        System.out.println("4. Change Gender");
        System.out.println("5. Change City");
        System.out.println("6. Change Account Number");
        System.out.println("7. Change ATM Pin");
        System.out.println("8. Change Branch");
        System.out.println("9. Change Pan Number");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                String newName = getValidName();
                account1.setName(newName);
                break;
            case 2:
                String newMobile = getValidMobile();
                account1.setMobile(newMobile);
                break;
            case 3:
                String newGmail = getValidEmail();
                account1.setGmail(newGmail);
                break;
            case 4:
                int newGender = getValidGender();
                break;
            case 5:
                String newCity = getValidCity();
                account1.setCity(newCity);
                break;
            case 6:
                String newAccount = getValidAccount();
                account1.setAccount(newAccount);
                break;
            case 7:
                String newPin = getValidPin();
                account1.setPin(newPin);
                break;
            case 8:
                int newBranch = getValidBranch();
                break;
            case 9:
                String newPan = getValidPan();
                account1.setPan(newPan);
                break;

            default:
                System.out.println("Please select number between 1 to 9");
                break;
        }


    }
}
