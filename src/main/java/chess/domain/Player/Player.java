package chess.domain.Player;

public enum Player {
    WHITE,
    BLACK;

    public Player switchPlayer() {
        if (this == WHITE) {
            return BLACK;
        }
        return WHITE;
    }
}
