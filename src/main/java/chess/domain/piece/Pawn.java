package chess.domain.piece;

import chess.domain.Player.Player;

public class Pawn extends Piece {
    private Pawn(Player player) {
        super(player);
    }

    public static Piece of(Player player) {
        return new Pawn(player);
    }
}
