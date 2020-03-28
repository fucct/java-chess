package chess.domain.state;

import chess.controller.dto.ResponseDto;
import chess.domain.Player.Player;
import chess.domain.Turn;
import chess.domain.board.Board;
import chess.domain.board.position.Position;

import java.util.List;

public class Started extends Ready {
    protected final Board board;
    private Turn turn;

    public Started(Board board) {
        this.board = board;
        this.turn = new Turn(Player.WHITE);
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public ChessGameState start() {
        throw new UnsupportedOperationException("이미 게임이 시작되었습니다.");
    }

    @Override
    public ChessGameState move(List<String> parameters) {
        Position source = Position.of(parameters.get(0));
        Position target = Position.of(parameters.get(1));
        board.move(source, target, turn);
        return this;
    }

    @Override
    public ChessGameState end() {
        return new Finished(board);
    }

    @Override
    public ResponseDto getResponse() {
        return new ResponseDto(board.getDto());
    }
}
