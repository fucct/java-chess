package chess.domain.piece;

import chess.domain.Player.Player;

public abstract class Piece {
    private final Player player;

    public Piece(Player player) {
        this.player = player;
    }
}
