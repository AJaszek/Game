
package game;

import java.util.Random;

public class Player {
    private Random dice = new Random();
    private String name;
    
    public void setName(String name){
        
        if(name == null) System.err.println("Imie nie moze byc null");
        else this.name=name;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int guess(){

       return dice.nextInt(6)+1; 
    }

}
