package chess.domain.state;

import chess.controller.dto.ResponseDto;
import chess.domain.board.Board;

import java.util.List;

public class Finished extends Started {

    public Finished(Board board) {
        super(board);
    }

    @Override
    public boolean isEnd() {
        return true;
    }

    @Override
    public ChessGameState start() {
        ChessGameState nextState = new Ready();
        return nextState.start();
    }

    @Override
    public ChessGameState move(List<String> parameters) {
        throw new UnsupportedOperationException("게임이 종료되었습니다.");
    }

    @Override
    public ChessGameState end() {
        throw new UnsupportedOperationException("게임이 이미 종료되었습니다.");
    }

    @Override
    public ResponseDto getResponse() {
        return new ResponseDto(board.getDto());
    }
}
