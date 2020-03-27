package chess.domain.state;

import chess.controller.dto.ResponseDto;
import chess.domain.board.Board;

public class Ready implements ChessGameState {
    private final Board board;

    public Ready() {
        this.board = BoardRepository.of();
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public ChessGameState start() {
        return new Started();
    }

    @Override
    public ChessGameState end() {
        throw new UnsupportedOperationException("게임이 아직 시작되지 않았습니다.");
    }

    @Override
    public ResponseDto getResponse() {
        return null;
    }
}
