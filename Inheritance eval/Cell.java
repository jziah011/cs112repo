
public class Cell extends CardStack{
	
	public Cell() 
	{
		
	}

	@Override
	public boolean playTo(Card card) throws java.lang.NullPointerException,
    IllegalPlayException
	{ 
	    // Given a card to be played to the top of this card stack, either make the legal play and return true, or ignore the illegal play and return false.
	    if(card == null)
	    {
	        throw new NullPointerException("Null");
	    }

	    if(isEmpty()) 
	    {
	        addCard(card);
	        return true;
	    }
	    else 
	    {
	        throw new IllegalPlayException("Cells may only contain a single card.");
	    }
	}
}
