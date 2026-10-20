import java.util.Random;
import java.util.Scanner;

public class Freecell extends FreecellGame
{
	
	public Freecell(long seed) 
	{
		super(seed);
	}
	
	public void play() 
	{ 
		//Play a Freecell game with a random shuffle.
		Random random = new Random();
		play(random.nextLong());
		
	}
	
	public FreecellGame play(long seed) 
	{
		//Play a Freecell game with a random shuffle performed according to a given random seed.
		FreecellGame game = new FreecellGame(seed);
		System.out.println(game);
		return game;
	}
	
	public static void main (String[] args)
	{
		//Start a Freecell game with seed 0.
		FreecellGame game = new Freecell(42);
		System.out.println(game);
		//new scanner object
		//we are going to print to terminal and ask for src index and dest index, and use the Freecell game's play method to make plays
		// as long as we don't type -1
		Scanner input = new Scanner(System.in);
		int smt = 0;
		int smt2 = 0;
		while(smt != -1) {
			System.out.println("Enter your source input: ");
			smt = input.nextInt();
			System.out.println("Enter your destination input: ");
			smt2 = input.nextInt();
			game.play(smt, smt2);
			System.out.println(game);
		}
	
	}
}
