package chess.domain.board;

import chess.domain.board.position.Position;
import chess.domain.piece.Piece;

import java.util.Map;

public class Board {
    Map<Position, Piece> board;

    public Board(Map<Position, Piece> board) {
        this.board = board;
    }
}
