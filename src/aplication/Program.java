package aplication;

import boardgame.Board;
import boardgame.Position;

public class Program {
    public static void main(String[] args) {

        var position = new Position(3,10);
        System.out.println(position);
        var board = new Board(8,8);
    }
}