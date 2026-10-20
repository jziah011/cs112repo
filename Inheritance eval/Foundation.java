
public class Foundation extends CardStack
{
	
	public Foundation() 
	{
		
	}
	
	@Override
	public boolean canPlayFrom() 
	{ 
		//Return whether or not a card may be removed from this stack.
		return false;
	}

	@Override
	public boolean playTo(Card card)
	{
	    if (card == null) //added null check
	    {
	        return false;
	    }
	    if(stack.isEmpty() && card.getRank() == 0)
	    {
	        addCard(card);
	        return true;
	    }
	    else if(!isEmpty() && card.getRank() == getTopCard().getRank() + 1 &&
	            card.getSuit() == getTopCard().getSuit())
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
