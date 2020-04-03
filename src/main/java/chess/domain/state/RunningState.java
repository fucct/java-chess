package chess.domain.state;

import chess.domain.MoveParameter;
import chess.domain.Turn;
import chess.domain.board.Board;
import chess.domain.player.Player;
import chess.domain.result.Status;

public class RunningState implements State {

    public static final double DEFAULT = 0d;

    private Board board;

    public RunningState(Board board) {
        this.board = board;
    }

    @Override
    public State start() {
        throw new UnsupportedOperationException("이미 게임이 시작되었습니다.");
    }

    @Override
    public State move(MoveParameter moveParameter, Turn turn) {
        board.move(moveParameter.getSource(), moveParameter.getTarget(), turn);
        if (board.isLost(Player.WHITE)) {
            return new EndState(board, Player.BLACK);
        }
        if (board.isLost(Player.BLACK)) {
            return new EndState(board, Player.WHITE);
        }
        return this;
    }

    @Override
    public State end() {
        return new EndState(board);
    }

    @Override
    public State status() {
        throw new UnsupportedOperationException("게임이 아직 종료되지 않았습니다.");
    }

    @Override
    public Status getStatus() {
        throw new UnsupportedOperationException("게임이 아직 종료되지 않았습니다.");
    }

    @Override
    public Player getWinner() {
        throw new UnsupportedOperationException("게임이 아직 종료되지 않았습니다.");
    }

    @Override
    public Board getBoard() {
        return board;
    }

    @Override
    public boolean isEnd() {
        return false;
    }
}
