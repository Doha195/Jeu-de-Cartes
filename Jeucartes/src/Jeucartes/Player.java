package Jeucartes;
import java.util.ArrayList;
import java.util.Collections;

public class Player {

    private String Name;
    private int score = 0;
    private ArrayList<Card> Cards;

    public Player(String name, ArrayList<Card> Cards) {
        this.setName(name);
        this.setCards(Cards);

    }

    public ArrayList<Card> getCards() {
        return this.Cards;
    }

    public void setCards(ArrayList<Card> cards) {
        Cards = cards;
    }

    public String getName() {

        return this.Name;

    }

    public String setName(String newName) {
        return this.Name = newName;
    }
    
    public int getScore() {
		return score;
	}
    
    public void setScore(int score) {
		this.score = score;
	}

    public void shuffled() {
        Collections.shuffle(this.getCards());
    }
}
