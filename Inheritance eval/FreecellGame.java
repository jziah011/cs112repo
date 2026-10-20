import java.util.Arrays;

public class FreecellGame 
{
	private long seed;
	public CardStack[] game;
	
	
		
//		create a freecell game with a random deal generated with a given seed
//		
//		CardStack deck = new Deck(seed);
//		this.seed = seed;
//		game = new CardStack[16];
//		for(int i =0; i<game.length; i++) 
//		{
//			if(i<=3) 
//			{
//				game[i] = new Cell();
//			}
//			else if(i>3&&i<=7) 
//			{
//			 4: 
	game[i] = new Foundation();
//			}
//			else 
//			{
//				game[i] = new Cascade();
//			}
//			
//			int j = 0;
//			
//			while (!deck.isEmpty())
//			{
//				game[8+(j%8)].addCard(deck.getTopCard());
//				deck.removeTopCard();
//				j++;
//			}
//		}
//	}
	
	public FreecellGame(long seed) {

	    game = new CardStack[17];

	    game[0] = new Deck(seed);

	    // Cells: 1-4
	    for (int i = 1; i <= 4; i++) {
	        game[i] = new Cell();
	    }

	    // Foundations: 5-8
	    for (int i = 5; i <= 8; i++) {
	        game[i] = new Foundation();
	    }

	    // Cascades: 9-16
	    for (int i = 9; i <= 16; i++) {
	        game[i] = new Cascade();
	    }

	    // Deal cards into cascades
	    int j = 0;

	    while (!game[0].isEmpty()) {
	        game[9 + (j % 8)].addCard(game[0].removeTopCard());
	        j++;
	    }
	}
	
	

	public boolean play(int srcStackNum, int destStackNum) {
		    CardStack src = game[srcStackNum];
		    CardStack dest = game[destStackNum];

		    return dest.playTo(src);

	}
	
	public Card[] getStack(int stackNum) 
	{
		//Return an array with the Card in the given stack number listed from bottom to top.

		return game[stackNum].toArray();
	}
	
	public boolean isGameOver() 
	{
		//Return whether or not the game has been won (that is, all cards are on foundations).
	    int total = 0;
	    for (int i = 5; i <= 8; i++) 
	    {
	        total += game[i].size();
	    }
	    return total == 52;
	}
	
	@Override
	public String toString()
	{
	    String str = "Cells:\n";

	    for (int i = 1; i <= 4; i++)
	    {
	        str += String.format("%2d: %s\n", i, game[i]);
	    }

	    str += "Foundations:\n";

	    for (int i = 5; i <= 8; i++)
	    {
	        str += String.format("%2d: %s\n", i, game[i]);
	    }

	    str += "Cascades:\n";

	    for (int i = 9; i <= 16; i++)
	    {
	        str += String.format("%2d: %s\n", i, game[i]);
	    }

	    return str;
	}
}
