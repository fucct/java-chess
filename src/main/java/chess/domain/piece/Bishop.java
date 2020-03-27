package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public class Bishop extends Piece {

    public static final String WHITE_BISHOP = "\u2657";
    public static final String BLACK_BISHOP = "\u265d";

    public Bishop(Player player, Position position) {
        super(player, position);
    }

    public static Piece of(Player player, Position position) {
        return new Bishop(player, position);
    }

    @Override
    public String toString() {
        if (player.equals(Player.WHITE)) {
            return WHITE_BISHOP;
        }
        return BLACK_BISHOP;
    }
}
