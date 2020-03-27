package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public class Knight extends Piece {


    public static final String WHITE_KNIGHT = "\u2658";
    public static final String BLACK_KNIGHT = "\u265e";

    public Knight(Player player, Position position) {
        super(player, position);
    }

    public static Knight of(Player player, Position position) {
        return new Knight(player, position);
    }

    @Override
    public String toString() {
        if (player.equals(Player.WHITE)) {
            return WHITE_KNIGHT;
        }
        return BLACK_KNIGHT;
    }
}
