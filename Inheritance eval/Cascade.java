
public class Cascade extends CardStack 
{
	
	public Cascade() 
	{
		
	}
	
	public boolean playTo(Card card) 
	{
	    if(card == null)
	    {
	        return false;
	    }

	    if(stack.isEmpty()) 
	    {
	        addCard(card);
	        return true;
	    }

	    Card topCard = getTopCard();

	    boolean diffCol = Card.suitIsRed[card.getSuit()] != Card.suitIsRed[topCard.getSuit()];

	    boolean lowerRank = card.getRank() == topCard.getRank()-1;

	    if(diffCol && lowerRank) 
	    {
	        addCard(card);
	        return true;
	    }
	    else 
	    {
	        return false;
	    }
	}
}
