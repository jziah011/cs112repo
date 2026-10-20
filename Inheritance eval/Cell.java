
public class Cell extends CardStack{
	
	public Cell() 
	{
		
	}

	@Override
	public boolean playTo(Card card) 
	{ 
	    // Given a card to be played to the top of this card stack, either make the legal play and return true, or ignore the illegal play and return false.

	    if(card == null)
	    {
	        return false;
	    }

	    if(isEmpty()) 
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
