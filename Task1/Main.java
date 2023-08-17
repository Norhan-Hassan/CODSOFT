package Task1;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        final int upperBound = 100;
        final int count = 5;
        int guess,flag=2,countRounds=1,countWin=0;
        int randomNumber = rand.nextInt(upperBound);
        Checker c=new Checker();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Welcome..........");
            for(int i=0;i<count;i++)
            {
                System.out.println("Enter Your Guess Number : ");
                guess=scanner.nextInt();
                System.out.println("Random Number Is : ");
                randomNumber = rand.nextInt(upperBound);
                System.out.println(randomNumber);
                countWin+=c.Check(guess, randomNumber, count);
            }

            System.out.println("Do you want to play again ? 1-yes , 2-no: ");
            flag=scanner.nextInt();
            if(flag==1)
            {
                countRounds++;
            }
        }while(flag==1);
        //score is based on number of true guess in total rounds
        System.out.println("Your Score Is : "+c.GetScore(countRounds, countWin));
        scanner.close();
    }
    
}

