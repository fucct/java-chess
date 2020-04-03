package chess.domain.state;

import chess.domain.MoveParameter;
import chess.domain.Turn;
import chess.domain.board.Board;
import chess.domain.player.Player;
import chess.domain.result.Status;

public interface State {

    State start();

    State move(MoveParameter moveParameter, Turn turn);

    State end();

    State status();

    boolean isEnd();

    Board getBoard();

    Status getStatus();

    Player getWinner();
}
