package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public class Rook extends Piece {

    public static final String WHITE_ROOK = "\u2656";
    public static final String BLACK_ROOK = "\u265c";

    public Rook(Player player, Position position) {
        super(player, position);
    }

    public static Rook of(Player player, Position position) {
        return new Rook(player, position);
    }

    @Override
    public String toString() {
        if (player.equals(Player.WHITE)) {
            return WHITE_ROOK;
        }
        return BLACK_ROOK;
    }
}
