package Jeucartes;



public class Sortilege extends Card {
	private String Name;
	private int Degat;
	private int Vie;
    private String Desc;
    
    public Sortilege(String name, String desc, int degat, int vie) {
        this.setName(name);
        this.setDegat(degat);
        this.setVie(vie);
        this.Desc(desc);
    }

	private void Desc(String desc) {
		this.Desc = desc;
		
	}
	
	 public String getDesc() 
	    {
	        return this.Desc;
	    }

	private void setName(String name) {
		this.Name = name;
		
	}
	
	 public String getName() 
	    {
	        return this.Name;
	    }
	 
		
	 public int getDegat() 
	    {
	        return this.Degat;
	    }
	 
	 private void setDegat(int degat) {
			this.Degat = degat;
			
		}
	 
		private void setVie(int vie) {
			this.Vie = vie;
			
		}
		
		 public int getVie() 
		    {
		        return this.Vie;
		    }
		 
		 @Override
		   public String toString() {
		       return "[Name=" + Name + ", Degat=" + Degat + ", Vie=" + Vie + ", description=" + Desc + "]";
		   }

}
