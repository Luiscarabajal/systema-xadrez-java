/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import boardgame.Board;
import javafx.scene.layout.Border;
import xadrez.ChessMatch;

/**
 *
 * @author Dell
 */
public class programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
        
    }
    
}
