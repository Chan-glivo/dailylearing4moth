package classTest;

public class BankUser {
    private  String name;
    private   int   banknum;
    private  int    balance;

    public BankUser(String name, int banknum, int balance) {
        this.name = name;
        this.banknum = banknum;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBanknum() {
        return banknum;
    }

    public void setBanknum(int banknum) {
        this.banknum = banknum;
    }

    public int getBlance() {
        return balance;
    }

    public void setBlance(int blance) {
        this.balance = blance;
    }
}
