// Name : Savaliya Jaivin P.
// ID : 21CE120

// Design a class named Account that contains:
// A private int data field named id for the account (default 0).
// A private double data field named balance for the account (default 0)
// A private double data field named annualInterestRate that stores the current
// interest rate (default 0). Assume that all accounts have the same interest rate.
// A private Date data field named dateCreated that stores the date when the
// account was created.
// A no-arg constructor that creates a default account.
// A constructor that creates an account with the specified id and initial balance.
// The accessor and mutator methods for id, balance and annualInterestRate.
// The accessor method for dateCreated.
// A method named getMonthlyInterestRate() that returns the monthly interest
// rate.
// A method named getMonthlyInterest() that returns the monthly interest.
//  A method named withdraw that withdraws a specified amount from the
// account.
//  A method named deposit that deposits a specified amount to the account.
import java.util.*;

class Account {
    int id = 0;
     double balance = 500;
    double annualInterestRate = 0.07;
    Date date = new Date();
    Scanner sc = new Scanner(System.in);

    Account() {
        // to create a new id
        int ID = 109102022;
        System.out.println("The Account Number is : " + ID);
        System.out.println("Your Account balance is : " + balance);
    }
    Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    void getMonthlyInterestRate() {
        double k = 4.9 / 12;
        System.out.println("The Monthly Interest Rate is : " + k);
    }

    void withdraw() {
        System.out.println("Enter the Amount you want to Withdraw : ");
        double with = sc.nextDouble();
        if (with > balance) {
            System.out.println("Account have insufficient balance!!!");
        } else {
            balance = balance - with;
            System.out.println("The updated balnce is : " + balance);
        }
    }

    void deposit() {
        System.out.println("Enter the Amount you want to Deposit : ");
        double depos = sc.nextDouble();
        balance = balance + depos;
        System.out.println("The updated balnce is : " + balance);

    }

    void data() {
        System.out.println();
        System.out.println("1.Deposit");
        System.out.println("2.Widthdraw");
        System.out.println("3.GetMonthlyInterestRate");
        System.out.println("4.Exit");
        System.out.println();
    }

    public Double getBalance() {
        return balance;
    }

    public int getId() {
        return 0;
    }

}

public class pr1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Account a = new Account();
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
                    a.withdraw();
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