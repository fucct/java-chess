package chess.domain.piece;

import chess.controller.dto.PieceDto;
import chess.domain.player.Player;
import chess.domain.position.Position;

import java.util.Map;

public interface PieceState {

    PieceState move(Position target, Map<Position, PieceDto> boardDto);

    Player getPlayer();

    double getPoint();

    String getFigure();

    String toString();
}
