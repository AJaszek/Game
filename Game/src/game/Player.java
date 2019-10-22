
package game;

import java.util.Random;

public class Player {
    private Random dice = new Random();
    private String name;
    
    public Player(){
        this.setName("Anonim");
    }
    public Player(String a){
        this.setName(a);
    }
    
    public void setName(String name){
        
        if(name != null && !name.isEmpty()){
            this.name=name;
        }
        else{
             System.err.println("Imie nieprawidlowe");
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public int guess(){

       return dice.nextInt(6)+1; 
    }

}
