package Task3;

public class BankAccount {

    double balance ;
    BankAccount()
    {
        balance =0;
    }

    public double GetBalance()
    {
        return balance;
    }

    public void withdraw(double amount)
    {
        if(amount<=1000 && balance>=amount) {
            balance -= amount;
        }
        else if(amount>balance)
        {
            System.out.println("Your balance is less than your entered amount");
        }
        else if(amount>1000)
        {
            System.out.println("Your amount is greater than 1000");
        }
    }

    public void deposit(double amount)
    {
        balance+=amount;
    }

    public double checkBalance()
    {
        return GetBalance();
    }

}
