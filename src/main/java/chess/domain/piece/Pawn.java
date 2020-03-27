package chess.domain.piece;

import chess.domain.Player.Player;
import chess.domain.board.position.Position;

public class Pawn extends Piece {

    public static final String WHITE_PAWN = "\u2659";
    public static final String BLACK_PAWN = "\u265f";

    public Pawn(Player player, Position position) {
        super(player, position);
    }

    public static Piece of(Player player, Position position) {
        return new Pawn(player, position);
    }

    @Override
    public String toString() {
        if (player.equals(Player.WHITE)) {
            return WHITE_PAWN;
        }
        return BLACK_PAWN;
    }
}
