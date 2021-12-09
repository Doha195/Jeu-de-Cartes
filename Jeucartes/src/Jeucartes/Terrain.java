package Jeucartes;

public class Terrain extends Card {

    private String Name;
    private String Value;


   public Terrain(String name, String value, int score) {
       this.setName(name);
       this.setValue(value);
   }

   public String getName() 
   {
       return this.Name;
   }
   public void setName(String name) {
       this.Name = name;
   }

   public String getValue() {
       return this.Value;
   }

   public void setValue(String value) {
       this.Value = value;
   }

   @Override
   public String toString() {
       return "[Name=" + Name + ", Value=" + Value + "]";
   }


}
