package chess.domain.piece;

import chess.domain.Player.Player;

public class Rook extends Piece {
    public Rook(Player player) {
        super(player);
    }

    public static Rook of(Player player) {
        return new Rook(player);
    }
}
