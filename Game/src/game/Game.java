
package game;
import java.util.Random;
public class Game {

    public static void main(String[] args) {
      Random dice = new Random();
        
        int pc,guess;
        
        Player player = new Player("Arek");
        //player.setName(null);
        
        System.out.println(player.getName() + " zgaduje wylosowana liczbe");
        do{
        
            pc = dice.nextInt(6)+1;
            guess = player.guess();
            System.out.println(pc + " " + guess);
        
        }while(pc!=guess);
        System.out.println("Gratulacje!");
        
    }
    
}
