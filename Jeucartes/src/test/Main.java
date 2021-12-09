package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Jeucartes.Card;
import Jeucartes.Terrain;
import Jeucartes.Creature;
import Jeucartes.Sortilege;


public class Main {
    public static void main(String[] args) {
    	int score = 0;
    	
    	
        ArrayList<Card> Mycards = new ArrayList<Card>(12);
        Mycards.add(new Terrain("plaines", "B", 0));
        Mycards.add(new Terrain("ile", "b", 0));
        Mycards.add(new Terrain("marais", "n", 0));
        Mycards.add(new Terrain("montagnes", "r", 0));
        Mycards.add(new Terrain("foret", "v", 0));
        Mycards.add(new Creature(20, "titan", 100, 100));
        Mycards.add(new Creature(30, "bete", 50, 50));
        Mycards.add(new Creature(40, "elfe", 250, 250));
        Mycards.add(new Creature(50, "ange", 400, 400));
        Mycards.add(new Sortilege("piège", "Lorqsque un monstre d'adversaire déclare une attaque .. utiliser cette carte pour détruire son attaque",  500, 500));
        Mycards.add(new Sortilege("magie", "prener le controle du monstre de votre adversaire", 300, 300));
        Mycards.add(new Sortilege("défense", "vous ne recevez aucun dommage de combat de ce combat", 400, 400));

        System.out.println(Mycards);

        Iterator<Card> itr = Mycards.iterator();
        
        
        System.out.println("******cards of first palyer are : ******");
        while (itr.hasNext()) {
            Card obj1 = (Card) itr.next();
            System.out.println(obj1);
        }

        Collections.shuffle(Mycards);

        Iterator<Card> shuffled = Mycards.iterator();
        
        System.out.println("");
        System.out.println("******cards of second palyer are : ******");
        while (shuffled.hasNext()) {
            Card obj2 = (Card) shuffled.next();
            System.out.println(obj2);
        }
        
    	
		for (int i = 0; i < Mycards.size(); i++) {
			score = +Mycards.get(i).getScore();
		}
		System.out.println(score);

    }
    
    
    
}
