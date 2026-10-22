
public class CellTest {

	public static void main(String[] args) throws IllegalPlayException, NullPointerException {
		Cell cell = new Cell();

		try {
			Card card = null;
			cell.playTo(card);
			System.out.println("FAIL: NULL NOT FOUND");
		}
		catch(NullPointerException e){
			System.out.println("PASS: NULL FOUND");
		}
		catch(Exception e) {
			System.out.println("Other exception found");
		}
		
		
		try {
			cell.addCard(new Card(6,2));
			cell.playTo(new Card(10,1));
			System.out.println("FAIL - NO ILLEGAL PLAYS FOUND");
		}
		catch(IllegalPlayException e) {
			System.out.println("PASS: Illegal PLay made");
		}




	}

}
