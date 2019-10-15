
package game;
import java.util.Random;
public class Game {

    public static void main(String[] args) {
      Random rand = new Random();
        
        int pc,h;
        
        do{
            pc = rand.nextInt(6)+1;
            h = rand.nextInt(6)+1;
            System.out.println(pc+" "+h);
        }while(pc!=h);
        System.out.println("Gratulacje!");
        
    }
    
}
