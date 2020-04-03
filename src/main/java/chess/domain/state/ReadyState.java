package chess.domain.state;

import chess.domain.MoveParameter;
import chess.domain.Turn;
import chess.domain.board.Board;
import chess.domain.board.BoardInitializer;
import chess.domain.player.Player;
import chess.domain.result.Status;

public class ReadyState implements State {

    private final BoardInitializer boardInitializer;

    public ReadyState(BoardInitializer boardInitializer) {
        this.boardInitializer = boardInitializer;
    }

    @Override
    public State start() {
        return new RunningState(Board.of(boardInitializer));
    }

    @Override
    public State move(MoveParameter moveParameter, Turn turn) {
        throw new UnsupportedOperationException("아직 게임이 시작되지 않았습니다.");
    }

    @Override
    public State end() {
        throw new UnsupportedOperationException("아직 게임이 시작되지 않았습니다.");
    }

    @Override
    public Board getBoard() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public Status getStatus() {
        throw new UnsupportedOperationException("아직 게임이 시작되지 않았습니다.");
    }

    @Override
    public Player getWinner() {
        throw new UnsupportedOperationException("아직 게임이 시작되지 않았습니다.");
    }

    @Override
    public State status() {
        throw new UnsupportedOperationException("아직 게임이 시작되지 않았습니다.");
    }
}
