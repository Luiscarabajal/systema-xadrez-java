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
public class Board {
    private int rows;
    private int colmn;
    private Piece[][] pieces;

    public Board(int rows, int colmn) {
        this.rows = rows;
        this.colmn = colmn;
        pieces = new Piece[rows][colmn];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColmn() {
        return colmn;
    }

    public void setColmn(int colmn) {
        this.colmn = colmn;
    }
    
    public Piece piece(int row, int colmn){
        return pieces[row][colmn];
    }
    public Piece piece(Position position){
    
        return pieces[position.getRow()][position.getColum()];
    }
}
