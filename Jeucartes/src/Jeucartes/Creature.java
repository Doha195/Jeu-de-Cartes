package Jeucartes;

public class Creature extends Card {
	private String Name;
    private int Degat;
    private int Vie;
    
    public Creature(int score, String name, int degat, int vie) {
        this.setName(name);
        this.setDegat(degat);
        this.setVie(vie);
    }


	private void setVie(int vie) {
		this.Vie = vie;
		
	}
	
	 public int getVie() 
	    {
	        return this.Vie;
	    }

	private void setDegat(int degat) {
		this.Degat = degat;
		
	}
	
	 public int getDegat() 
	    {
	        return this.Degat;
	    }

	private void setName(String name) {
		this.Name = name;
		
	}
	
	 public String getName() 
	    {
	        return this.Name;
	    }
	 
	 @Override
	   public String toString() {
	       return "[Name=" + Name + ", Degat=" + Degat + ", Vie=" + Vie + "]";
	   }
}
