package chess.domain.piece;

import chess.domain.Player.Player;

public class Queen extends Piece {
    private Queen(Player player) {
        super(player);
    }

    public static Queen of(Player player) {
        return new Queen(player);
    }
}
