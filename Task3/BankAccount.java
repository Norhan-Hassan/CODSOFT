package Task3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount implements ActionListener {

    double balance ;
    BankAccount()
    {
        balance =0;
    }

    public double GetBalance()
    {
        return balance;
    }

    public String withdraw(double amount)
    {
        if(amount<=1000 && balance>=amount) {
            balance -= amount;
        }
        else if(amount>balance)
        {
            return("Your balance is less than your entered amount");
        }
        else
        {
            return("Your amount is greater than 1000");
        }
        return ("Withdrawing Successfully");
    }


    public void deposit(double amount)
    {
        balance+=amount;
    }
    public String checkBalance()
    {
        return (" "+GetBalance() ) ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
