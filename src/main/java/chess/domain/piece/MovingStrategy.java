package chess.domain.piece;

import chess.domain.board.position.Position;

import java.util.Map;

public interface MovingStrategy {

    boolean canMove(Position source, Position target, Map<Position, Piece> boardDto);

    void move(Position source, Position target, Map<Position, Piece> boardDto);

}
