
public class Card { 
	private String name; 
	private int value;
	private String suit;
	private String colour;
	public String getName() {
		return name;
	}
	public int getValue() {
		return value;
	}
	public String getSuit() {
		return suit;
	}
	public String getColour() {
		return colour;
	}
	
	public Card(int v,String n, String s, String c) {
		this.name= n;
		this.suit=s;
		this.colour=c;
		this.value=v;
	}
	
	public String print() {
		
		return this.name +" of "+this.suit + " colour: " +this.colour ;
	}
	
}
