
package game;

import java.util.Random;

public class Game_g {
    
    private Random dice = new Random();
    private Player player;
    
    public void addPlayer(Player p){
        this.player=p;
    }
            
    public void play(){
            
        int pc,guess;
        
        System.out.println(player.getName() + " zgaduje wylosowana liczbe");
        do{
        
            pc = dice.nextInt(6)+1;
            guess = player.guess();
            System.out.println("Wylosowana liczba: "+pc + " Liczba gracza: " + guess);
        
        }while(pc!=guess);
        System.out.println("Gratulacje!");
        
    }
    
}
