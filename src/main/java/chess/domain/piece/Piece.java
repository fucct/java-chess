package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public abstract class Piece {
    protected static MovingStrategy movingStrategy;

    protected final Player player;
    protected final Position position;

    public Piece(Player player, Position position) {
        this.player = player;
        this.position = position;
        movingStrategy = setMovingStrategy(player);
    }

    public abstract MovingStrategy setMovingStrategy(Player player);

    public abstract String toString();

    public abstract
}
