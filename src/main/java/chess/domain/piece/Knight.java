package chess.domain.piece;

import chess.domain.Player.Player;

public class Knight extends Piece {
    private Knight(Player player) {
        super(player);
    }

    public static Knight of(Player player) {
        return new Knight(player);
    }
}
