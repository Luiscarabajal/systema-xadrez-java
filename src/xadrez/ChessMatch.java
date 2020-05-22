/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import boardgame.Board;
import boardgame.Position;
import xadrez.pieces.King;
import xadrez.pieces.Rook;

/**
 *
 * @author Dell
 */
public class ChessMatch {

    private Board board;

    public ChessMatch() {

        board = new Board(8, 8);
        inicialSetup();
    }
    
    public ChessPiece[][] getPieces(){
    
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            
            for (int j = 0; j < board.getColumns(); j++) {
                
                mat [i][j] = (ChessPiece)board.piece(i,j);  //fazendo um Dowcast
                
            }
        }
        return mat;
    }
    private void inicialSetup(){
        board.placePiece(new Rook(Color.WHITE, board), new Position(2, 1));
        board.placePiece(new King(Color.BLACK, board), new Position(0, 4));
        board.placePiece(new King(Color.WHITE, board), new Position(7, 4));
    }
}
