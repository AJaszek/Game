
package game;

import statistics.NullStatistics;
import statistics.Statistics;
import game.players.Player;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Game_g {
    
    private Random dice = new Random();
    public final Statistics stats;          //stala
    //private Player player;
    
    /*public void addPlayer(Player p){
        this.player=p;
    }*/
    
    public Game_g(){
       this(null);
    }
    public Game_g(Statistics stats){
        if (stats!=null){
            this.stats=stats;
        }
        else{
            this.stats = new NullStatistics(); 
        }
    }
    
    
    private List<Player> players = new ArrayList();
   
    public void addPlayer(Player player){
        //this.player = player;
        
        boolean modify=false;
        for(Player p: players){
            if(p.getName().equals(player.getName())){
                modify=true;
            }
        }
        if(!modify) players.add(player);
        else{
            player.setName(player.getName() + dice.nextInt(2));
            
            this.addPlayer(player);
        }
    }
    public void removePlayer(String name){
        for(int i=0;i<players.size();i++){
            Player p = players.get(i);
            if(p.getName().equals(name)){
                players.remove(i);
                break;
            }
        }
    }
     public void showPlayers(){
        System.out.println("####################");
        System.out.println("Lista graczy:");
        for(Player p: players){
            System.out.println(p.getName());
        }
        System.out.println("####################");
    }
    public void play(){
            
        int pc,guess;
        
        boolean repeat;
        
        do{
            
            repeat=true;
            
            pc = dice.nextInt(6)+1;
            
            
            
            System.out.println("Wylosowana liczba: "+pc);
            
            
            for(Iterator<Player> it = players.iterator(); it.hasNext();){
                
                Player player = it.next();
                guess = player.guess();
                System.out.println("Liczba gracza "+player.getName()+":"+guess);
                if(pc!=guess){
                    System.out.println("Zle");
                }
                else{
                    System.out.println("Dobrze!");
                    repeat=false;
                    stats.andTheWinnerIs(player);
                }
            }
            System.out.println("########################");
        }while(repeat);
        
    }
    
    public void printStats(){
        stats.print();
    }
            
}
