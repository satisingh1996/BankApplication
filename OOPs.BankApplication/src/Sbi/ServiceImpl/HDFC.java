package Sbi.ServiceImpl;

import Sbi.Model.Account;
import Sbi.Service.RBI;

import java.util.Scanner;

public class HDFC implements RBI {
    Account account1 = new Account();
    Scanner sc = new Scanner(System.in);


    @Override
    public void OpenAccount() {

        System.out.println("Account creating");
        String name = getValidName();
        account1.setName(name);

        int mobile = getValidMobile();
        account1.setMobile(mobile);

        String email=getValidEmail();




    }

    private String getValidEmail() {
        System.out.println("Enter your Gmail");
        String email=sc.next();

        if(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com") || email.endsWith("@redifmail.com"))
        {
            return email;
        }
        else
        {
            System.out.println("Please enter valid email");
            return getValidEmail();
        }

    }

    private int getValidMobile() {
        System.out.println("Enter your mobile number");
        int mobile = sc.nextInt();
        String mobileInString = String.valueOf(mobile);

        if (mobile > 0 && mobileInString.length() == 10 && (mobileInString.startsWith("7") ||
                mobileInString.startsWith("8") || mobileInString.startsWith("9"))) {
            return mobile;
        } else {
            System.out.println("Please enter 10 digit mobile number & it will starts with 7,8,9");
            return getValidMobile();
        }

    }

    private String getValidName() {

        System.out.println("Enter your name");
        String name = sc.next();

        if (name.length() <= 2 && name.length() >= 20) {
            System.out.println("Please enter at least 3 character name and less than 20 character");
            return getValidName();

        }
        else
        {
            return name;
        }
    }

    @Override
    public void DisplayBalance() {

    }

    @Override
    public void DisplayDetails() {

    }

    @Override
    public void DepositAmount() {

    }

    @Override
    public void WithdrawAmount() {

    }

    @Override
    public void UpdateProfile() {

    }
}
