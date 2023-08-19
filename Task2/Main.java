package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number Of Subjects : ");
        int numOfSub=scanner.nextInt();
        double grade, total = 0,avg;
        for(int i=0;i<numOfSub;i++)
        {
            System.out.println("Enter Your Mark in subject : ");
            grade=scanner.nextDouble();
            if(grade<=100)
            {
                total+=grade;
            }
            else 
            {
                System.out.println("Enter Marks between 0 to 100");
            }
            
        }

        avg=total/numOfSub;



        System.out.println("Your total marks is : "+total);
        System.out.println("Your average marks is : "+avg);
        if(avg<=100 && avg >=90)
        {
            System.out.println("A+");
        }
        else if(avg<90 && avg>=85)
        {
            System.out.println("A");
        }
        else if(avg<85 && avg>=75)
        {
            System.out.println("B");
        }
        else if(avg<75 && avg>=65)
        {
            System.out.println("C");
        }
        else if(avg<65 && avg>=50)
        {
            System.out.println("D");
        }
        else if(avg<50)
        {
            System.out.println("F");
        }
        

    }
}