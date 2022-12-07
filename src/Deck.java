import java.util.Iterator;
import java.util.Random;

public class Deck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Card c = new Card(int v,String n, String s, String c);
		Card[] deck = new Card[52];
		String[] names= {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suit = {"Spades","Clubs","Hearts","Diamonds"};
		String[] colour= {"Black", "Red"};
		for (int x=0;x<4;x++) {
			String d;
			if (x<2) {
				d= "Black";
			}else {
				d = "Red";
			}
			for (int y=0; y<13;y++) {
				deck[x*13+y]= new Card(y+1, names[y], suit[x], colour[x/2]);
			}
		}
		shuffle (deck); 
		for (Card c : deck) {
			System.out.println(c.print());
		}
	}
	public static void shuffle(Card[] deck) {
	//loop through and swap the values
		Random r = new Random();
		for (int i=0; i <deck.length; i++) {
			int rad = r.nextInt(deck.length);
				Card boi = deck[rad];
				deck[rad] = deck[i];
				deck[i]= boi;
		}
	}
		

}
