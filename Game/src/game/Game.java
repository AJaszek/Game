
package game;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

public class Game {

    public static void main(String[] args) {
        
        
        Game_g game= new Game_g(new WinStatistics());
        
        Player player = new PlayerComp();
        player.setName("Arek");
       
        game.addPlayer(player);
        game.addPlayer(new PlayerComp("Komputer"));       
        game.addPlayer(new PlayerComp("Komputer")); 
        //game.addPlayer(new PlayerComp("Komputer")); 
        //game.addPlayer(new PlayerComp("Komputer")); 
        
        game.showPlayers();
        
        for(int i=0;i<50;i++){
            game.play();
        }
        
        //game.print();
        game.stats.print();
        
       // List<Player> list = new ArrayList(); //mozna okreslic typ
        
        //list.add("raz");
        //list.add("dwa");
        /*list.add(player);

        
        
        System.out.println(list.toString());
        
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        
        for (Object s : list){
            System.out.println(s);
        }
        
        Iterator<Player> it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        
        for(Iterator<Player> it = list.iterator(); it.hasNext();){
            System.out.println(it2.next());   
        }*/
           
    }
    
}
