package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public class Queen extends Piece {

    public static final String WHITE_QUEEN = "\u2655";
    public static final String BLACK_QUEEN = "\u265b";

    public Queen(Player player, Position position) {
        super(player, position);
    }

    public static Queen of(Player player, Position position) {
        return new Queen(player, position);
    }

    @Override
    public String toString() {
        if (player.equals(Player.WHITE)) {
            return WHITE_QUEEN;
        }
        return BLACK_QUEEN;
    }
}
