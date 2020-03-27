package chess.domain.board;

import chess.domain.board.position.Position;
import chess.domain.piece.Piece;

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
}
