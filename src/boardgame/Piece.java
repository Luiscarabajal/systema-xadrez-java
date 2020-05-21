/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boardgame;

/**
 *
 * @author Dell
 */
public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    //somente classes do mesmo pacote tabuleiro podem acessar o tabuleiro e as subclasses nesse pacote
    protected Board getBoard() {
        return board;
    }

}
