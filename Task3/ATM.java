package Task3;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BankAccount BA=new BankAccount();
        int choice,flag;
        double amount;
        Scanner s=new Scanner(System.in);

    do {
        System.out.println("Choose Option: ");
        System.out.println("1- withdrawing");
        System.out.println("2- depositing");
        System.out.println("3- checking the balance");
        choice =s.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter Amount (<= 1000 is only acceptable): ");
                amount=s.nextDouble();
                BA.withdraw(amount);
                break;
            case 2:
                System.out.println("Enter Amount: ");
                amount=s.nextDouble();
                BA.deposit(amount);
                break;
            case 3:
                System.out.println("Your Balance is : "+BA.checkBalance());
                break;
            default:
                System.out.println("Enter Valid Choice ");

        }
        System.out.println("Do you need to repeat previous list? (1-yes)/(2-no) : ");
        flag=s.nextInt();

    }while(flag==1);

    }
}