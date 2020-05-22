/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.pieces;

import boardgame.Board;
import xadrez.ChessPiece;
import xadrez.Color;

/**
 *
 * @author Dell
 */
public class King extends ChessPiece {

    public King(Color color, Board board) {
        super(color, board);
    }

  public String toString(){
  
      return "K";
  }
    
    
}
