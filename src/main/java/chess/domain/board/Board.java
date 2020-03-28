package chess.domain.board;

import chess.domain.Turn;
import chess.domain.board.position.Position;
import chess.domain.piece.Piece;
import chess.exception.IllegalTurnException;

import java.util.Map;
import java.util.stream.Collectors;

public class Board {
    Map<Position, Piece> board;

    public Board(Map<Position, Piece> board) {
        this.board = board;
    }

    public Map<Position, String> getDto() {
        return board.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().toString())
                );
    }

    public void move(Position source, Position target, Turn turn) {
        Piece sourcePiece = hasPieceIn(source);
        sourcePiece.move(source, target, turn);
        if (!sourcePiece.isThisTurn(turn)) {
            throw new IllegalTurnException("해당 플레이어의 턴이 아닙니다.");
        }
        sourcePiece.move();
        board.put(target, sourcePiece);
    }
}
