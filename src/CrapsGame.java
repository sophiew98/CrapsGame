
//Lab 2-2
//Filename: CrapsGame.java

public class CrapsGame
{
	public static void main(String [] args)
	{
		int die1, die2;

		die1 = (int) (Math.random()*6+1);
		die2 = (int) (Math.random()*6+1);

		int marker = die1 + die2;
		System.out.println("You rolled a " + marker);

		if(marker == 7 || marker == 11)
		{
			System.out.println("You win!");
		}
		else if(marker == 2 || marker == 3 || marker == 12)
		{
			System.out.println("Craps! You lose.");
		}
		else
		{
			int roll;
			do
			{
				die1 = (int) (Math.random()*6 + 1);
				die2 = (int) (Math.random()*6 + 1);
				roll = die1 + die2;
				System.out.println("You rolled " + roll);
			}while(roll != marker && roll != 7);
			if(roll == marker)
			{
				System.out.println("You win!");
			}
			else
			{
				System.out.println("Craps! You lose!");
			}
		}
	}
}

