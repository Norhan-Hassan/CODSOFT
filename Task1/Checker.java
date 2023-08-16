package Task1;


public class Checker {
	
	
	public int Check(int guess, int randomNumber,int count)
	{
			int win=0;
		
			if(guess==randomNumber)
		    {
		        System.out.println("Your Guess is correct!");
		            win++;
		        }
		    
		        else if(guess<(randomNumber+10))
		        {
		            System.out.println("Your Guess is Too low!");
		        }
		        else if(guess>(randomNumber+10))
		        {
		            System.out.println("Your Guess is Too Big!");
		        }
				
		    return win;
	}
	
	public int GetScore(int numOfRounds,int numOfWins)
	{
		return numOfWins/numOfRounds;
	}

}