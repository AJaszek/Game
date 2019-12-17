/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import game.players.Player;

/**
 *
 * @author Student
 */
public interface Statistics {
    void andTheWinnerIs(Player player);
    void print();
    void clear();
}
