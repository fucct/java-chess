package chess.domain.piece;

import chess.domain.Player.Player;

public class Bishop extends Piece {
    private Bishop(Player player) {
        super(player);
    }

    public static Piece of(Player player) {
        return new Bishop(player);
    }
}
