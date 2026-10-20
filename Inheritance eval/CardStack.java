
public class CardStack extends java.lang.Object{
	protected java.util.Stack<Card>	stack;
	
	public CardStack() 
	{
		stack = new java.util.Stack<Card>();
	}

	public void addCard(Card card) 
	{
		stack.push(card);
	}
	
	public boolean canPlayFrom() throws IllegalPlayException
	{ 
		//Return whether or not a card may be removed from this stack.
			if(isEmpty()) {
				throw new IllegalPlayException("You cannot play from an empty stack");
			}
			else {
				return(!isEmpty());
			}
			
	}
	
	public Card getTopCard() 
	{ 
		//Return the top card (or null if empty).
			if (!stack.isEmpty())
		    {
		        return stack.peek();
		    }
			else
		    {
		        return null;
		    }
	}
	
	public boolean isEmpty() 
	{ 
		//alternate solution: return stack.empty();
		if(stack.empty()) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean playTo(Card card) throws java.lang.NullPointerException
	{
	    if (card == null) //added null check
	    {
	        throw new NullPointerException("Null");
	    }
	    
	    addCard(card);
	    return true;
	}
	
	public boolean playTo(CardStack otherStack) throws IllegalPlayException 
	{ 
		//Given a stack from which the top card is to be played to the top of this card stack, either make the legal play and return true, or ignore the illegal play and return false.
		Card card = otherStack.getTopCard();
		if(!playTo(card)) 
		{
			throw new IllegalPlayException("Illegal Play made");
		}
		else 
		{
			otherStack.removeTopCard();
			return true;
		}
	}
	
	public Card removeTopCard() 
	{ 
		//Remove the top card and return it (or null if empty).
		if(stack.isEmpty()) 
		{
			return null;
		}
		else 
		{
			return stack.pop();
		}
	}
	
	public int size() 
	{ 
		//Return the size of the card stack.
		return stack.size();
	}
	
	public java.lang.String toString()
	{
	    String result = "";
	    for (int i = 0; i < stack.size(); i++) {
	        if (i > 0) {
	            result += ", ";
	        }
	        result += stack.get(i);
	    }
	    return result;
	}
	
	public Card[] toArray() 
	{ 
		//Return an array of Card objects in this stack, ordered bottom to top.
		return  stack.toArray(new Card[0]);
	}
	
	
	
}


