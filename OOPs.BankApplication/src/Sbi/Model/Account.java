package Sbi.Model;

public class Account {
    private String name;
    private String account;
    private String pin;
    private String mobile;
    private String gmail;
    private String gender;
    private String city;
    private String pan;
    private String branch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", pin=" + pin +
                ", mobile=" + mobile +
                ", gmail='" + gmail + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", pan='" + pan + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
