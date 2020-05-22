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
public class Rook extends ChessPiece {

    public Rook(Color color, Board board) {
        super(color, board);
    }

    @Override
    public String toString() {

        return "R";
    }

}
