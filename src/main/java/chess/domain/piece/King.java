package chess.domain.piece;

import chess.domain.Player.Player;

public class King extends Piece {
    private King(Player player) {
        super(player);
    }

    public static King of(Player player) {
        return new King(player);
    }
}
