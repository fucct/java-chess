package chess.domain.state;

import chess.domain.Player.Player;
import chess.domain.board.Board;
import chess.domain.board.position.Position;
import chess.domain.piece.*;

import java.util.HashMap;
import java.util.Map;

public class BoardRepository {
    private static final Map<Position, Piece> initialBoard = new HashMap<>();

    static {
        initialBoard.put(Position.of("a2"), Pawn.of(Player.WHITE, Position.of("a2")));
        initialBoard.put(Position.of("b2"), Pawn.of(Player.WHITE, Position.of("b2")));
        initialBoard.put(Position.of("c2"), Pawn.of(Player.WHITE, Position.of("c2")));
        initialBoard.put(Position.of("d2"), Pawn.of(Player.WHITE, Position.of("d2")));
        initialBoard.put(Position.of("e2"), Pawn.of(Player.WHITE, Position.of("e2")));
        initialBoard.put(Position.of("f2"), Pawn.of(Player.WHITE, Position.of("f2")));
        initialBoard.put(Position.of("g2"), Pawn.of(Player.WHITE, Position.of("g2")));
        initialBoard.put(Position.of("h2"), Pawn.of(Player.WHITE, Position.of("h2")));
        initialBoard.put(Position.of("a1"), Rook.of(Player.WHITE, Position.of("a1")));
        initialBoard.put(Position.of("b1"), Knight.of(Player.WHITE, Position.of("b1")));
        initialBoard.put(Position.of("c1"), Bishop.of(Player.WHITE, Position.of("c1")));
        initialBoard.put(Position.of("d1"), Queen.of(Player.WHITE, Position.of("d1")));
        initialBoard.put(Position.of("e1"), King.of(Player.WHITE, Position.of("e1")));
        initialBoard.put(Position.of("f1"), Bishop.of(Player.WHITE, Position.of("f1")));
        initialBoard.put(Position.of("g1"), Knight.of(Player.WHITE, Position.of("g1")));
        initialBoard.put(Position.of("h1"), Rook.of(Player.WHITE, Position.of("h1")));
        initialBoard.put(Position.of("a7"), Pawn.of(Player.BLACK, Position.of("a7")));
        initialBoard.put(Position.of("b7"), Pawn.of(Player.BLACK, Position.of("b7")));
        initialBoard.put(Position.of("c7"), Pawn.of(Player.BLACK, Position.of("c7")));
        initialBoard.put(Position.of("d7"), Pawn.of(Player.BLACK, Position.of("d7")));
        initialBoard.put(Position.of("e7"), Pawn.of(Player.BLACK, Position.of("e7")));
        initialBoard.put(Position.of("f7"), Pawn.of(Player.BLACK, Position.of("f7")));
        initialBoard.put(Position.of("g7"), Pawn.of(Player.BLACK, Position.of("g7")));
        initialBoard.put(Position.of("h7"), Pawn.of(Player.BLACK, Position.of("h7")));
        initialBoard.put(Position.of("a8"), Rook.of(Player.BLACK, Position.of("a8")));
        initialBoard.put(Position.of("b8"), Knight.of(Player.BLACK, Position.of("b8")));
        initialBoard.put(Position.of("c8"), Bishop.of(Player.BLACK, Position.of("c8")));
        initialBoard.put(Position.of("d8"), Queen.of(Player.BLACK, Position.of("d8")));
        initialBoard.put(Position.of("e8"), King.of(Player.BLACK, Position.of("e8")));
        initialBoard.put(Position.of("f8"), Bishop.of(Player.BLACK, Position.of("f8")));
        initialBoard.put(Position.of("g8"), Knight.of(Player.BLACK, Position.of("g8")));
        initialBoard.put(Position.of("h8"), Rook.of(Player.BLACK, Position.of("h8")));
    }

    public static Board createNewBoard() {
        return new Board(initialBoard);
    }
}
