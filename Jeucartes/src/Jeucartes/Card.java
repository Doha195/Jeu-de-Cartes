package Jeucartes;


public class Card {
	private int Cout = 0;
	private int score = 0;

	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Card(int cout) {
		super();
		Cout = cout;
	}

	public int getCout() {
		return Cout;
	}

	public void setCout(int cout) {
		Cout = cout;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int socre) {
		this.score = socre;
	}
	

}
