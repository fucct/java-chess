package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public class King extends Piece {

    public static final String WHITE_KING = "\u2654";
    public static final String BLACK_KING = "\u265a";

    public King(Player player, Position position) {
        super(player, position);
    }

    public static King of(Player player, Position position) {
        return new King(player, position);
    }

    @Override
    public String toString() {
        if (player.equals(Player.WHITE)) {
            return WHITE_KING;
        }
        return BLACK_KING;
    }
}
