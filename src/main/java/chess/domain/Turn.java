package chess.domain;

import chess.domain.Player.Player;

public class Turn {
    private Player player;

    public Turn(Player player) {
        this.player = player;
    }

    public void switchTurn() {
        player = player.switchPlayer();
    }

    public Player getPlayer() {
        return player;
    }
}
