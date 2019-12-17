
package game;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
public class WinStatistics implements Statistics{

    private Map<Player,Integer> stats = new HashMap();
    
    public void print(){
        stats.forEach(
        (Player player, Integer score)->System.out.println(player.getName()+": "+score)
        );
    }
    
    public void andTheWinnerIs(Player player){
        int score = stats.getOrDefault(player, 0)+1;
        stats.put(player, score);
    }
    
    public void clear(){
        stats.clear();
    }
    
    
}
