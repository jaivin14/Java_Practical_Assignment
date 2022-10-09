// Name : Savaliya Jaivin P.
// ID : 21CE120

// According to question no 1, the Account class was defined to model a bank account.
// An account has the properties account number, balance, annual interest rate, and date
// created, and methods to deposit and withdraw funds. Create two subclasses for
// checking and saving accounts. A checking account has an overdraft limit, but a
// savings account cannot be overdrawn
import java.util.*;

class checking extends Account {
    static double dr = 5000;
    double dec = 0.05;
    public checking()
    {

    }
    public checking(int id, double balance)
    {
        super(id,balance);
    }
    void draft()
    {
        withdraw();
    }
    public void withdraw(double money)
    {
        if(getBalance()-money < -dr )
        {
            super.withdraw();
            System.out.println("Updated balance : "+ getBalance());
        }
        else
        {
            System.out.println("can not overdraft");
        }
    }
}

class Saving extends Account {
    // static int dr = 5000;
    public Saving(){}
    public Saving(int id, double balance)
    {
        super(id, balance);
    }
    public void withdraw(double money)
    {
        if(money <= getBalance())
        {
            super.withdraw();
        }
        else
        {
            System.out.println("Insufficient money");
        }
    }
}

    public class pr5 {
        public static void main(String[] args) {
            Scanner t = new Scanner(System.in);
            Account a = new Account();
            Saving s = new Saving();
            checking c = new checking();
            System.out.println("Welcome to the BANK");
            System.out.println();
            System.out.println("The Account Creation Date is : ");
            System.out.println(a.date.toString());
            System.out.println();
            a.data();
            for (int i = 1; i >= 1; i++) {
                System.out.println("Enter Your Input : ");
                int k = t.nextInt();
                switch (k) {
                    case 1:
                        a.deposit();
                        a.data();
                        continue;
                    case 2:
                        c.draft();
                        a.data();
                        continue;
                    case 3:
                        a.getMonthlyInterestRate();
                        a.data();
                        continue;
                    default:
                        System.out.println("Exited..");
                        return ;
                }
            }
            t.close();
        }
    }
