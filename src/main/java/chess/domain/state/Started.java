package chess.domain.state;

import chess.controller.dto.ResponseDto;
import chess.domain.board.Board;

public class Started extends Ready {
    private final Board board;

    public Started(Board board) {
        this.board = board;
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
    public ChessGameState end() {
        return null;
    }

    @Override
    public ResponseDto getResponse() {
        return new ResponseDto(board.getDto());
    }
}
