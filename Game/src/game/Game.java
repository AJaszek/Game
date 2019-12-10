
package game;


public class Game {

    public static void main(String[] args) {

        Game_g game= new Game_g();
        
        Player player = new PlayerComp();
        player.setName("Arek");
       
        game.addPlayer(player);
        game.addPlayer(new PlayerComp("Komputer"));       
        game.addPlayer(new PlayerComp("Komputer")); 
        game.addPlayer(new PlayerComp("Komputer")); 
        game.addPlayer(new PlayerComp("Komputer")); 
        
        //game.removePlayerForEach("Komputer");
        game.removePlayer("Komputer");
        game.showPlayers();
        
        game.play();

       
    }
    
}
