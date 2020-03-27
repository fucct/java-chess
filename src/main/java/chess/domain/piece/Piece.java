package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public abstract class Piece {
    protected final Player player;
    protected final Position position;

    protected Piece(Player player, Position position) {
        this.player = player;
        this.position = position;
    }

    public abstract String toString();
}
