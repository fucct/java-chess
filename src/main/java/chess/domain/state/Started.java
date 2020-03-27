package chess.domain.state;

import chess.controller.dto.ResponseDto;

public class Started extends Ready {
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
        return null;
    }
}
