/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import boardgame.Board;

/**
 *
 * @author Dell
 */
public class ChessMatch {

    private Board board;

    public ChessMatch() {

        board = new Board(8, 8);
    }
    
    public ChessPiece[][] getPieces(){
    
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColmn()];
        for (int i = 0; i < board.getRows(); i++) {
            
            for (int j = 0; j < board.getColmn(); j++) {
                
                mat [i][j] = (ChessPiece)board.piece(i,j);  //fazendo um Dowcast
                
            }
        }
        return mat;
    }
}
