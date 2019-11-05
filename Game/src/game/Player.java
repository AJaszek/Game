
package game;

import java.util.Random;

public abstract class Player {

    private String name;
    
    public Player(){
        this.setName("Anonim");
    }
    public Player(String a){
        this.setName(a);
    }
    
    public void setName(String name){
        
        if(name != null && name.matches("^[a-zA-Z0-9~.]{3,}$")){
            this.name=name;
        }
        else{
            throw new IllegalArgumentException("Imie nieprawidlowe");
            //System.err.println("Imie nieprawidlowe");
        }
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public abstract int guess();

}
